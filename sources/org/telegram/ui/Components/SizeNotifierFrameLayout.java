package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.text.MeasuredText;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.BlurSettingsBottomSheet;
import org.telegram.ui.ChatBackgroundDrawable;

public class SizeNotifierFrameLayout extends FrameLayout implements Theme.Colorable {
    private static DispatchQueue blurQueue;
    public static boolean drawingBlur;
    private final float DOWN_SCALE;
    private final int TOP_CLIP_OFFSET;
    public AdjustPanLayoutHelper adjustPanLayoutHelper;
    private boolean animationInProgress;
    boolean attached;
    private Drawable backgroundDrawable;
    private boolean backgroundMotion;
    private int backgroundTranslationY;
    public View backgroundView;
    private float bgAngle;
    final BlurBackgroundTask blurBackgroundTask;
    public ArrayList<View> blurBehindViews;
    ValueAnimator blurCrossfade;
    public float blurCrossfadeProgress;
    public boolean blurGeneratingTuskIsRunning;
    public boolean blurIsRunning;
    private boolean[] blurNodeInvalidated;
    private boolean[] blurNodeInvalidatedThisFrame;
    private RenderNode[] blurNodes;
    public Paint blurPaintBottom;
    public Paint blurPaintBottom2;
    public Paint blurPaintTop;
    public Paint blurPaintTop2;
    private int bottomClip;
    int count;
    int count2;
    BlurBitmap currentBitmap;
    protected SizeNotifierFrameLayoutDelegate delegate;
    protected final ArrayList<SizeNotifierFrameLayoutDelegate> delegates;
    private float drawnBottomOffset;
    private int emojiHeight;
    private float emojiOffset;
    public boolean invalidateBlur;
    protected int keyboardHeight;
    private float lastDrawnBottomBlurOffset;
    private final ArrayList<IViewWithInvalidateCallback> lastViews;
    Matrix matrix;
    Matrix matrix2;
    public boolean needBlur;
    public boolean needBlurBottom;
    private boolean occupyStatusBar;
    private Drawable oldBackgroundDrawable;
    private boolean oldBackgroundMotion;
    private WallpaperParallaxEffect parallaxEffect;
    private float parallaxScale;
    private INavigationLayout parentLayout;
    private boolean paused;
    BlurBitmap prevBitmap;
    private Rect rect;
    float saturation;
    private Paint selectedBlurPaint;
    private Paint selectedBlurPaint2;
    private boolean skipBackgroundDrawing;
    SnowflakesEffect snowflakesEffect;
    private float themeAnimationValue;
    int times;
    int times2;
    private float translationX;
    private float translationY;
    public ArrayList<BlurBitmap> unusedBitmaps;
    private final ArrayList<IViewWithInvalidateCallback> views;

    public class BackgroundView extends View {
        public BackgroundView(Context context) {
            super(context);
        }

        @Override
        public void invalidate() {
            super.invalidate();
            SizeNotifierFrameLayout.this.onBackgroundViewInvalidate();
        }

