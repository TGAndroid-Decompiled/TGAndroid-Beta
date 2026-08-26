package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.BlurSettingsBottomSheet;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.QrActivity;

public class SizeNotifierFrameLayout extends FrameLayout implements Theme.Colorable {
    public static DispatchQueue blurQueue;
    public static boolean drawingBlur;
    public AdjustPanLayoutHelper adjustPanLayoutHelper;
    public boolean attached;
    public Drawable backgroundDrawable;
    public boolean backgroundMotion;
    public int backgroundTranslationY;
    public QrActivity.AnonymousClass2 backgroundView;
    public final ActivityCompat.AnonymousClass1 blurBackgroundTask;
    public final ArrayList blurBehindViews;
    public ValueAnimator blurCrossfade;
    public float blurCrossfadeProgress;
    public boolean blurGeneratingTuskIsRunning;
    public boolean blurIsRunning;
    public final boolean[] blurNodeInvalidated;
    public final boolean[] blurNodeInvalidatedThisFrame;
    public RenderNode[] blurNodes;
    public final Paint blurPaintBottom;
    public final Paint blurPaintBottom2;
    public final Paint blurPaintTop;
    public final Paint blurPaintTop2;
    public int bottomClip;
    public int count;
    public int count2;
    public BlurBitmap currentBitmap;
    public SizeNotifierFrameLayoutDelegate delegate;
    public final ArrayList delegates;
    public float drawnBottomOffset;
    public int emojiHeight;
    public boolean invalidateBlur;
    public int keyboardHeight;
    public float lastDrawnBottomBlurOffset;
    public final ArrayList lastViews;
    public final Matrix matrix;
    public final Matrix matrix2;
    public boolean needBlur;
    public boolean occupyStatusBar;
    public Drawable oldBackgroundDrawable;
    public boolean oldBackgroundMotion;
    public WallpaperParallaxEffect parallaxEffect;
    public float parallaxScale;
    public final INavigationLayout parentLayout;
    public boolean paused;
    public BlurBitmap prevBitmap;
    public final Rect rect;
    public Paint selectedBlurPaint;
    public Paint selectedBlurPaint2;
    public boolean skipBackgroundDrawing;
    public SnowflakesEffect snowflakesEffect;
    public float themeAnimationValue;
    public int times;
    public float translationX;
    public float translationY;
    public final ArrayList unusedBitmaps;
    public final ArrayList views;

    public final class BlurBitmap {
        public int pixelFixOffset;
        public Bitmap topBitmap;
        public SimplerCanvas topCanvas;
        public float topScaleX;
        public float topScaleY;
    }

    public interface IViewWithInvalidateCallback {
        void listenInvalidate(Runnable runnable);
    }

    public final class SimplerCanvas extends Canvas {
        @Override
        public final boolean clipPath(Path path) {
            return false;
        }

        @Override
        public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        }

