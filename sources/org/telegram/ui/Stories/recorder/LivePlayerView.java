package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

public class LivePlayerView extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {
    private final TextureView blurRenderer;
    private int currentAccount;
    private long dialogId;
    public final EmptyView emptyView;
    private Runnable firstFrameCallback;
    private boolean firstFrameRendered;
    private boolean ignoreLayout;
    private boolean isEmptyViewVisible;
    private float keyboardOffset;
    private View placeholderView;
    private PeerStoriesView.VideoPlayerSharedScope scope;
    public final SurfaceViewRenderer surfaceView;
    public final TextureViewRenderer textureView;
    private boolean textureVisible;
    public final BackupImageView thumb;

    @Override
    public void onFrameResolutionChanged(int i, int i2, int i3) {
    }

    public LivePlayerView(Context context, int i, boolean z) {
        super(context);
        this.currentAccount = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.thumb = backupImageView;
        backupImageView.setAlpha(0.75f);
        addView(backupImageView, LayoutHelper.createFrame(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.blurRenderer = textureView;
        addView(textureView, LayoutHelper.createFrame(-1, -1, 119));
        if (z) {
            SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(context);
            this.surfaceView = surfaceViewRenderer;
            addView(surfaceViewRenderer, LayoutHelper.createFrame(-1, -1, 119));
            surfaceViewRenderer.setAlpha(1.0f);
            this.textureView = null;
        } else {
            TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
            this.textureView = textureViewRenderer;
            textureViewRenderer.setOpaque(false);
            textureViewRenderer.setEnableHardwareScaler(true);
            textureViewRenderer.setIsCamera(true);
            textureViewRenderer.setRotateTextureWithScreen(true);
            textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(textureViewRenderer, LayoutHelper.createFrame(-1, -1, 119));
            textureViewRenderer.setAlpha(1.0f);
            this.surfaceView = null;
        }
        EmptyView emptyView = new EmptyView(context);
        this.emptyView = emptyView;
        emptyView.setAlpha(0.0f);
        emptyView.setVisibility(8);
        addView(emptyView, LayoutHelper.createFrame(-1, -1, 119));
    }

    public View getPlaceholderView() {
        if (this.placeholderView == null) {
            View view = new View(getContext());
            this.placeholderView = view;
            addView(view, LayoutHelper.createFrameMatchParent());
        }
        return this.placeholderView;
    }

    public void setAccount(int i) {
        if (this.currentAccount == i) {
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
            int i2 = NotificationCenter.liveStoryUpdated;
            notificationCenter.removeObserver(this, i2);
            this.currentAccount = i;
            NotificationCenter.getInstance(i).addObserver(this, i2);
            return;
        }
        this.currentAccount = i;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            this.textureView.setBackgroundRenderer(this.blurRenderer);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.firstFrameRendered = false;
        setTextureVisible(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.firstFrameCallback = runnable;
    }

    @Override
    public void onFirstFrameRendered() {
        if (!this.firstFrameRendered) {
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = this.scope;
            if (videoPlayerSharedScope != null && !videoPlayerSharedScope.firstFrameRendered) {
                videoPlayerSharedScope.firstFrameRendered = true;
                videoPlayerSharedScope.invalidate();
            }
            this.firstFrameRendered = true;
        }
        setTextureVisible(true, true);
        Runnable runnable = this.firstFrameCallback;
        if (runnable != null) {
            runnable.run();
            this.firstFrameCallback = null;
        }
    }

    public void release() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.firstFrameRendered = false;
        setTextureVisible(false, false);
    }

    public void setScope(long j, PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope) {
        LivePlayerView$$ExternalSyntheticLambda0 livePlayerView$$ExternalSyntheticLambda0;
        LivePlayer livePlayer;
        LivePlayer livePlayer2;
        int dp;
        int width;
        if (videoPlayerSharedScope == null) {
            long j2 = this.dialogId;
            if (j2 != 0 && this.firstFrameRendered && this.textureView != null) {
                File file = new File(FileLoader.getDirectory(4), "live" + j2 + ".jpg");
                Bitmap bitmap = this.textureView.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = AndroidUtilities.dp(100.0f);
                        dp = (int) ((bitmap.getHeight() / bitmap.getWidth()) * AndroidUtilities.dp(100.0f));
                    } else {
                        dp = AndroidUtilities.dp(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * AndroidUtilities.dp(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, dp, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, AndroidUtilities.dp(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
        if (this.dialogId != j) {
            if (j == 0) {
                this.thumb.clearImage();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), "live" + j + ".jpg").getAbsolutePath();
                if (j > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                    ImageLocation forUser = ImageLocation.getForUser(user, 1);
                    int colorForId = user != null ? AvatarDrawable.getColorForId(user.id) : ColorUtils.blendARGB(-16777216, -1, 0.2f);
                    this.thumb.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_isc", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(colorForId, -16777216, 0.2f), ColorUtils.blendARGB(colorForId, -16777216, 0.4f)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                    ImageLocation forChat = ImageLocation.getForChat(chat, 1);
                    int colorForId2 = chat != null ? AvatarDrawable.getColorForId(chat.id) : ColorUtils.blendARGB(-16777216, -1, 0.2f);
                    this.thumb.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_isc", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(colorForId2, -16777216, 0.2f), ColorUtils.blendARGB(colorForId2, -16777216, 0.4f)}), 0L, null, chat, 0);
                }
            }
        }
        this.dialogId = j;
        this.scope = videoPlayerSharedScope;
        if (this.firstFrameRendered && videoPlayerSharedScope != null && !videoPlayerSharedScope.firstFrameRendered) {
            videoPlayerSharedScope.firstFrameRendered = true;
            videoPlayerSharedScope.invalidate();
        }
        boolean z = (videoPlayerSharedScope == null || (livePlayer2 = videoPlayerSharedScope.livePlayer) == null || !livePlayer2.isEmptyStream()) ? false : true;
        if (videoPlayerSharedScope == null || (livePlayer = videoPlayerSharedScope.livePlayer) == null || !livePlayer.canContinueEmptyStream()) {
            livePlayerView$$ExternalSyntheticLambda0 = null;
        } else {
            LivePlayer livePlayer3 = videoPlayerSharedScope.livePlayer;
            Objects.requireNonNull(livePlayer3);
            livePlayerView$$ExternalSyntheticLambda0 = new LivePlayerView$$ExternalSyntheticLambda0(livePlayer3);
        }
        setIsEmpty(z, livePlayerView$$ExternalSyntheticLambda0);
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    public boolean isAvailable() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        return this.surfaceView != null;
    }

    public Bitmap getBitmap() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer.getBitmap();
        }
        return null;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        LivePlayer livePlayer;
        LivePlayerView$$ExternalSyntheticLambda0 livePlayerView$$ExternalSyntheticLambda0;
        if (i == NotificationCenter.liveStoryUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = this.scope;
            if (videoPlayerSharedScope == null || (livePlayer = videoPlayerSharedScope.livePlayer) == null || livePlayer.getCallId() != longValue) {
                return;
            }
            boolean isEmptyStream = this.scope.livePlayer.isEmptyStream();
            if (this.scope.livePlayer.canContinueEmptyStream()) {
                LivePlayer livePlayer2 = this.scope.livePlayer;
                Objects.requireNonNull(livePlayer2);
                livePlayerView$$ExternalSyntheticLambda0 = new LivePlayerView$$ExternalSyntheticLambda0(livePlayer2);
            } else {
                livePlayerView$$ExternalSyntheticLambda0 = null;
            }
            setIsEmpty(isEmptyStream, livePlayerView$$ExternalSyntheticLambda0);
        }
    }

    public void reset() {
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.clearImage();
        }
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.clearImage();
        }
        this.firstFrameRendered = false;
        setTextureVisible(false, false);
    }

    public void setSecure(boolean z) {
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z);
        }
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.ignoreLayout = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.ignoreLayout = false;
        super.onMeasure(i, i2);
        View view = this.textureView;
        if (view == null) {
            view = this.surfaceView;
        }
        this.blurRenderer.getLayoutParams().width = view.getMeasuredWidth();
        this.blurRenderer.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i, i2);
        TextureViewRenderer textureViewRenderer2 = this.textureView;
        if (textureViewRenderer2 != null) {
            textureViewRenderer2.updateRotation();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.thumb.layout(0, 0, i5, i6);
        this.emptyView.layout(0, 0, i5, i6);
        View view = this.placeholderView;
        if (view != null) {
            view.layout(0, 0, i5, i6);
        }
        TextureView textureView = this.blurRenderer;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), this.blurRenderer.getMeasuredHeight());
        View view2 = this.textureView;
        if (view2 == null) {
            view2 = this.surfaceView;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        updateTranslations();
    }

    private void updateTranslations() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        View view = this.textureView;
        if (view == null) {
            view = this.surfaceView;
        }
        int measuredWidth2 = this.blurRenderer.getMeasuredWidth();
        int measuredHeight2 = this.blurRenderer.getMeasuredHeight();
        this.blurRenderer.setPivotX(0.0f);
        this.blurRenderer.setPivotY(0.0f);
        float f = measuredWidth;
        float f2 = measuredWidth2;
        float f3 = measuredHeight;
        float f4 = measuredHeight2;
        float max = Math.max(f / f2, f3 / f4);
        this.blurRenderer.setScaleX(max);
        this.blurRenderer.setScaleY(max);
        this.blurRenderer.setTranslationX((f - (f2 * max)) / 2.0f);
        this.blurRenderer.setTranslationY(((f3 - (f4 * max)) / 2.0f) - (this.keyboardOffset / 2.0f));
        float measuredWidth3 = view.getMeasuredWidth();
        float measuredHeight3 = view.getMeasuredHeight();
        float max2 = Math.max(measuredWidth3 / f, measuredHeight3 / f3);
        view.setScaleX(max2);
        view.setScaleY(max2);
        view.setTranslationX((f - (measuredWidth3 * max2)) / 2.0f);
        view.setTranslationY(((f3 - (measuredHeight3 * max2)) / 2.0f) - (this.keyboardOffset / 2.0f));
    }

    public void setKeyboardOffset(float f) {
        this.keyboardOffset = f;
        updateTranslations();
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureViewRenderer textureViewRenderer = this.textureView;
            if (view == textureViewRenderer) {
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(this.textureView.getX(), this.textureView.getY());
                    canvas.scale((this.textureView.getWidth() * this.textureView.getScaleX()) / bitmap.getWidth(), (this.textureView.getHeight() * this.textureView.getScaleY()) / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
            TextureView textureView = this.blurRenderer;
            if (view == textureView) {
                Bitmap bitmap2 = textureView.getBitmap();
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(this.blurRenderer.getX(), this.blurRenderer.getY());
                    canvas.scale((this.blurRenderer.getWidth() * this.blurRenderer.getScaleX()) / bitmap2.getWidth(), (this.blurRenderer.getHeight() * this.blurRenderer.getScaleY()) / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureView textureView = this.blurRenderer;
            if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.blurRenderer.getX(), this.blurRenderer.getY());
            canvas.scale((this.blurRenderer.getWidth() * this.blurRenderer.getScaleX()) / bitmap.getWidth(), (this.blurRenderer.getHeight() * this.blurRenderer.getScaleY()) / bitmap.getHeight());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setIsEmpty(final boolean z, final Runnable runnable) {
        if (this.isEmptyViewVisible == z) {
            return;
        }
        this.isEmptyViewVisible = z;
        this.emptyView.setVisibility(0);
        this.emptyView.animate().alpha(this.isEmptyViewVisible ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                LivePlayerView.this.lambda$setIsEmpty$0(z);
            }
        }).start();
        this.emptyView.buttonView.setVisibility((!z || runnable == null) ? 8 : 0);
        this.emptyView.buttonView.setOnClickListener(runnable == null ? null : new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                runnable.run();
            }
        });
    }

    public void lambda$setIsEmpty$0(boolean z) {
        this.emptyView.setVisibility(z ? 0 : 8);
    }

    public void setTextureVisible(boolean z, boolean z2) {
        if (this.textureVisible == z && z2) {
            return;
        }
        if (z2) {
            getTextureView().animate().alpha(z ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
        } else {
            getTextureView().animate().cancel();
            getTextureView().setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public static class EmptyView extends FrameLayout {
        public final ButtonWithCounterView buttonView;
        private boolean hasSetImage;
        public final BackupImageView imageView;
        public final LinearLayout layout;
        public final TextView textView;

        public static void lambda$new$0(View view) {
        }

        public EmptyView(Context context) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(130, 130, 1));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(-1);
            textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
            this.buttonView = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear((int) ((buttonWithCounterView.text.getWidth() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LivePlayerView.EmptyView.lambda$new$0(view);
                }
            });
            setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0 || this.hasSetImage) {
                return;
            }
            this.imageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty2, "utyan_empty2", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            this.hasSetImage = true;
        }
    }
}