        @Override
        public void onDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            int i;
            float f4;
            if (SizeNotifierFrameLayout.this.backgroundDrawable == null || SizeNotifierFrameLayout.this.skipBackgroundDrawing) {
                return;
            }
            Drawable newDrawable = SizeNotifierFrameLayout.this.getNewDrawable();
            boolean newDrawableMotion = SizeNotifierFrameLayout.this.getNewDrawableMotion();
            if (newDrawable != SizeNotifierFrameLayout.this.backgroundDrawable && newDrawable != null) {
                if (Theme.animatingColors != null) {
                    SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
                    sizeNotifierFrameLayout.oldBackgroundDrawable = sizeNotifierFrameLayout.backgroundDrawable;
                    SizeNotifierFrameLayout sizeNotifierFrameLayout2 = SizeNotifierFrameLayout.this;
                    sizeNotifierFrameLayout2.oldBackgroundMotion = sizeNotifierFrameLayout2.backgroundMotion;
                }
                if (newDrawable instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) newDrawable).setParentView(SizeNotifierFrameLayout.this.backgroundView);
                }
                SizeNotifierFrameLayout.this.backgroundDrawable = newDrawable;
                SizeNotifierFrameLayout sizeNotifierFrameLayout3 = SizeNotifierFrameLayout.this;
                if (sizeNotifierFrameLayout3.attached && (sizeNotifierFrameLayout3.backgroundDrawable instanceof ChatBackgroundDrawable)) {
                    ((ChatBackgroundDrawable) SizeNotifierFrameLayout.this.backgroundDrawable).onAttachedToWindow(this);
                }
                SizeNotifierFrameLayout sizeNotifierFrameLayout4 = SizeNotifierFrameLayout.this;
                if (sizeNotifierFrameLayout4.attached && (sizeNotifierFrameLayout4.backgroundDrawable instanceof MotionBackgroundDrawable)) {
                    ((MotionBackgroundDrawable) SizeNotifierFrameLayout.this.backgroundDrawable).onAttachedToWindow();
                }
                SizeNotifierFrameLayout.this.backgroundMotion = newDrawableMotion;
                SizeNotifierFrameLayout.this.themeAnimationValue = 0.0f;
                SizeNotifierFrameLayout sizeNotifierFrameLayout5 = SizeNotifierFrameLayout.this;
                sizeNotifierFrameLayout5.onUpdateBackgroundDrawable(sizeNotifierFrameLayout5.backgroundDrawable);
                SizeNotifierFrameLayout.this.checkMotion();
            } else if (SizeNotifierFrameLayout.this.backgroundMotion != newDrawableMotion) {
                SizeNotifierFrameLayout.this.backgroundMotion = newDrawableMotion;
                SizeNotifierFrameLayout.this.checkMotion();
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout6 = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout6.themeAnimationValue = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + sizeNotifierFrameLayout6.themeAnimationValue, 1.0f, 0.0f);
            int i2 = 0;
            while (i2 < 2) {
                Drawable drawable = i2 == 0 ? SizeNotifierFrameLayout.this.oldBackgroundDrawable : SizeNotifierFrameLayout.this.backgroundDrawable;
                if (drawable == null) {
                    i = i2;
                } else {
                    if (i2 != 1 || SizeNotifierFrameLayout.this.oldBackgroundDrawable == null || SizeNotifierFrameLayout.this.parentLayout == null) {
                        drawable.setAlpha(255);
                    } else {
                        drawable.setAlpha((int) (SizeNotifierFrameLayout.this.themeAnimationValue * 255.0f));
                    }
                    if (i2 == 0 ? SizeNotifierFrameLayout.this.oldBackgroundMotion : SizeNotifierFrameLayout.this.backgroundMotion) {
                        f = SizeNotifierFrameLayout.this.parallaxScale;
                        f2 = SizeNotifierFrameLayout.this.translationX;
                        f3 = SizeNotifierFrameLayout.this.translationY;
                    } else {
                        f = 1.0f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    if (drawable instanceof MotionBackgroundDrawable) {
                        MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                        if (motionBackgroundDrawable.hasPattern()) {
                            int currentActionBarHeight = (SizeNotifierFrameLayout.this.isActionBarVisible() ? ActionBar.getCurrentActionBarHeight() : 0) + ((SizeNotifierFrameLayout.this.isStatusBarVisible() && SizeNotifierFrameLayout.this.occupyStatusBar) ? AndroidUtilities.statusBarHeight : 0);
                            int measuredHeight = SizeNotifierFrameLayout.this.useRootView() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                            float fMax = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int iCeil = (int) Math.ceil(drawable.getIntrinsicWidth() * fMax * f);
                            float intrinsicHeight = drawable.getIntrinsicHeight() * fMax * f;
                            i = i2;
                            f4 = 1.0f;
                            int iCeil2 = (int) Math.ceil(intrinsicHeight);
                            int measuredWidth = ((getMeasuredWidth() - iCeil) / 2) + ((int) f2);
                            int i3 = ((measuredHeight - iCeil2) / 2) + SizeNotifierFrameLayout.this.backgroundTranslationY + currentActionBarHeight + ((int) f3);
                            canvas.save();
                            canvas.clipRect(0, currentActionBarHeight, iCeil, getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                            drawable.setBounds(measuredWidth, i3, iCeil + measuredWidth, iCeil2 + i3);
                            drawable.draw(canvas);
                            SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                            canvas.restore();
                        } else {
                            i = i2;
                            f4 = 1.0f;
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.save();
                                canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                            }
                            motionBackgroundDrawable.setTranslationY(SizeNotifierFrameLayout.this.backgroundTranslationY);
                            drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.backgroundTranslationY) + f3));
                            drawable.draw(canvas);
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.restore();
                            }
                        }
                    } else {
                        i = i2;
                        f4 = 1.0f;
                        if (drawable instanceof ColorDrawable) {
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.save();
                                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                            }
                            drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                            drawable.draw(canvas);
                            SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.restore();
                            }
                        } else if (drawable instanceof GradientDrawable) {
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.save();
                                canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                            }
                            drawable.setBounds(0, SizeNotifierFrameLayout.this.backgroundTranslationY, getMeasuredWidth(), getRootView().getMeasuredHeight() + SizeNotifierFrameLayout.this.backgroundTranslationY);
                            drawable.draw(canvas);
                            SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.restore();
                            }
                        } else if (!(drawable instanceof BitmapDrawable)) {
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.save();
                                canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                            }
                            if (drawable instanceof ChatBackgroundDrawable) {
                                ((ChatBackgroundDrawable) drawable).setParent(this);
                            }
                            float f5 = f - 1.0f;
                            float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(-getMeasuredWidth(), f5, 2.0f, f2);
                            float fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(-getRootView().getMeasuredHeight(), f5, 2.0f, f3);
                            drawable.setBounds((int) fM, (int) (SizeNotifierFrameLayout.this.backgroundTranslationY + fM2), (int) ((getMeasuredWidth() * f) + fM), (int) OKLCH.m(getRootView().getMeasuredHeight(), f, SizeNotifierFrameLayout.this.backgroundTranslationY, fM2));
                            drawable.draw(canvas);
                            SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                            if (SizeNotifierFrameLayout.this.bottomClip != 0) {
                                canvas.restore();
                            }
                        } else if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f6 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f6, f6);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f6), (int) Math.ceil(getRootView().getMeasuredHeight() / f6));
                            drawable.draw(canvas);
                            SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                            canvas.restore();
                        } else {
                            int currentActionBarHeight2 = (SizeNotifierFrameLayout.this.isActionBarVisible() ? ActionBar.getCurrentActionBarHeight() : 0) + ((SizeNotifierFrameLayout.this.isStatusBarVisible() && SizeNotifierFrameLayout.this.occupyStatusBar) ? AndroidUtilities.statusBarHeight : 0);
                            int measuredHeight2 = SizeNotifierFrameLayout.this.useRootView() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                            float fMax2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight2 / drawable.getIntrinsicHeight());
                            int iCeil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * fMax2 * f);
                            int iCeil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * fMax2 * f);
                            int measuredWidth2 = ((getMeasuredWidth() - iCeil3) / 2) + ((int) f2);
                            int i4 = ((measuredHeight2 - iCeil4) / 2) + SizeNotifierFrameLayout.this.backgroundTranslationY + currentActionBarHeight2 + ((int) f3);
                            canvas.save();
                            canvas.clipRect(0, currentActionBarHeight2, iCeil3, getMeasuredHeight() - SizeNotifierFrameLayout.this.bottomClip);
                            drawable.setBounds(measuredWidth2, i4, iCeil3 + measuredWidth2, iCeil4 + i4);
                            drawable.draw(canvas);
                            SizeNotifierFrameLayout.this.checkSnowflake(canvas);
                            canvas.restore();
                        }
                    }
                    if (i == 0 && SizeNotifierFrameLayout.this.oldBackgroundDrawable != null && SizeNotifierFrameLayout.this.themeAnimationValue >= f4) {
                        SizeNotifierFrameLayout sizeNotifierFrameLayout7 = SizeNotifierFrameLayout.this;
                        if (sizeNotifierFrameLayout7.attached && (sizeNotifierFrameLayout7.oldBackgroundDrawable instanceof ChatBackgroundDrawable)) {
                            ((ChatBackgroundDrawable) SizeNotifierFrameLayout.this.oldBackgroundDrawable).onDetachedFromWindow(SizeNotifierFrameLayout.this.backgroundView);
                        }
                        SizeNotifierFrameLayout sizeNotifierFrameLayout8 = SizeNotifierFrameLayout.this;
                        if (sizeNotifierFrameLayout8.attached && (sizeNotifierFrameLayout8.oldBackgroundDrawable instanceof MotionBackgroundDrawable)) {
                            ((MotionBackgroundDrawable) SizeNotifierFrameLayout.this.oldBackgroundDrawable).onDetachedFromWindow();
                        }
                        SizeNotifierFrameLayout.this.oldBackgroundDrawable = null;
                        SizeNotifierFrameLayout.this.oldBackgroundMotion = false;
                        SizeNotifierFrameLayout.this.checkMotion();
                        SizeNotifierFrameLayout.this.backgroundView.invalidate();
                    }
                }
                i2 = i + 1;
            }
            if (SizeNotifierFrameLayout.this.themeAnimationValue != 1.0f) {
                SizeNotifierFrameLayout.this.backgroundView.invalidate();
            }
        }
    }

    public class BlurBackgroundTask implements Runnable {
        BlurBitmap finalBitmap;
        int radius;

        private BlurBackgroundTask() {
        }

        public void lambda$run$0(ValueAnimator valueAnimator) {
            SizeNotifierFrameLayout.this.blurCrossfadeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SizeNotifierFrameLayout.this.invalidateBlurredViews();
        }

        public void lambda$run$1() {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout.blurGeneratingTuskIsRunning = false;
            sizeNotifierFrameLayout.startBlur();
        }

        public void lambda$run$2() {
            int i = 0;
            SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
            if (!sizeNotifierFrameLayout.blurIsRunning) {
                BlurBitmap blurBitmap = this.finalBitmap;
                if (blurBitmap != null) {
                    blurBitmap.recycle();
                }
                SizeNotifierFrameLayout.this.blurGeneratingTuskIsRunning = false;
                return;
            }
            final BlurBitmap blurBitmap2 = sizeNotifierFrameLayout.currentBitmap;
            sizeNotifierFrameLayout.prevBitmap = blurBitmap2;
            sizeNotifierFrameLayout.blurPaintTop2.setShader(sizeNotifierFrameLayout.blurPaintTop.getShader());
            SizeNotifierFrameLayout sizeNotifierFrameLayout2 = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout2.blurPaintBottom2.setShader(sizeNotifierFrameLayout2.blurPaintBottom.getShader());
            Bitmap bitmap = this.finalBitmap.topBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SizeNotifierFrameLayout.this.blurPaintTop.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            BlurBitmap blurBitmap3 = this.finalBitmap;
            if (blurBitmap3.needBlurBottom && blurBitmap3.bottomBitmap != null) {
                SizeNotifierFrameLayout.this.blurPaintBottom.setShader(new BitmapShader(this.finalBitmap.bottomBitmap, tileMode, tileMode));
            }
            ValueAnimator valueAnimator = SizeNotifierFrameLayout.this.blurCrossfade;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout3 = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout3.blurCrossfadeProgress = 0.0f;
            sizeNotifierFrameLayout3.blurCrossfade = ValueAnimator.ofFloat(0.0f, 1.0f);
            SizeNotifierFrameLayout.this.blurCrossfade.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 18));
            SizeNotifierFrameLayout.this.blurCrossfade.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SizeNotifierFrameLayout sizeNotifierFrameLayout4 = SizeNotifierFrameLayout.this;
                    sizeNotifierFrameLayout4.blurCrossfadeProgress = 1.0f;
                    sizeNotifierFrameLayout4.unusedBitmaps.add(blurBitmap2);
                    SizeNotifierFrameLayout.this.blurPaintTop2.setShader(null);
                    SizeNotifierFrameLayout.this.blurPaintBottom2.setShader(null);
                    SizeNotifierFrameLayout.this.invalidateBlurredViews();
                    super.onAnimationEnd(animator);
                }
            });
            SizeNotifierFrameLayout.this.blurCrossfade.setDuration(50L);
            SizeNotifierFrameLayout.this.blurCrossfade.start();
            SizeNotifierFrameLayout.this.invalidateBlurredViews();
            SizeNotifierFrameLayout.this.currentBitmap = this.finalBitmap;
            AndroidUtilities.runOnUIThread(new SizeNotifierFrameLayout$BlurBackgroundTask$$ExternalSyntheticLambda1(this, i), 16L);
        }

        @Override
        public void run() {
            Bitmap bitmap;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Utilities.stackBlurBitmap(this.finalBitmap.topBitmap, this.radius);
            BlurBitmap blurBitmap = this.finalBitmap;
            if (blurBitmap.needBlurBottom && (bitmap = blurBitmap.bottomBitmap) != null) {
                Utilities.stackBlurBitmap(bitmap, this.radius);
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = SizeNotifierFrameLayout.this;
            sizeNotifierFrameLayout.times = (int) ((System.currentTimeMillis() - jCurrentTimeMillis) + ((long) sizeNotifierFrameLayout.times));
            SizeNotifierFrameLayout sizeNotifierFrameLayout2 = SizeNotifierFrameLayout.this;
            int i = sizeNotifierFrameLayout2.count + 1;
            sizeNotifierFrameLayout2.count = i;
            if (i > 1000) {
                StringBuilder sb = new StringBuilder("chat blur generating average time");
                SizeNotifierFrameLayout sizeNotifierFrameLayout3 = SizeNotifierFrameLayout.this;
                sb.append(sizeNotifierFrameLayout3.times / sizeNotifierFrameLayout3.count);
                FileLog.d(sb.toString());
                SizeNotifierFrameLayout sizeNotifierFrameLayout4 = SizeNotifierFrameLayout.this;
                sizeNotifierFrameLayout4.count = 0;
                sizeNotifierFrameLayout4.times = 0;
            }
            AndroidUtilities.runOnUIThread(new SizeNotifierFrameLayout$BlurBackgroundTask$$ExternalSyntheticLambda1(this, 1));
        }
    }

    public static class BlurBitmap {
        Bitmap bottomBitmap;
        Canvas bottomCanvas;
        float bottomOffset;
        float bottomScaleX;
        float bottomScaleY;
        float drawnListTranslationY;
        public boolean needBlurBottom;
        int pixelFixOffset;
        Bitmap topBitmap;
        Canvas topCanvas;
        float topScaleX;
        float topScaleY;

        private BlurBitmap() {
        }

        public void recycle() {
            this.topBitmap.recycle();
            Bitmap bitmap = this.bottomBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public interface IViewWithInvalidateCallback {
        void listenInvalidate(Runnable runnable);
    }

    public static class SimplerCanvas extends Canvas {
        public SimplerCanvas(Bitmap bitmap) {
            super(bitmap);
        }

        @Override
        public boolean clipPath(Path path) {
            return false;
        }

        @Override
        public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public boolean clipPath(Path path, Region.Op op) {
            return false;
        }

        @Override
        public void drawText(String str, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        }

        @Override
        public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        }

        @Override
        public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        }
    }

    public interface SizeNotifierFrameLayoutDelegate {
        void onSizeChanged(int i, boolean z);
    }

    public SizeNotifierFrameLayout(Context context) {
        this(context, null);
    }

    private void checkLayerType() {
    }

    public void checkMotion() {
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
            wallpaperParallaxEffect2.setCallback(new ColorPicker$$ExternalSyntheticLambda5(this, 18));
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                this.parallaxScale = this.parallaxEffect.getScale(getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.paused) {
            return;
        }
        this.parallaxEffect.setEnabled(true);
    }

    public void checkSnowflake(Canvas canvas) {
        if (this.backgroundView != null && Theme.canStartHolidayAnimation && LiteMode.isEnabled(32)) {
            if (this.snowflakesEffect == null) {
                SnowflakesEffect snowflakesEffect = new SnowflakesEffect(1);
                this.snowflakesEffect = snowflakesEffect;
                snowflakesEffect.setForcedColor(-1);
            }
            this.snowflakesEffect.onDraw(this.backgroundView, canvas);
        }
    }

    private void drawListWithCallbacks(Canvas canvas, boolean z) {
        if (!invalidateOptimized()) {
            drawList(canvas, z, null);
            return;
        }
        this.lastViews.clear();
        this.lastViews.addAll(this.views);
        this.views.clear();
        drawList(canvas, z, this.views);
        ArrayList<IViewWithInvalidateCallback> arrayList = this.lastViews;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            IViewWithInvalidateCallback iViewWithInvalidateCallback = arrayList.get(i2);
            i2++;
            iViewWithInvalidateCallback.listenInvalidate(null);
        }
        ArrayList<IViewWithInvalidateCallback> arrayList2 = this.views;
        int size2 = arrayList2.size();
        while (i < size2) {
            IViewWithInvalidateCallback iViewWithInvalidateCallback2 = arrayList2.get(i);
            i++;
            iViewWithInvalidateCallback2.listenInvalidate(new Tooltip$$ExternalSyntheticLambda0(this, 16));
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

    public void lambda$checkMotion$0(int i, int i2, float f) {
        this.translationX = i;
        this.translationY = i2;
        this.bgAngle = f;
        View view = this.backgroundView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$notifyHeightChanged$1(boolean z) {
        SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate = this.delegate;
        if (sizeNotifierFrameLayoutDelegate != null) {
            sizeNotifierFrameLayoutDelegate.onSizeChanged(this.keyboardHeight, z);
        }
        for (int i = 0; i < this.delegates.size(); i++) {
            this.delegates.get(i).onSizeChanged(this.keyboardHeight, z);
        }
    }

    private void updateBlurShaderPosition(float f, boolean z) {
        this.selectedBlurPaint = z ? this.blurPaintTop : this.blurPaintBottom;
        this.selectedBlurPaint2 = z ? this.blurPaintTop2 : this.blurPaintBottom2;
        if (z) {
            f += getTranslationY();
        }
        if (this.selectedBlurPaint.getShader() != null) {
            this.matrix.reset();
            this.matrix2.reset();
            if (z) {
                float f2 = -f;
                this.matrix.setTranslate(0.0f, (f2 - this.currentBitmap.pixelFixOffset) - 34.0f);
                Matrix matrix = this.matrix;
                BlurBitmap blurBitmap = this.currentBitmap;
                matrix.preScale(blurBitmap.topScaleX, blurBitmap.topScaleY);
                BlurBitmap blurBitmap2 = this.prevBitmap;
                if (blurBitmap2 != null) {
                    this.matrix2.setTranslate(0.0f, (f2 - blurBitmap2.pixelFixOffset) - 34.0f);
                    Matrix matrix2 = this.matrix2;
                    BlurBitmap blurBitmap3 = this.prevBitmap;
                    matrix2.preScale(blurBitmap3.topScaleX, blurBitmap3.topScaleY);
                }
            } else {
                float f3 = -f;
                BlurBitmap blurBitmap4 = this.currentBitmap;
                this.matrix.setTranslate(0.0f, (((blurBitmap4.bottomOffset + f3) - blurBitmap4.pixelFixOffset) - 34.0f) - (blurBitmap4.drawnListTranslationY - (getListTranslationY() + getBottomOffset())));
                Matrix matrix3 = this.matrix;
                BlurBitmap blurBitmap5 = this.currentBitmap;
                matrix3.preScale(blurBitmap5.bottomScaleX, blurBitmap5.bottomScaleY);
                BlurBitmap blurBitmap6 = this.prevBitmap;
                if (blurBitmap6 != null) {
                    this.matrix2.setTranslate(0.0f, (((f3 + blurBitmap6.bottomOffset) - blurBitmap6.pixelFixOffset) - 34.0f) - (blurBitmap6.drawnListTranslationY - (getListTranslationY() + getBottomOffset())));
                    Matrix matrix4 = this.matrix2;
                    BlurBitmap blurBitmap7 = this.prevBitmap;
                    matrix4.preScale(blurBitmap7.bottomScaleX, blurBitmap7.bottomScaleY);
                }
            }
            this.selectedBlurPaint.getShader().setLocalMatrix(this.matrix);
            if (this.selectedBlurPaint2.getShader() != null) {
                this.selectedBlurPaint2.getShader().setLocalMatrix(this.matrix);
            }
        }
    }

    public boolean DRAW_USING_RENDERNODE() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public void addDelegate(SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate) {
        this.delegates.add(sizeNotifierFrameLayoutDelegate);
    }

    public boolean blurWasDrawn() {
        if (SharedConfig.chatBlurEnabled()) {
            return DRAW_USING_RENDERNODE() || this.currentBitmap != null;
        }
        return false;
    }

    public AdjustPanLayoutHelper createAdjustPanLayoutHelper() {
        return null;
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

    public void drawBlurCircle(Canvas canvas, float f, float f2, float f3, float f4, Paint paint, boolean z) {
        Canvas canvas2;
        int iAlpha = Color.alpha(Theme.getColor(null, DRAW_USING_RENDERNODE() ? Theme.key_chat_BlurAlpha : Theme.key_chat_BlurAlphaSlow, false));
        if (this.currentBitmap == null || !SharedConfig.chatBlurEnabled()) {
            canvas.drawCircle(f2, f3, f4, paint);
            return;
        }
        updateBlurShaderPosition(f, z);
        paint.setAlpha(255);
        if (this.blurCrossfadeProgress == 1.0f || this.selectedBlurPaint2.getShader() == null) {
            canvas2 = canvas;
            canvas2.drawCircle(f2, f3, f4, paint);
            canvas2.drawCircle(f2, f3, f4, this.selectedBlurPaint);
        } else {
            canvas.drawCircle(f2, f3, f4, paint);
            canvas.drawCircle(f2, f3, f4, this.selectedBlurPaint2);
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f2 - f4, f3 - f4, f2 + f4, f3 + f4, (int) (this.blurCrossfadeProgress * 255.0f), 31);
            canvas2.drawCircle(f2, f3, f4, paint);
            canvas2.drawCircle(f2, f3, f4, this.selectedBlurPaint);
            canvas2.restore();
        }
        paint.setAlpha(iAlpha);
        canvas2.drawCircle(f2, f3, f4, paint);
    }

    public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        drawBlurRect(canvas, f, rect, paint, z, Color.alpha(Theme.getColor((DRAW_USING_RENDERNODE() && SharedConfig.getDevicePerformanceClass() == 2) ? Theme.key_chat_BlurAlpha : Theme.key_chat_BlurAlphaSlow, getResourceProvider())));
    }

    public void drawList(Canvas canvas, boolean z, ArrayList<IViewWithInvalidateCallback> arrayList) {
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

    public void invalidateBackground() {
        View view = this.backgroundView;
        if (view != null) {
            view.invalidate();
        }
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

    public void invalidateBlurredViews() {
        boolean[] zArr = this.blurNodeInvalidated;
        zArr[0] = true;
        zArr[1] = true;
        for (int i = 0; i < this.blurBehindViews.size(); i++) {
            this.blurBehindViews.get(i).invalidate();
        }
    }

    public boolean invalidateOptimized() {
        return false;
    }

    public boolean isActionBarVisible() {
        return true;
    }

    public boolean isStatusBarVisible() {
        return true;
    }

    public int measureKeyboardHeight() {
        View rootView = getRootView();
        getWindowVisibleDisplayFrame(this.rect);
        Rect rect = this.rect;
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = (rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView);
        Rect rect2 = this.rect;
        int iMax = Math.max(0, height - (rect2.bottom - rect2.top));
        this.keyboardHeight = iMax;
        return iMax;
    }

    public void notifyHeightChanged() {
        WallpaperParallaxEffect wallpaperParallaxEffect = this.parallaxEffect;
        if (wallpaperParallaxEffect != null) {
            this.parallaxScale = wallpaperParallaxEffect.getScale(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.delegate == null && this.delegates.isEmpty()) {
            return;
        }
        this.keyboardHeight = measureKeyboardHeight();
        Point point = AndroidUtilities.displaySize;
        post(new MediaActivity$$ExternalSyntheticLambda5(this, point.x > point.y, 10));
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
            ((MotionBackgroundDrawable) drawable2).onAttachedToWindow();
        }
        Drawable drawable3 = this.oldBackgroundDrawable;
        if (drawable3 instanceof ChatBackgroundDrawable) {
            ((ChatBackgroundDrawable) drawable3).onAttachedToWindow(this.backgroundView);
        }
        Drawable drawable4 = this.oldBackgroundDrawable;
        if (drawable4 instanceof MotionBackgroundDrawable) {
            ((MotionBackgroundDrawable) drawable4).onAttachedToWindow();
        }
    }

    public void onBackgroundViewInvalidate() {
    }

    @Override
    public void onDetachedFromWindow() {
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
            blurBitmap.recycle();
            this.currentBitmap = null;
        }
        for (int i = 0; i < this.unusedBitmaps.size(); i++) {
            if (this.unusedBitmaps.get(i) != null) {
                this.unusedBitmaps.get(i).recycle();
            }
        }
        this.unusedBitmaps.clear();
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
            ((MotionBackgroundDrawable) drawable3).onDetachedFromWindow();
        }
        Drawable drawable4 = this.oldBackgroundDrawable;
        if (drawable4 instanceof MotionBackgroundDrawable) {
            ((MotionBackgroundDrawable) drawable4).onDetachedFromWindow();
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        notifyHeightChanged();
    }

    public void onPause() {
        WallpaperParallaxEffect wallpaperParallaxEffect = this.parallaxEffect;
        if (wallpaperParallaxEffect != null) {
            wallpaperParallaxEffect.setEnabled(false);
        }
        this.paused = true;
    }

    public void onResume() {
        WallpaperParallaxEffect wallpaperParallaxEffect = this.parallaxEffect;
        if (wallpaperParallaxEffect != null) {
            wallpaperParallaxEffect.setEnabled(true);
        }
        this.paused = false;
    }

    public void onUpdateBackgroundDrawable(Drawable drawable) {
    }

    public void removeDelegate(SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate) {
        this.delegates.remove(sizeNotifierFrameLayoutDelegate);
    }

    public void setBackgroundImage(Drawable drawable, boolean z) {
        if (this.backgroundDrawable == drawable) {
            return;
        }
        if (this.backgroundView == null) {
            BackgroundView backgroundView = new BackgroundView(getContext());
            this.backgroundView = backgroundView;
            addView(backgroundView, 0, LayoutHelper.createFrame(-1, -1.0f));
            checkLayerType();
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
                ((MotionBackgroundDrawable) drawable3).onDetachedFromWindow();
            }
        }
        if (this.attached) {
            Drawable drawable4 = this.backgroundDrawable;
            if (drawable4 instanceof MotionBackgroundDrawable) {
                ((MotionBackgroundDrawable) drawable4).onAttachedToWindow();
            }
        }
        onUpdateBackgroundDrawable(this.backgroundDrawable);
        checkMotion();
        this.backgroundView.invalidate();
        checkLayerType();
    }

    public void setBackgroundTranslation(int i) {
        if (i != this.backgroundTranslationY) {
            this.backgroundTranslationY = i;
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void setBottomClip(int i) {
        if (i != this.bottomClip) {
            this.bottomClip = i;
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void setDelegate(SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate) {
        this.delegate = sizeNotifierFrameLayoutDelegate;
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.emojiHeight != i) {
            this.emojiHeight = i;
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void setEmojiOffset(boolean z, float f) {
        if (this.emojiOffset == f && this.animationInProgress == z) {
            return;
        }
        this.emojiOffset = f;
        this.animationInProgress = z;
        View view = this.backgroundView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.skipBackgroundDrawing != z) {
            this.skipBackgroundDrawing = z;
            View view = this.backgroundView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void startBlur() {
        if (this.blurIsRunning && !this.blurGeneratingTuskIsRunning && this.invalidateBlur && SharedConfig.chatBlurEnabled() && !DRAW_USING_RENDERNODE()) {
            if (Color.alpha(Theme.getColor(null, Theme.key_chat_BlurAlphaSlow, false)) == 255) {
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            BlurBitmap blurBitmap = this.unusedBitmaps.size() > 0 ? (BlurBitmap) DiffUtil.m(this.unusedBitmaps) : null;
            if (blurBitmap == null) {
                blurBitmap = new BlurBitmap();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                blurBitmap.topBitmap = Bitmap.createBitmap(i2, i, config);
                blurBitmap.topCanvas = new SimplerCanvas(blurBitmap.topBitmap);
                if (this.needBlurBottom) {
                    blurBitmap.bottomBitmap = Bitmap.createBitmap(i2, i, config);
                    blurBitmap.bottomCanvas = new SimplerCanvas(blurBitmap.bottomBitmap);
                }
            } else {
                blurBitmap.topBitmap.eraseColor(0);
                Bitmap bitmap = blurBitmap.bottomBitmap;
                if (bitmap != null) {
                    bitmap.eraseColor(0);
                }
            }
            float width = blurBitmap.topBitmap.getWidth() / f2;
            float height = (blurBitmap.topBitmap.getHeight() - 34) / f;
            int iSave = blurBitmap.topCanvas.save();
            blurBitmap.pixelFixOffset = getScrollOffset() % 24;
            float f3 = height * 10.0f;
            blurBitmap.topCanvas.clipRect(1.0f, f3, blurBitmap.topBitmap.getWidth(), blurBitmap.topBitmap.getHeight() - 1);
            blurBitmap.topCanvas.scale(width, height);
            blurBitmap.topCanvas.translate(0.0f, f3 + blurBitmap.pixelFixOffset);
            blurBitmap.topScaleX = 1.0f / width;
            blurBitmap.topScaleY = 1.0f / height;
            drawList(blurBitmap.topCanvas, true, null);
            try {
                blurBitmap.topCanvas.restoreToCount(iSave);
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (this.needBlurBottom) {
                float width2 = blurBitmap.bottomBitmap.getWidth() / f2;
                float height2 = (blurBitmap.bottomBitmap.getHeight() - 34) / f;
                blurBitmap.needBlurBottom = true;
                blurBitmap.bottomOffset = getBottomOffset() - f;
                blurBitmap.drawnListTranslationY = getBottomOffset();
                blurBitmap.bottomCanvas.save();
                float f4 = height2 * 10.0f;
                blurBitmap.bottomCanvas.clipRect(1.0f, f4, blurBitmap.bottomBitmap.getWidth(), blurBitmap.bottomBitmap.getHeight() - 1);
                blurBitmap.bottomCanvas.scale(width2, height2);
                blurBitmap.bottomCanvas.translate(0.0f, (f4 - blurBitmap.bottomOffset) + blurBitmap.pixelFixOffset);
                blurBitmap.bottomScaleX = 1.0f / width2;
                blurBitmap.bottomScaleY = 1.0f / height2;
                drawList(blurBitmap.bottomCanvas, false, null);
                blurBitmap.bottomCanvas.restore();
            } else {
                blurBitmap.needBlurBottom = false;
            }
            this.times2 = (int) ((System.currentTimeMillis() - jCurrentTimeMillis) + ((long) this.times2));
            int i3 = this.count2 + 1;
            this.count2 = i3;
            if (i3 >= 20) {
                this.count2 = 0;
                this.times2 = 0;
            }
            if (blurQueue == null) {
                blurQueue = new DispatchQueue("BlurQueue");
            }
            this.blurBackgroundTask.radius = (int) (((int) (Math.max(6, Math.max(iDp, measuredWidth) / 180) * 2.5f)) * BlurSettingsBottomSheet.blurRadius);
            BlurBackgroundTask blurBackgroundTask = this.blurBackgroundTask;
            blurBackgroundTask.finalBitmap = blurBitmap;
            blurQueue.postRunnable(blurBackgroundTask);
        }
    }

    public void updateBlurContent() {
        if (DRAW_USING_RENDERNODE()) {
            invalidateBlurredViews();
        }
    }

    public void updateColors() {
    }

    public boolean useRootView() {
        return true;
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public SizeNotifierFrameLayout(Context context, INavigationLayout iNavigationLayout) {
        super(context);
        this.rect = new Rect();
        this.delegates = new ArrayList<>();
        this.occupyStatusBar = true;
        this.parallaxScale = 1.0f;
        this.paused = true;
        this.unusedBitmaps = new ArrayList<>(10);
        this.blurBehindViews = new ArrayList<>();
        this.matrix = new Matrix();
        this.matrix2 = new Matrix();
        this.blurPaintTop = new Paint();
        this.blurPaintTop2 = new Paint();
        this.blurPaintBottom = new Paint();
        this.blurPaintBottom2 = new Paint();
        this.DOWN_SCALE = 12.0f;
        this.TOP_CLIP_OFFSET = 34;
        this.themeAnimationValue = 1.0f;
        this.blurBackgroundTask = new BlurBackgroundTask();
        this.blurNodeInvalidatedThisFrame = new boolean[2];
        this.blurNodeInvalidated = new boolean[2];
        this.lastViews = new ArrayList<>();
        this.views = new ArrayList<>();
        setWillNotDraw(false);
        this.parentLayout = iNavigationLayout;
        this.adjustPanLayoutHelper = createAdjustPanLayoutHelper();
    }

    public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z, float f2) {
        drawBlurRect(canvas, f, rect, paint, z, AndroidUtilities.lerp(255, Color.alpha(Theme.getColor((DRAW_USING_RENDERNODE() && SharedConfig.getDevicePerformanceClass() == 2) ? Theme.key_chat_BlurAlpha : Theme.key_chat_BlurAlphaSlow, getResourceProvider())), f2));
    }

    public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z, int i) {
        float f2;
        float f3;
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
            if (!z && !this.blurNodeInvalidated[i2] && Math.abs(getBottomOffset() - this.lastDrawnBottomBlurOffset) > 0.1f) {
                this.blurNodeInvalidated[i2] = true;
            }
            int iDp = AndroidUtilities.dp(36.0f);
            if (i >= 255 || !this.blurNodeInvalidated[i2] || this.blurNodeInvalidatedThisFrame[i2]) {
                f2 = 255.0f;
                f3 = 1.0f;
            } else {
                RenderNode[] renderNodeArr = this.blurNodes;
                if (renderNodeArr[i2] == null) {
                    Theme$$ExternalSyntheticApiModelOutline3.m1067m();
                    renderNodeArr[i2] = Theme$$ExternalSyntheticApiModelOutline3.m(DiffUtil.m(i2, "blurNode"));
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode = this.blurNodes[i2];
                    f2 = 255.0f;
                    float blurRadiusInternal = getBlurRadiusInternal();
                    f3 = 1.0f;
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    Shader.TileMode unused = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, Shader.TileMode.DECAL), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    f2 = 255.0f;
                    f3 = 1.0f;
                }
                int measuredWidth = getMeasuredWidth();
                int iDp2 = AndroidUtilities.dp(100.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                this.blurNodes[i2].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((iDp * 2) + iDp2) / renderNodeScale));
                RecordingCanvas recordingCanvasBeginRecording = this.blurNodes[i2].beginRecording();
                drawingBlur = true;
                float f4 = f3 / renderNodeScale;
                recordingCanvasBeginRecording.scale(f4, f4);
                recordingCanvasBeginRecording.drawPaint(paint);
                recordingCanvasBeginRecording.translate(0.0f, iDp);
                if (!z) {
                    float bottomOffset = getBottomOffset();
                    this.lastDrawnBottomBlurOffset = bottomOffset;
                    float f5 = bottomOffset - iDp2;
                    this.drawnBottomOffset = f5;
                    recordingCanvasBeginRecording.translate(0.0f, -f5);
                }
                drawListWithCallbacks(recordingCanvasBeginRecording, z);
                drawingBlur = false;
                this.blurNodes[i2].endRecording();
                this.blurNodeInvalidatedThisFrame[i2] = true;
                this.blurNodeInvalidated[i2] = false;
            }
            if (!invalidateOptimized()) {
                this.blurNodeInvalidated[i2] = true;
                invalidateBlurredViews();
            }
            canvas.save();
            canvas.drawRect(rect, paint);
            canvas.clipRect(rect);
            RenderNode renderNode2 = this.blurNodes[i2];
            if (renderNode2 != null && i < 255) {
                renderNode2.setAlpha(f3 - (i / f2));
                if (z) {
                    canvas.translate(0.0f, (-f) - getTranslationY());
                } else {
                    canvas.translate(0.0f, ((-f) + this.drawnBottomOffset) - (this.lastDrawnBottomBlurOffset - (getListTranslationY() + getBottomOffset())));
                }
                canvas.translate(0.0f, -iDp);
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
        updateBlurShaderPosition(f, z);
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
