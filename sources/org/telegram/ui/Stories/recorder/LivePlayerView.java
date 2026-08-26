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
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
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
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda13;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda5;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

public final class LivePlayerView extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {
    public final TextureView blurRenderer;
    public int currentAccount;
    public long dialogId;
    public final EmptyView emptyView;
    public Runnable firstFrameCallback;
    public boolean firstFrameRendered;
    public boolean ignoreLayout;
    public boolean isEmptyViewVisible;
    public float keyboardOffset;
    public View placeholderView;
    public PeerStoriesView.VideoPlayerSharedScope scope;
    public final TextureViewRenderer textureView;
    public final BackupImageView thumb;

    public final class EmptyView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public final ButtonWithCounterView buttonView;
        public boolean hasSetImage;
        public final BackupImageView imageView;

        public EmptyView(Context context) {
            super(context);
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            linearLayoutM.addView(backupImageView, LayoutHelper.createLinear(130, 130, 1));
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null, true);
            this.buttonView = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = buttonWithCounterView.text;
            linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear((int) ((Math.max(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth) + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
            buttonWithCounterView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(23));
            setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0 || this.hasSetImage) {
                return;
            }
            this.imageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty2, "utyan_empty2", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f), true, null));
            this.hasSetImage = true;
        }
    }

    public LivePlayerView(Context context, int i) {
        super(context);
        this.currentAccount = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.thumb = backupImageView;
        backupImageView.setAlpha(0.75f);
        addView(backupImageView, LayoutHelper.createFrame(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.blurRenderer = textureView;
        addView(textureView, LayoutHelper.createFrame(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.textureView = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, LayoutHelper.createFrame(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        EmptyView emptyView = new EmptyView(context);
        this.emptyView = emptyView;
        emptyView.setAlpha(0.0f);
        emptyView.setVisibility(8);
        addView(emptyView, LayoutHelper.createFrame(-1, -1, 119));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        LivePlayer livePlayer;
        TLRPC.GroupCall groupCall;
        if (i == NotificationCenter.liveStoryUpdated) {
            boolean z = false;
            long jLongValue = ((Long) objArr[0]).longValue();
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = this.scope;
            if (videoPlayerSharedScope == null || (livePlayer = videoPlayerSharedScope.livePlayer) == null || livePlayer.getCallId() != jLongValue) {
                return;
            }
            LivePlayer livePlayer2 = this.scope.livePlayer;
            boolean z2 = livePlayer2.destroyed;
            if (!z2 && livePlayer2.emptyStream) {
                z = true;
            }
            setIsEmpty((z2 || livePlayer2.outgoing || !livePlayer2.emptyStream || LivePlayer.recording != null || (groupCall = livePlayer2.call) == null || groupCall.rtmp_stream || !groupCall.creator) ? null : new LivePlayer$$ExternalSyntheticLambda13(livePlayer2, 12), z);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!AndroidUtilities.makingGlobalBlurBitmap) {
            super.draw(canvas);
            return;
        }
        TextureView textureView = this.blurRenderer;
        if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        canvas.save();
        canvas.translate(textureView.getX(), textureView.getY());
        canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureViewRenderer textureViewRenderer = this.textureView;
            if (view == textureViewRenderer) {
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(textureViewRenderer.getX(), textureViewRenderer.getY());
                    canvas.scale((textureViewRenderer.getScaleX() * textureViewRenderer.getWidth()) / bitmap.getWidth(), (textureViewRenderer.getScaleY() * textureViewRenderer.getHeight()) / bitmap.getHeight());
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
                    canvas.translate(textureView.getX(), textureView.getY());
                    canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap2.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public Bitmap getBitmap() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.placeholderView == null) {
            View view = new View(getContext());
            this.placeholderView = view;
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
        }
        return this.placeholderView;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.blurRenderer);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.firstFrameRendered = false;
        setTextureVisible(false, false);
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
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

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.thumb.layout(0, 0, i5, i6);
        this.emptyView.layout(0, 0, i5, i6);
        View view = this.placeholderView;
        if (view != null) {
            view.layout(0, 0, i5, i6);
        }
        TextureView textureView = this.blurRenderer;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer == null) {
            textureViewRenderer = null;
        }
        textureViewRenderer.layout(0, 0, textureViewRenderer.getMeasuredWidth(), textureViewRenderer.getMeasuredHeight());
        updateTranslations();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.ignoreLayout = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.ignoreLayout = false;
        super.onMeasure(i, i2);
        TextureViewRenderer textureViewRenderer2 = textureViewRenderer != null ? textureViewRenderer : null;
        TextureView textureView = this.blurRenderer;
        textureView.getLayoutParams().width = textureViewRenderer2.getMeasuredWidth();
        textureView.getLayoutParams().height = textureViewRenderer2.getMeasuredHeight();
        super.onMeasure(i, i2);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i) {
        if (this.currentAccount == i) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.currentAccount = i;
            return;
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i2 = NotificationCenter.liveStoryUpdated;
        notificationCenter.removeObserver(this, i2);
        this.currentAccount = i;
        NotificationCenter.getInstance(i).addObserver(this, i2);
    }

    public final void setIsEmpty(Runnable runnable, boolean z) {
        if (this.isEmptyViewVisible == z) {
            return;
        }
        this.isEmptyViewVisible = z;
        EmptyView emptyView = this.emptyView;
        emptyView.setVisibility(0);
        emptyView.animate().alpha(this.isEmptyViewVisible ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(new TodoItemMenu$$ExternalSyntheticLambda5(12, this, z)).start();
        ButtonWithCounterView buttonWithCounterView = emptyView.buttonView;
        buttonWithCounterView.setVisibility((!z || runnable == null) ? 8 : 0);
        buttonWithCounterView.setOnClickListener(runnable == null ? null : new ProfileActivity$$ExternalSyntheticLambda51(10, runnable));
    }

    public void setKeyboardOffset(float f) {
        this.keyboardOffset = f;
        updateTranslations();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.firstFrameCallback = runnable;
    }

    public final void setScope(long j, PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope) {
        LivePlayer livePlayer;
        TLRPC.GroupCall groupCall;
        LivePlayer livePlayer2;
        TextureViewRenderer textureViewRenderer;
        int iDp;
        int width;
        if (videoPlayerSharedScope == null) {
            long j2 = this.dialogId;
            if (j2 != 0 && this.firstFrameRendered && (textureViewRenderer = this.textureView) != null) {
                File file = new File(FileLoader.getDirectory(4), RendererCapabilities.CC.m(j2, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = AndroidUtilities.dp(100.0f);
                        iDp = (int) ((bitmap.getHeight() / bitmap.getWidth()) * AndroidUtilities.dp(100.0f));
                    } else {
                        iDp = AndroidUtilities.dp(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * AndroidUtilities.dp(100.0f));
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iDp, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(bitmapCreateBitmap, AndroidUtilities.dp(4.0f));
                    try {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
        if (this.dialogId != j) {
            BackupImageView backupImageView = this.thumb;
            if (j == 0) {
                backupImageView.imageReceiver.clearImage();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), RendererCapabilities.CC.m(j, "live", ".jpg")).getAbsolutePath();
                if (j > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                    ImageLocation forUser = ImageLocation.getForUser(this.currentAccount, user, 1);
                    int colorForId = user != null ? AvatarDrawable.getColorForId(user.id) : ColorUtils.blendARGB(0.2f, -16777216, -1);
                    backupImageView.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(0.2f, colorForId, -16777216), ColorUtils.blendARGB(0.4f, colorForId, -16777216)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                    ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
                    int colorForId2 = chat != null ? AvatarDrawable.getColorForId(chat.id) : ColorUtils.blendARGB(0.2f, -16777216, -1);
                    backupImageView.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(0.2f, colorForId2, -16777216), ColorUtils.blendARGB(0.4f, colorForId2, -16777216)}), 0L, null, chat, 0);
                }
            }
        }
        this.dialogId = j;
        this.scope = videoPlayerSharedScope;
        if (this.firstFrameRendered && videoPlayerSharedScope != null && !videoPlayerSharedScope.firstFrameRendered) {
            videoPlayerSharedScope.firstFrameRendered = true;
            videoPlayerSharedScope.invalidate();
        }
        setIsEmpty((videoPlayerSharedScope == null || (livePlayer = videoPlayerSharedScope.livePlayer) == null || livePlayer.destroyed || livePlayer.outgoing || !livePlayer.emptyStream || LivePlayer.recording != null || (groupCall = livePlayer.call) == null || groupCall.rtmp_stream || !groupCall.creator) ? null : new LivePlayer$$ExternalSyntheticLambda13(livePlayer, 12), (videoPlayerSharedScope == null || (livePlayer2 = videoPlayerSharedScope.livePlayer) == null || livePlayer2.destroyed || !livePlayer2.emptyStream) ? false : true);
    }

    public void setSecure(boolean z) {
    }

    public final void setTextureVisible(boolean z, boolean z2) {
        if (z || !z2) {
            if (z2) {
                OKLCH.m(getTextureView().animate().alpha(z ? 1.0f : 0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
            } else {
                getTextureView().animate().cancel();
                getTextureView().setAlpha(z ? 1.0f : 0.0f);
            }
        }
    }

    public final void updateTranslations() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer == null) {
            textureViewRenderer = null;
        }
        TextureView textureView = this.blurRenderer;
        int measuredWidth2 = textureView.getMeasuredWidth();
        int measuredHeight2 = textureView.getMeasuredHeight();
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        float f = measuredWidth;
        float f2 = measuredWidth2;
        float f3 = measuredHeight;
        float f4 = measuredHeight2;
        float fMax = Math.max(f / f2, f3 / f4);
        textureView.setScaleX(fMax);
        textureView.setScaleY(fMax);
        textureView.setTranslationX((f - (f2 * fMax)) / 2.0f);
        textureView.setTranslationY(SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(f4, fMax, f3, 2.0f) - (this.keyboardOffset / 2.0f));
        float measuredWidth3 = textureViewRenderer.getMeasuredWidth();
        float measuredHeight3 = textureViewRenderer.getMeasuredHeight();
        float fMax2 = Math.max(measuredWidth3 / f, measuredHeight3 / f3);
        textureViewRenderer.setScaleX(fMax2);
        textureViewRenderer.setScaleY(fMax2);
        textureViewRenderer.setTranslationX((f - (measuredWidth3 * fMax2)) / 2.0f);
        textureViewRenderer.setTranslationY(((f3 - (measuredHeight3 * fMax2)) / 2.0f) - (this.keyboardOffset / 2.0f));
    }
}
