package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ProfileMetaballView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.ProfileActivity;

public class ProfileGalleryBlurView extends View {
    public int actionSize;
    private RenderNode actionsBlurNode;
    private ProfileActionsView actionsView;
    private final AnimatedFloat alpha;
    private RenderNode blurNode;
    private final Runnable blurTask;
    private final ProfileMetaballView.BlurBitmapHolder[] currentFrame;
    private int currentPosition;
    private int frameHeight;
    private int frameWidth;
    private final Runnable invalidateTask;
    private volatile boolean isBluring;
    private final ViewPager.OnPageChangeListener listener;
    private final SizeNotifierFrameLayout.IViewWithInvalidateCallback[] listeners;
    private final Object lock;
    private boolean loopInvalidate;
    private ProfileMusicView musicView;
    private boolean needNewFrame;
    private final ProfileMetaballView.BlurBitmapHolder[] nextFrame;
    private int offset;
    private final Paint[] paints;
    private boolean shouldBlurActions;
    public int size;
    private boolean sizeChanged;
    private ProfileSuggestionView suggestionView;
    private boolean usingRenderNode;
    private ProfileGalleryView view;

    public ProfileGalleryBlurView(Context context) {
        super(context);
        this.usingRenderNode = Build.VERSION.SDK_INT >= 31;
        this.lock = new Object();
        this.nextFrame = new ProfileMetaballView.BlurBitmapHolder[3];
        this.currentFrame = new ProfileMetaballView.BlurBitmapHolder[3];
        this.isBluring = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.paints = paintArr;
        this.blurTask = new Runnable() {
            @Override
            public final void run() {
                this.f$0.doBlur();
            }
        };
        this.invalidateTask = new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateContent();
            }
        };
        this.currentPosition = -1;
        this.loopInvalidate = false;
        this.sizeChanged = false;
        this.needNewFrame = false;
        this.listeners = new SizeNotifierFrameLayout.IViewWithInvalidateCallback[3];
        AnimatedFloat animatedFloat = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.DEFAULT);
        this.alpha = animatedFloat;
        this.listener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i) {
            }

            @Override
            public void onPageSelected(int i) {
            }

            @Override
            public void onPageScrolled(int i, float f, int i2) {
                if (!ProfileGalleryBlurView.this.usingRenderNode && Math.abs(i - ProfileGalleryBlurView.this.currentPosition) == 1) {
                    if (i > ProfileGalleryBlurView.this.currentPosition) {
                        ProfileGalleryBlurView.this.swap(0, 1, 1);
                    } else if (i < ProfileGalleryBlurView.this.currentPosition) {
                        ProfileGalleryBlurView.this.swap(1, 0, 0);
                        ProfileGalleryBlurView.this.swap(2, 0, -1);
                    }
                }
                int i3 = ProfileGalleryBlurView.this.currentPosition;
                int i4 = ProfileGalleryBlurView.this.offset;
                ProfileGalleryBlurView.this.currentPosition = i;
                ProfileGalleryBlurView.this.offset = i2;
                if (i3 == ProfileGalleryBlurView.this.currentPosition && i4 == ProfileGalleryBlurView.this.offset) {
                    return;
                }
                ProfileGalleryBlurView.this.updateContent();
            }
        };
        animatedFloat.set(1.0f, true);
        boolean z = this.usingRenderNode & SharedConfig.useNewBlur;
        this.usingRenderNode = z;
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.size + this.actionSize);
    }

    public void restartAlpha() {
        if (this.usingRenderNode) {
            this.alpha.set(0.0f, true);
            invalidate();
        }
    }

    public boolean isUsingRenderNode() {
        return this.usingRenderNode;
    }

    public void setActionsView(ProfileActionsView profileActionsView) {
        this.actionsView = profileActionsView;
    }

    public void setSuggestionView(ProfileSuggestionView profileSuggestionView) {
        this.suggestionView = profileSuggestionView;
    }

    public void setMusicView(ProfileMusicView profileMusicView) {
        this.musicView = profileMusicView;
    }

    public void swap(int i, int i2, int i3) {
        synchronized (this.lock) {
            try {
                ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr = this.nextFrame;
                ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = blurBitmapHolderArr[i];
                blurBitmapHolderArr[i] = blurBitmapHolderArr[i2];
                blurBitmapHolderArr[i2] = blurBitmapHolder;
                ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr2 = this.currentFrame;
                ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = blurBitmapHolderArr2[i];
                blurBitmapHolderArr2[i] = blurBitmapHolderArr2[i2];
                blurBitmapHolderArr2[i2] = blurBitmapHolder2;
                if (i == 2) {
                    if (blurBitmapHolder2.hasContent) {
                        applyShader(blurBitmapHolder2.bitmap, i2);
                    }
                } else {
                    Paint[] paintArr = this.paints;
                    Paint paint = paintArr[i];
                    paintArr[i] = paintArr[i2];
                    paintArr[i2] = paint;
                }
                if (i3 != -1) {
                    this.paints[i3].setShader(null);
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder3 = this.nextFrame[i3];
                    if (blurBitmapHolder3 != null && !blurBitmapHolder3.isBusy) {
                        blurBitmapHolder3.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateContent() {
        this.needNewFrame = true;
        postInvalidateOnAnimation();
    }

    public void notifyUpdateSize() {
        this.sizeChanged = true;
        postInvalidateOnAnimation();
    }

    public void setSize(int i) {
        if (i > 0) {
            i += AndroidUtilities.dp(6.0f);
        }
        if (this.actionSize != i) {
            invalidate();
        }
        this.actionSize = i;
        this.size = AndroidUtilities.dp(64.0f) * 2;
    }

    public void setView(ProfileGalleryView profileGalleryView) {
        destroy();
        this.view = profileGalleryView;
        this.currentPosition = profileGalleryView.getCurrentItem();
        this.offset = 0;
        profileGalleryView.addOnPageChangeListener(this.listener);
    }

    public void destroy() {
        ProfileGalleryView profileGalleryView = this.view;
        if (profileGalleryView != null) {
            profileGalleryView.removeOnPageChangeListener(this.listener);
            this.view = null;
        }
        this.isBluring = false;
        ProfileMetaballView.profileBlurQueue.cancelRunnable(this.blurTask);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.blurNode;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.blurNode = null;
            }
            RenderNode renderNode2 = this.actionsBlurNode;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.actionsBlurNode = null;
            }
        }
        this.actionsView = null;
        this.suggestionView = null;
        this.musicView = null;
        synchronized (this.lock) {
            for (int i = 0; i < 3; i++) {
                try {
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i];
                    if (blurBitmapHolder != null) {
                        blurBitmapHolder.recycle();
                        this.nextFrame[i] = null;
                    }
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = this.currentFrame[i];
                    if (blurBitmapHolder2 != null) {
                        blurBitmapHolder2.recycle();
                        this.currentFrame[i] = null;
                    }
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = this.listeners[i];
                    if (iViewWithInvalidateCallback != null) {
                        iViewWithInvalidateCallback.listenInvalidate(null);
                        this.listeners[i] = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.paints[0].setShader(null);
            this.paints[1].setShader(null);
        }
    }

    public void doBlur() {
        ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr;
        synchronized (this.lock) {
            ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr2 = this.nextFrame;
            ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = blurBitmapHolderArr2[0];
            ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr3 = this.currentFrame;
            blurBitmapHolderArr = new ProfileMetaballView.BlurBitmapHolder[]{blurBitmapHolder, blurBitmapHolderArr3[0], blurBitmapHolderArr2[1], blurBitmapHolderArr3[1], blurBitmapHolderArr2[2], blurBitmapHolderArr3[2]};
        }
        boolean z = false;
        for (int i = 0; i < 6; i += 2) {
            ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = blurBitmapHolderArr[i];
            ProfileMetaballView.BlurBitmapHolder blurBitmapHolder3 = blurBitmapHolderArr[i + 1];
            if (blurBitmapHolder2 != null && !blurBitmapHolder2.destroying && blurBitmapHolder2.hasContent) {
                blurBitmapHolder2.lock();
                if (blurBitmapHolder3 == null || !blurBitmapHolder3.canUse(blurBitmapHolder2)) {
                    if (blurBitmapHolder3 != null) {
                        blurBitmapHolder3.recycle();
                    }
                    blurBitmapHolder3 = new ProfileMetaballView.BlurBitmapHolder(blurBitmapHolder2);
                    synchronized (this.lock) {
                        this.currentFrame[indexOf(blurBitmapHolder2)] = blurBitmapHolder3;
                    }
                }
                Bitmap bitmap = blurBitmapHolder2.bitmap;
                Utilities.stackBlurBitmap(bitmap, Math.max(10, bitmap.getWidth() / 180));
                synchronized (this.lock) {
                    blurBitmapHolder3.clear();
                    blurBitmapHolder3.canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    blurBitmapHolder3.ready();
                    applyShader(blurBitmapHolder3.bitmap, indexOf(blurBitmapHolder2));
                }
                blurBitmapHolder2.clear();
                blurBitmapHolder2.unlock();
                z = true;
            }
        }
        if (z && this.isBluring && this.view != null) {
            postInvalidateOnAnimation();
        }
        if (this.isBluring && (this.loopInvalidate || this.needNewFrame)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$doBlur$0();
                }
            });
        } else {
            this.isBluring = false;
        }
    }

    public void lambda$doBlur$0() {
        captureNextFrame();
        ProfileMetaballView.profileBlurQueue.postRunnable(this.blurTask);
    }

    private int indexOf(ProfileMetaballView.BlurBitmapHolder blurBitmapHolder) {
        int i = 0;
        while (true) {
            ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr = this.nextFrame;
            if (i >= blurBitmapHolderArr.length) {
                return 0;
            }
            if (blurBitmapHolderArr[i] == blurBitmapHolder) {
                return i;
            }
            i++;
        }
    }

    private boolean captureNextFrame() {
        SizeNotifierFrameLayout.IViewWithInvalidateCallback[] iViewWithInvalidateCallbackArr;
        ProfileGalleryView profileGalleryView = this.view;
        boolean z = false;
        if (profileGalleryView != null && !profileGalleryView.isZooming()) {
            int measuredWidth = (int) (this.view.getMeasuredWidth() / 6.0f);
            int i = (int) (this.size / 6.0f);
            if (measuredWidth > 0 && i > 0) {
                this.frameWidth = measuredWidth;
                this.frameHeight = i;
                int length = (!this.sizeChanged || this.needNewFrame) ? this.nextFrame.length : 1;
                this.sizeChanged = false;
                this.needNewFrame = false;
                for (int i2 = 0; i2 < length; i2++) {
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = this.listeners[i2];
                    if (iViewWithInvalidateCallback != null) {
                        iViewWithInvalidateCallback.listenInvalidate(null);
                    }
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i2];
                    if (blurBitmapHolder == null || !blurBitmapHolder.canUse(measuredWidth, i)) {
                        if (blurBitmapHolder != null) {
                            blurBitmapHolder.recycle();
                        }
                        this.nextFrame[i2] = new ProfileMetaballView.BlurBitmapHolder(measuredWidth, i);
                    }
                    if (this.nextFrame[i2].isBusy) {
                        if (length == 1) {
                            this.sizeChanged = true;
                        } else {
                            this.needNewFrame = true;
                        }
                    }
                }
                View itemViewAt = this.view.getItemViewAt(this.currentPosition);
                drawView(itemViewAt, 0);
                if (length == 1) {
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback2 = this.listeners[0];
                    if (iViewWithInvalidateCallback2 != null) {
                        iViewWithInvalidateCallback2.listenInvalidate(this.invalidateTask);
                    }
                    return !this.sizeChanged;
                }
                View itemViewAt2 = this.view.getItemViewAt(this.currentPosition + 1);
                drawView(itemViewAt2, 1);
                if (this.offset == 0) {
                    drawView(this.view.getItemViewAt(this.currentPosition - 1), 2);
                }
                int i3 = 0;
                while (true) {
                    iViewWithInvalidateCallbackArr = this.listeners;
                    if (i3 >= iViewWithInvalidateCallbackArr.length) {
                        break;
                    }
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback3 = iViewWithInvalidateCallbackArr[i3];
                    if (iViewWithInvalidateCallback3 != null) {
                        iViewWithInvalidateCallback3.listenInvalidate(this.invalidateTask);
                    }
                    i3++;
                }
                if ((itemViewAt != null && iViewWithInvalidateCallbackArr[0] == null) || (this.offset != 0 && itemViewAt2 != null && iViewWithInvalidateCallbackArr[1] == null)) {
                    z = true;
                }
                this.loopInvalidate = z;
                return true;
            }
        }
        return false;
    }

    private void drawView(View view, int i) {
        ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i];
        if (view != 0 && !blurBitmapHolder.isBusy) {
            Canvas canvas = blurBitmapHolder.canvas;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.size - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            blurBitmapHolder.ready();
        }
        if (i == 0 || (this.offset != 0 && i == 1)) {
            if (view instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback) {
                this.listeners[i] = (SizeNotifierFrameLayout.IViewWithInvalidateCallback) view;
            } else {
                this.listeners[i] = null;
            }
        }
    }

    private void applyShader(Bitmap bitmap, int i) {
        if (i >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.size / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.size}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.paints[i].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        draw(canvas, null, this.view.getMeasuredWidth(), this.view.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    public void draw(Canvas canvas, ProfileActivity.AvatarImageView avatarImageView, float f, float f2, boolean z, float f3, float f4) {
        ProfileGalleryView profileGalleryView = this.view;
        if (profileGalleryView == null || !profileGalleryView.isAttachedToWindow() || this.view.getVisibility() == 8) {
            return;
        }
        if (this.usingRenderNode && Build.VERSION.SDK_INT >= 31) {
            if (canvas.isHardwareAccelerated()) {
                if (avatarImageView == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                    drawRenderNode(canvas, f);
                    return;
                } else {
                    if (avatarImageView != null) {
                        drawOpeningRenderNode(avatarImageView, canvas, f, f2, f3, f4);
                        return;
                    }
                    return;
                }
            }
            if (avatarImageView != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.usingRenderNode = false;
            setLayerType(1, this.paints[0]);
            setLayerType(1, this.paints[1]);
        }
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView != null) {
            profileActionsView.drawingBlur(false);
        }
        ProfileSuggestionView profileSuggestionView = this.suggestionView;
        if (profileSuggestionView != null) {
            profileSuggestionView.drawingBlur(false);
        }
        ProfileMusicView profileMusicView = this.musicView;
        if (profileMusicView != null) {
            profileMusicView.drawingBlur(false);
        }
        if (this.needNewFrame || this.sizeChanged || this.loopInvalidate || (this.paints[0].getShader() == null && this.paints[1].getShader() == null && !this.isBluring)) {
            boolean zCaptureNextFrame = captureNextFrame();
            if (!this.isBluring && zCaptureNextFrame) {
                this.isBluring = true;
                DispatchQueue dispatchQueue = ProfileMetaballView.profileBlurQueue;
                dispatchQueue.cancelRunnable(this.blurTask);
                dispatchQueue.postRunnable(this.blurTask);
            }
        }
        if (this.paints[0].getShader() == null && this.paints[1].getShader() == null) {
            return;
        }
        synchronized (this.lock) {
            try {
                float f5 = f / this.frameWidth;
                if (z) {
                    canvas.translate(0.0f, (-f5) * this.frameHeight);
                }
                canvas.scale(f5, f5);
                float f6 = this.actionSize / f5;
                if (this.paints[0].getShader() != null) {
                    canvas.save();
                    canvas.translate((-this.offset) / f5, 0.0f);
                    canvas.save();
                    canvas.scale(1.0f, 2.0f, 0.0f, this.frameHeight);
                    float f7 = this.frameHeight;
                    canvas.drawRect(0.0f, f7, this.frameWidth, f7 + f6, this.paints[0]);
                    canvas.restore();
                    this.paints[0].setAlpha((int) (f4 * 255.0f));
                    float f8 = this.frameHeight;
                    canvas.drawRect(0.0f, f8 * f3, this.frameWidth, f8, this.paints[0]);
                    this.paints[0].setAlpha(255);
                    canvas.restore();
                }
                if (this.offset != 0 && this.paints[1].getShader() != null) {
                    canvas.save();
                    canvas.translate(((-this.offset) + f) / f5, 0.0f);
                    canvas.save();
                    canvas.scale(1.0f, 2.0f, 0.0f, this.frameHeight);
                    float f9 = this.frameHeight;
                    canvas.drawRect(0.0f, f9, this.frameWidth, f9 + f6, this.paints[1]);
                    canvas.restore();
                    this.paints[1].setAlpha((int) (f4 * 255.0f));
                    float f10 = this.frameHeight;
                    canvas.drawRect(0.0f, f10 * f3, this.frameWidth, f10, this.paints[1]);
                    this.paints[1].setAlpha(255);
                    canvas.restore();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initRenderNode() {
        if (this.blurNode == null) {
            float renderNodeScale = getRenderNodeScale();
            this.blurNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.size};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.size / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.blurNode.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
        }
    }

    private void initActionsRenderNode() {
        if (this.actionsView == null && this.suggestionView == null && this.musicView == null) {
            this.shouldBlurActions = false;
            return;
        }
        if (this.actionsBlurNode == null) {
            this.actionsBlurNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("profileActionsBlurNode");
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
            this.actionsBlurNode.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
        }
        this.shouldBlurActions = true;
    }

    public void drawRenderNode(Canvas canvas, float f) {
        initRenderNode();
        SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = this.listeners[0];
        if (iViewWithInvalidateCallback != null) {
            iViewWithInvalidateCallback.listenInvalidate(null);
        }
        SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback2 = this.listeners[1];
        if (iViewWithInvalidateCallback2 != null) {
            iViewWithInvalidateCallback2.listenInvalidate(null);
        }
        float renderNodeScale = getRenderNodeScale();
        this.blurNode.setPosition(0, 0, (int) (f / renderNodeScale), (int) ((this.size + this.actionSize) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
        float f2 = 1.0f / renderNodeScale;
        recordingCanvasBeginRecording.scale(f2, f2);
        recordingCanvasBeginRecording.save();
        recordingCanvasBeginRecording.translate(-this.offset, 0.0f);
        drawViewWithRenderNode(recordingCanvasBeginRecording, 0);
        recordingCanvasBeginRecording.restore();
        if (this.offset != 0) {
            recordingCanvasBeginRecording.save();
            recordingCanvasBeginRecording.translate((-this.offset) + f, 0.0f);
            drawViewWithRenderNode(recordingCanvasBeginRecording, 1);
            recordingCanvasBeginRecording.restore();
        }
        this.blurNode.endRecording();
        this.blurNode.setAlpha(this.alpha.set(1.0f));
        canvas.save();
        canvas.scale(renderNodeScale, renderNodeScale);
        canvas.drawRenderNode(this.blurNode);
        canvas.restore();
        if (getVisibility() != 0 || getAlpha() <= 0.0f) {
            return;
        }
        captureActionsBlurRenderNode(f, null, 1.0f, this.size);
    }

    private void drawViewWithRenderNode(Canvas canvas, int i) {
        View itemViewAt = this.view.getItemViewAt(this.currentPosition + i);
        if (itemViewAt != 0) {
            int measuredHeight = itemViewAt.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.size - measuredHeight);
            itemViewAt.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.size);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            itemViewAt.draw(canvas);
            canvas.restore();
        }
        if (itemViewAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback) {
            SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = (SizeNotifierFrameLayout.IViewWithInvalidateCallback) itemViewAt;
            this.listeners[i] = iViewWithInvalidateCallback;
            iViewWithInvalidateCallback.listenInvalidate(this.invalidateTask);
            return;
        }
        this.listeners[i] = null;
    }

    public void drawOpeningRenderNode(ProfileActivity.AvatarImageView avatarImageView, Canvas canvas, float f, float f2, float f3, float f4) {
        ImageReceiver imageReceiver;
        float measuredWidth = f / this.view.getMeasuredWidth();
        float f5 = this.size * (1.0f - f3);
        float f6 = f5 * measuredWidth;
        float renderNodeScale = getRenderNodeScale() * measuredWidth;
        initRenderNode();
        this.blurNode.setPosition(0, 0, (int) (f / renderNodeScale), (int) ((this.actionSize + f5) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
        float f7 = 1.0f / renderNodeScale;
        recordingCanvasBeginRecording.scale(f7, f7);
        AnimatedEmojiDrawable animatedEmojiDrawable = avatarImageView.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            imageReceiver = animatedEmojiDrawable.getImageReceiver();
        } else {
            imageReceiver = avatarImageView.imageReceiver;
        }
        drawOpeningImageRenderNode(imageReceiver, recordingCanvasBeginRecording, f6, f2);
        if (avatarImageView.drawForeground && avatarImageView.foregroundAlpha > 0.0f) {
            drawOpeningImageRenderNode(avatarImageView.foregroundImageReceiver, recordingCanvasBeginRecording, f6, f2);
        }
        this.blurNode.endRecording();
        this.blurNode.setAlpha(f4);
        canvas.translate(0.0f, -f6);
        canvas.scale(renderNodeScale, renderNodeScale);
        canvas.drawRenderNode(this.blurNode);
        captureActionsBlurRenderNode(f, avatarImageView, measuredWidth, f5);
    }

    private void captureActionsBlurRenderNode(float f, ProfileActivity.AvatarImageView avatarImageView, float f2, float f3) {
        initActionsRenderNode();
        if (!this.shouldBlurActions) {
            ProfileActionsView profileActionsView = this.actionsView;
            if (profileActionsView != null) {
                profileActionsView.drawingBlur(false);
            }
            ProfileSuggestionView profileSuggestionView = this.suggestionView;
            if (profileSuggestionView != null) {
                profileSuggestionView.drawingBlur(false);
            }
            ProfileMusicView profileMusicView = this.musicView;
            if (profileMusicView != null) {
                profileMusicView.drawingBlur(false);
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f2 * 8.0f;
        this.actionsBlurNode.setPosition(0, 0, (int) Math.ceil(f / renderNodeScale), (int) ((this.actionSize + f3) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.actionsBlurNode.beginRecording();
        recordingCanvasBeginRecording.scale(0.125f, 0.125f);
        recordingCanvasBeginRecording.drawRenderNode(this.blurNode);
        this.actionsBlurNode.endRecording();
        this.actionsBlurNode.setAlpha(this.alpha.set(1.0f));
        ProfileActionsView profileActionsView2 = this.actionsView;
        if (profileActionsView2 != null) {
            if (avatarImageView != null) {
                profileActionsView2.drawingBlur(this.actionsBlurNode, avatarImageView, renderNodeScale / f2, -f3);
            } else {
                profileActionsView2.drawingBlur(this.actionsBlurNode, null, renderNodeScale, -f3);
            }
        }
        ProfileSuggestionView profileSuggestionView2 = this.suggestionView;
        if (profileSuggestionView2 != null) {
            if (avatarImageView != null) {
                profileSuggestionView2.drawingBlur(this.actionsBlurNode, avatarImageView, renderNodeScale / f2, -f3);
            } else {
                profileSuggestionView2.drawingBlur(this.actionsBlurNode, null, renderNodeScale, -f3);
            }
        }
        ProfileMusicView profileMusicView2 = this.musicView;
        if (profileMusicView2 != null) {
            if (avatarImageView != null) {
                profileMusicView2.drawingBlur(this.actionsBlurNode, avatarImageView, renderNodeScale / f2, (-f3) + AndroidUtilities.dp(22.0f));
            } else {
                profileMusicView2.drawingBlur(this.actionsBlurNode, null, renderNodeScale, (-f3) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    private void drawOpeningImageRenderNode(ImageReceiver imageReceiver, Canvas canvas, float f, float f2) {
        if (imageReceiver == null) {
            return;
        }
        int i = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f - f2);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f2) - f);
        canvas.scale(1.0f, 2.0f, 0.0f, f2);
        imageReceiver.draw(canvas);
        canvas.restore();
        imageReceiver.setRoundRadius(i);
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (f == 0.0f || !this.usingRenderNode) {
            return;
        }
        invalidate();
    }

    private float getRenderNodeScale() {
        return AndroidUtilities.dp(1.0f);
    }

    private float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }
}