        @Override
        public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        }

        @Override
        public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public final boolean clipPath(Path path, Region.Op op) {
            return false;
        }

        @Override
        public final void drawText(String str, float f, float f2, Paint paint) {
        }

        @Override
        public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        }

        @Override
        public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        }

        @Override
        public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        }
    }

    public interface SizeNotifierFrameLayoutDelegate {
        void onSizeChanged(int i, boolean z);
    }

    public SizeNotifierFrameLayout(Context context, INavigationLayout iNavigationLayout) {
        super(context);
        this.rect = new Rect();
        this.delegates = new ArrayList();
        this.occupyStatusBar = true;
        this.parallaxScale = 1.0f;
        this.paused = true;
        this.unusedBitmaps = new ArrayList(10);
        this.blurBehindViews = new ArrayList();
        this.matrix = new Matrix();
        this.matrix2 = new Matrix();
        this.blurPaintTop = new Paint();
        this.blurPaintTop2 = new Paint();
        this.blurPaintBottom = new Paint();
        this.blurPaintBottom2 = new Paint();
        this.themeAnimationValue = 1.0f;
        this.blurBackgroundTask = new ActivityCompat.AnonymousClass1(this);
        this.blurNodeInvalidatedThisFrame = new boolean[2];
        this.blurNodeInvalidated = new boolean[2];
        this.lastViews = new ArrayList();
        this.views = new ArrayList();
        setWillNotDraw(false);
        this.parentLayout = iNavigationLayout;
        this.adjustPanLayoutHelper = null;
    }

    public static boolean DRAW_USING_RENDERNODE() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public static void access$1400(SizeNotifierFrameLayout sizeNotifierFrameLayout, Canvas canvas) {
        if (sizeNotifierFrameLayout.backgroundView != null && Theme.canStartHolidayAnimation && LiteMode.isEnabled(32)) {
            if (sizeNotifierFrameLayout.snowflakesEffect == null) {
                SnowflakesEffect snowflakesEffect = new SnowflakesEffect(1);
                sizeNotifierFrameLayout.snowflakesEffect = snowflakesEffect;
                snowflakesEffect.forcedColor = -1;
                if (snowflakesEffect.color != -1) {
                    snowflakesEffect.color = -1;
                    snowflakesEffect.particlePaint.setColor(-1);
                    snowflakesEffect.particleThinPaint.setColor(-1);
                }
            }
            sizeNotifierFrameLayout.snowflakesEffect.onDraw(canvas, sizeNotifierFrameLayout.backgroundView);
        }
    }

    public static float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int iDp;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            iDp = AndroidUtilities.dp(12.0f);
        } else {
            if (devicePerformanceClass == 2) {
                return AndroidUtilities.density;
            }
            iDp = AndroidUtilities.dp(15.0f);
        }
        return iDp;
    }

    public final void checkMotion() {
        if (!this.oldBackgroundMotion && !this.backgroundMotion) {
            WallpaperParallaxEffect wallpaperParallaxEffect = this.parallaxEffect;
            if (wallpaperParallaxEffect != null) {
                wallpaperParallaxEffect.setEnabled(false);
                this.parallaxEffect = null;
                this.parallaxScale = 1.0f;
                this.translationX = 0.0f;
                this.translationY = 0.0f;
                return;
            }
            return;
        }
        if (this.parallaxEffect == null) {
            WallpaperParallaxEffect wallpaperParallaxEffect2 = new WallpaperParallaxEffect(getContext());
            this.parallaxEffect = wallpaperParallaxEffect2;
            wallpaperParallaxEffect2.callback = new ProfileGooeyView$$ExternalSyntheticLambda0(this, 26);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                WallpaperParallaxEffect wallpaperParallaxEffect3 = this.parallaxEffect;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                wallpaperParallaxEffect3.getClass();
                float f = measuredWidth;
                float fDp = AndroidUtilities.dp(16.0f) * 2;
                float f2 = (f + fDp) / f;
                float f3 = measuredHeight;
                this.parallaxScale = Math.max(f2, (fDp + f3) / f3);
            }
        }
        if (this.paused) {
            return;
        }
        this.parallaxEffect.setEnabled(true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.blurNodeInvalidatedThisFrame;
        zArr[0] = false;
        zArr[1] = false;
        if (this.blurIsRunning) {
            startBlur();
        }
        super.dispatchDraw(canvas);
    }

    public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        drawBlurRect(canvas, f, rect, paint, z, Color.alpha(Theme.getColor((DRAW_USING_RENDERNODE() && SharedConfig.getDevicePerformanceClass() == 2) ? Theme.key_chat_BlurAlpha : Theme.key_chat_BlurAlphaSlow, getResourceProvider())));
    }

    public void drawList(Canvas canvas, ArrayList arrayList) {
    }

    public Drawable getBackgroundImage() {
        return this.backgroundDrawable;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.backgroundDrawable instanceof ChatBackgroundDrawable ? this.backgroundTranslationY : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            return this.backgroundTranslationY;
        }
        if (drawable instanceof ChatBackgroundDrawable) {
            return this.backgroundTranslationY;
        }
        return 0;
    }

    public float getBlurRadiusInternal() {
        return getBlurRadius();
    }

    public float getBottomOffset() {
        return getMeasuredHeight();
    }

    public int getBottomPadding() {
        return 0;
    }

    public float getBottomTranslation() {
        return 0.0f;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.keyboardHeight;
    }

    public int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        Drawable drawable = Theme.themedWallpaper;
        return drawable != null ? drawable : Theme.wallpaper;
    }

    public boolean getNewDrawableMotion() {
        return Theme.isWallpaperMotion;
    }

    public Theme.ResourcesProvider getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    public void invalidateBlur() {
        if (SharedConfig.chatBlurEnabled()) {
            this.invalidateBlur = true;
            if (!this.blurIsRunning || this.blurGeneratingTuskIsRunning) {
                return;
            }
            invalidate();
        }
    }

    public final void invalidateBlurredViews() {
        boolean[] zArr = this.blurNodeInvalidated;
        int i = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.blurBehindViews;
            if (i >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i)).invalidate();
            i++;
        }
    }

    public boolean invalidateOptimized() {
        return this instanceof ChatActivity.ChatActivityFragmentView;
    }

    public boolean isActionBarVisible() {
        return !(this instanceof ChannelAdminLogActivity.AnonymousClass5);
    }

    public boolean isStatusBarVisible$1() {
        return !(this instanceof ChannelAdminLogActivity.AnonymousClass5);
    }

    public int measureKeyboardHeight() {
        View rootView = getRootView();
        Rect rect = this.rect;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int iMax = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        this.keyboardHeight = iMax;
        return iMax;
    }

    public void notifyHeightChanged() {
        if (this.parallaxEffect != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = measuredWidth;
            float fDp = AndroidUtilities.dp(16.0f) * 2;
            float f2 = (f + fDp) / f;
            float f3 = measuredHeight;
            this.parallaxScale = Math.max(f2, (fDp + f3) / f3);
        }
        if (this.delegate == null && this.delegates.isEmpty()) {
            return;
        }
        this.keyboardHeight = measureKeyboardHeight();
        Point point = AndroidUtilities.displaySize;
        post(new FileLoader$$ExternalSyntheticLambda1(25, this, point.x > point.y));
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        if (this.needBlur && !this.blurIsRunning) {
            this.blurIsRunning = true;
            this.invalidateBlur = true;
        }
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onAttachedToWindow(this.backgroundView);
        }
        Drawable drawable2 = this.backgroundDrawable;
        if (drawable2 instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable2;
            motionBackgroundDrawable.isAttached = true;
            ImageReceiver imageReceiver = motionBackgroundDrawable.giftImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onAttachedToWindow();
            }
        }
        Drawable drawable3 = this.oldBackgroundDrawable;
        if (drawable3 instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable3).onAttachedToWindow(this.backgroundView);
        }
        Drawable drawable4 = this.oldBackgroundDrawable;
        if (drawable4 instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable2 = (MotionBackgroundDrawable) drawable4;
            motionBackgroundDrawable2.isAttached = true;
            ImageReceiver imageReceiver2 = motionBackgroundDrawable2.giftImageReceiver;
            if (imageReceiver2 != null) {
                imageReceiver2.onAttachedToWindow();
            }
        }
    }

    public void onBackgroundViewInvalidate() {
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.attached = false;
        this.blurPaintTop.setShader(null);
        this.blurPaintTop2.setShader(null);
        this.blurPaintBottom.setShader(null);
        this.blurPaintBottom2.setShader(null);
        ValueAnimator valueAnimator = this.blurCrossfade;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BlurBitmap blurBitmap = this.currentBitmap;
        if (blurBitmap != null) {
            blurBitmap.topBitmap.recycle();
            this.currentBitmap = null;
        }
        int i = 0;
        while (true) {
            arrayList = this.unusedBitmaps;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((BlurBitmap) arrayList.get(i)).topBitmap.recycle();
            }
            i++;
        }
        arrayList.clear();
        this.blurIsRunning = false;
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable).onDetachedFromWindow(this.backgroundView);
        }
        Drawable drawable2 = this.oldBackgroundDrawable;
        if (drawable2 instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable2).onDetachedFromWindow(this.backgroundView);
        }
        Drawable drawable3 = this.backgroundDrawable;
        if (drawable3 instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable3;
            motionBackgroundDrawable.isAttached = false;
            ImageReceiver imageReceiver = motionBackgroundDrawable.giftImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        Drawable drawable4 = this.oldBackgroundDrawable;
        if (drawable4 instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable2 = (MotionBackgroundDrawable) drawable4;
            motionBackgroundDrawable2.isAttached = false;
            ImageReceiver imageReceiver2 = motionBackgroundDrawable2.giftImageReceiver;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        notifyHeightChanged();
    }

    public void onUpdateBackgroundDrawable(Drawable drawable) {
    }

    public final void setBackgroundImage(Drawable drawable) {
        if (this.backgroundDrawable == drawable) {
            return;
        }
        if (this.backgroundView == null) {
            QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(getContext(), this, 16);
            this.backgroundView = anonymousClass2;
            addView(anonymousClass2, 0, LayoutHelper.createFrame(-1.0f, -1));
        }
        if (drawable instanceof MotionBackgroundDrawable) {
            ((MotionBackgroundDrawable) drawable).setParentView(this.backgroundView);
        }
        if (this.attached) {
            Drawable drawable2 = this.backgroundDrawable;
            if (drawable2 instanceof ChatBackgroundDrawable) {
                ((ChatBackgroundDrawable) drawable2).onDetachedFromWindow(this.backgroundView);
            }
        }
        this.backgroundDrawable = drawable;
        if (this.attached && (drawable instanceof ChatBackgroundDrawable)) {
            ((ChatBackgroundDrawable) drawable).onAttachedToWindow(this.backgroundView);
        }
        if (this.attached) {
            Drawable drawable3 = this.backgroundDrawable;
            if (drawable3 instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable3;
                motionBackgroundDrawable.isAttached = false;
                ImageReceiver imageReceiver = motionBackgroundDrawable.giftImageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
        }
        if (this.attached) {
            Drawable drawable4 = this.backgroundDrawable;
            if (drawable4 instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable2 = (MotionBackgroundDrawable) drawable4;
                motionBackgroundDrawable2.isAttached = true;
                ImageReceiver imageReceiver2 = motionBackgroundDrawable2.giftImageReceiver;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
        }
        onUpdateBackgroundDrawable(this.backgroundDrawable);
        checkMotion();
        this.backgroundView.invalidate();
    }

    public void setBackgroundTranslation(int i) {
        if (i != this.backgroundTranslationY) {
            this.backgroundTranslationY = i;
            QrActivity.AnonymousClass2 anonymousClass2 = this.backgroundView;
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
            }
        }
    }

    public void setBottomClip(int i) {
        if (i != this.bottomClip) {
            this.bottomClip = i;
            QrActivity.AnonymousClass2 anonymousClass2 = this.backgroundView;
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
            }
        }
    }

    public void setDelegate(SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate) {
        this.delegate = sizeNotifierFrameLayoutDelegate;
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.emojiHeight != i) {
            this.emojiHeight = i;
            QrActivity.AnonymousClass2 anonymousClass2 = this.backgroundView;
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.skipBackgroundDrawing != z) {
            this.skipBackgroundDrawing = z;
            QrActivity.AnonymousClass2 anonymousClass2 = this.backgroundView;
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
            }
        }
    }

    public final void startBlur() {
        if (!this.blurIsRunning || this.blurGeneratingTuskIsRunning || !this.invalidateBlur || !SharedConfig.chatBlurEnabled() || DRAW_USING_RENDERNODE() || Color.alpha(Theme.getColor(null, Theme.key_chat_BlurAlphaSlow, false)) == 255) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int iDp = AndroidUtilities.dp(100.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        if (measuredWidth == 0 || iDp == 0) {
            return;
        }
        this.invalidateBlur = false;
        this.blurGeneratingTuskIsRunning = true;
        float f = iDp;
        int i = ((int) (f / 12.0f)) + 34;
        float f2 = measuredWidth;
        int i2 = (int) (f2 / 12.0f);
        System.currentTimeMillis();
        ArrayList arrayList = this.unusedBitmaps;
        BlurBitmap blurBitmap = arrayList.size() > 0 ? (BlurBitmap) arrayList.remove(arrayList.size() - 1) : null;
        if (blurBitmap == null) {
            blurBitmap = new BlurBitmap();
            blurBitmap.topBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            blurBitmap.topCanvas = new SimplerCanvas(blurBitmap.topBitmap);
        } else {
            blurBitmap.topBitmap.eraseColor(0);
        }
        float width = blurBitmap.topBitmap.getWidth() / f2;
        float height = (blurBitmap.topBitmap.getHeight() - 34) / f;
        int iSave = blurBitmap.topCanvas.save();
        blurBitmap.pixelFixOffset = getScrollOffset() % 24;
        float f3 = 10.0f * height;
        blurBitmap.topCanvas.clipRect(1.0f, f3, blurBitmap.topBitmap.getWidth(), blurBitmap.topBitmap.getHeight() - 1);
        blurBitmap.topCanvas.scale(width, height);
        blurBitmap.topCanvas.translate(0.0f, f3 + blurBitmap.pixelFixOffset);
        blurBitmap.topScaleX = 1.0f / width;
        blurBitmap.topScaleY = 1.0f / height;
        drawList(blurBitmap.topCanvas, null);
        try {
            blurBitmap.topCanvas.restoreToCount(iSave);
        } catch (Exception e) {
            FileLog.e(e);
        }
        System.currentTimeMillis();
        int i3 = this.count2 + 1;
        this.count2 = i3;
        if (i3 >= 20) {
            this.count2 = 0;
        }
        if (blurQueue == null) {
            blurQueue = new DispatchQueue("BlurQueue");
        }
        int iMax = (int) (((int) (Math.max(6, Math.max(iDp, measuredWidth) / 180) * 2.5f)) * BlurSettingsBottomSheet.blurRadius);
        ActivityCompat.AnonymousClass1 anonymousClass1 = this.blurBackgroundTask;
        anonymousClass1.val$requestCode = iMax;
        anonymousClass1.val$permissionsArray = blurBitmap;
        blurQueue.postRunnable(anonymousClass1);
    }

    public void updateBlurContent() {
        if (DRAW_USING_RENDERNODE()) {
            invalidateBlurredViews();
        }
    }

    public void updateColors$1() {
    }

    public boolean useRootView() {
        return !(this instanceof SendGiftSheet.AnonymousClass2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public final void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z, int i) {
        float f2;
        float f3;
        boolean z2;
        float f4;
        boolean z3;
        float translationY = f;
        if (!SharedConfig.chatBlurEnabled()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (DRAW_USING_RENDERNODE()) {
            if (!canvas.isHardwareAccelerated()) {
                canvas.drawRect(rect, paint);
                return;
            }
            if (this.blurNodes == null) {
                this.blurNodes = new RenderNode[2];
            }
            float renderNodeScale = getRenderNodeScale();
            int i2 = !z ? 1 : 0;
            boolean[] zArr = this.blurNodeInvalidated;
            if (!z && !zArr[i2] && Math.abs(getBottomOffset() - this.lastDrawnBottomBlurOffset) > 0.1f) {
                zArr[i2] = true;
            }
            int iDp = AndroidUtilities.dp(36.0f);
            if (i >= 255 || !zArr[i2]) {
                f2 = 255.0f;
                f3 = 1.0f;
                z2 = true;
            } else {
                boolean[] zArr2 = this.blurNodeInvalidatedThisFrame;
                if (zArr2[i2]) {
                    f2 = 255.0f;
                    f3 = 1.0f;
                    z2 = true;
                } else {
                    f2 = 255.0f;
                    RenderNode[] renderNodeArr = this.blurNodes;
                    if (renderNodeArr[i2] == null) {
                        Theme$$ExternalSyntheticApiModelOutline3.m1061m();
                        f3 = 1.0f;
                        renderNodeArr[i2] = Theme$$ExternalSyntheticApiModelOutline3.m(DiffUtil.m(i2, "blurNode"));
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(2.0f);
                        RenderNode renderNode = this.blurNodes[i2];
                        z2 = true;
                        float blurRadiusInternal = getBlurRadiusInternal();
                        float blurRadiusInternal2 = getBlurRadiusInternal();
                        Shader.TileMode unused = Shader.TileMode.DECAL;
                        renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, Shader.TileMode.DECAL), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    } else {
                        f3 = 1.0f;
                        z2 = true;
                    }
                    int measuredWidth = getMeasuredWidth();
                    int iDp2 = AndroidUtilities.dp(100.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    this.blurNodes[i2].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((iDp * 2) + iDp2) / renderNodeScale));
                    RecordingCanvas recordingCanvasBeginRecording = this.blurNodes[i2].beginRecording();
                    drawingBlur = z2;
                    float f5 = f3 / renderNodeScale;
                    recordingCanvasBeginRecording.scale(f5, f5);
                    recordingCanvasBeginRecording.drawPaint(paint);
                    recordingCanvasBeginRecording.translate(0.0f, iDp);
                    if (!z) {
                        float bottomOffset = getBottomOffset();
                        this.lastDrawnBottomBlurOffset = bottomOffset;
                        float f6 = bottomOffset - iDp2;
                        this.drawnBottomOffset = f6;
                        recordingCanvasBeginRecording.translate(0.0f, -f6);
                    }
                    if (!invalidateOptimized()) {
                        drawList(recordingCanvasBeginRecording, null);
                        z3 = false;
                    } else {
                        ArrayList arrayList = this.lastViews;
                        arrayList.clear();
                        z3 = false;
                        ArrayList arrayList2 = this.views;
                        arrayList.addAll(arrayList2);
                        arrayList2.clear();
                        drawList(recordingCanvasBeginRecording, arrayList2);
                        int i3 = 0;
                        for (int size = arrayList.size(); i3 < size; size = size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            ((IViewWithInvalidateCallback) obj).listenInvalidate(null);
                        }
                        int i4 = 0;
                        for (int size2 = arrayList2.size(); i4 < size2; size2 = size2) {
                            Object obj2 = arrayList2.get(i4);
                            i4++;
                            ((IViewWithInvalidateCallback) obj2).listenInvalidate(new SeekBarView$$ExternalSyntheticLambda1(this, 22));
                        }
                    }
                    drawingBlur = z3;
                    this.blurNodes[i2].endRecording();
                    zArr2[i2] = z2;
                    zArr[i2] = z3;
                }
            }
            if (!invalidateOptimized()) {
                zArr[i2] = z2;
                invalidateBlurredViews();
            }
            canvas.save();
            canvas.drawRect(rect, paint);
            canvas.clipRect(rect);
            RenderNode renderNode2 = this.blurNodes[i2];
            if (renderNode2 != null && i < 255) {
                renderNode2.setAlpha(f3 - (i / f2));
                if (z) {
                    f4 = 0.0f;
                    canvas.translate(0.0f, (-translationY) - getTranslationY());
                } else {
                    f4 = 0.0f;
                    canvas.translate(0.0f, ((-translationY) + this.drawnBottomOffset) - (this.lastDrawnBottomBlurOffset - (getListTranslationY() + getBottomOffset())));
                }
                canvas.translate(f4, -iDp);
                canvas.scale(renderNodeScale, renderNodeScale);
                canvas.drawRenderNode(this.blurNodes[i2]);
            }
            canvas.restore();
            return;
        }
        if (this.currentBitmap == null) {
            canvas.drawRect(rect, paint);
            return;
        }
        this.selectedBlurPaint = z ? this.blurPaintTop : this.blurPaintBottom;
        this.selectedBlurPaint2 = z ? this.blurPaintTop2 : this.blurPaintBottom2;
        if (z) {
            translationY += getTranslationY();
        }
        if (this.selectedBlurPaint.getShader() != null) {
            Matrix matrix = this.matrix;
            matrix.reset();
            Matrix matrix2 = this.matrix2;
            matrix2.reset();
            if (!z) {
                this.currentBitmap.getClass();
                float f7 = (-translationY) + 0.0f;
                matrix.setTranslate(0.0f, ((f7 - this.currentBitmap.pixelFixOffset) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                this.currentBitmap.getClass();
                this.currentBitmap.getClass();
                matrix.preScale(0.0f, 0.0f);
                BlurBitmap blurBitmap = this.prevBitmap;
                if (blurBitmap != null) {
                    matrix2.setTranslate(0.0f, ((f7 - blurBitmap.pixelFixOffset) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                    this.prevBitmap.getClass();
                    this.prevBitmap.getClass();
                    matrix2.preScale(0.0f, 0.0f);
                }
            } else {
                float f8 = -translationY;
                matrix.setTranslate(0.0f, (f8 - this.currentBitmap.pixelFixOffset) - 34.0f);
                BlurBitmap blurBitmap2 = this.currentBitmap;
                matrix.preScale(blurBitmap2.topScaleX, blurBitmap2.topScaleY);
                BlurBitmap blurBitmap3 = this.prevBitmap;
                if (blurBitmap3 != null) {
                    matrix2.setTranslate(0.0f, (f8 - blurBitmap3.pixelFixOffset) - 34.0f);
                    BlurBitmap blurBitmap4 = this.prevBitmap;
                    matrix2.preScale(blurBitmap4.topScaleX, blurBitmap4.topScaleY);
                }
            }
            this.selectedBlurPaint.getShader().setLocalMatrix(matrix);
            if (this.selectedBlurPaint2.getShader() != null) {
                this.selectedBlurPaint2.getShader().setLocalMatrix(matrix);
            }
        }
        paint.setAlpha(255);
        if (this.blurCrossfadeProgress != 1.0f && this.selectedBlurPaint2.getShader() != null) {
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect, this.selectedBlurPaint2);
            canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) (this.blurCrossfadeProgress * 255.0f), 31);
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect, this.selectedBlurPaint);
            canvas.restore();
        } else {
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect, this.selectedBlurPaint);
        }
        paint.setAlpha(i);
        canvas.drawRect(rect, paint);
    }
}
