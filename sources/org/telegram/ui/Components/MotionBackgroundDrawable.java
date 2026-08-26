package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperGiftPatternPosition;
import org.telegram.ui.Components.blur3.utils.BitmapChangeTracker;

public final class MotionBackgroundDrawable extends Drawable {
    public static final boolean useLegacyBitmap;
    public static final boolean useSoftLight;
    public int alpha;
    public ProfileGooeyView$$ExternalSyntheticLambda0 animationProgressProvider;
    public float backgroundAlpha;
    public final int bitmapHeight;
    public BitmapShader bitmapShader;
    public final int bitmapWidth;
    public final int[] colors;
    public Bitmap currentBitmap;
    public boolean disableGradientShaderScaling;
    public boolean fastAnimation;
    public final BitmapChangeTracker giftChangeTracker;
    public ImageReceiver giftImageReceiver;
    public List giftPatternPositions;
    public int giftPosition;
    public Canvas gradientCanvas;
    public GradientDrawable gradientDrawable;
    public Bitmap gradientFromBitmap;
    public Canvas gradientFromCanvas;
    public BitmapShader gradientShader;
    public final Bitmap[] gradientToBitmap;
    public boolean ignoreInterpolator;
    public float indeterminateSpeedScale;
    public int intensity;
    public final CubicBezierInterpolator interpolator;
    public boolean isAttached;
    public boolean isIndeterminateAnimation;
    public boolean isPreview;
    public long lastUpdateTime;
    public Matrix matrix;
    public MotionBackgroundPaint motionBackgroundPaint;
    public final Paint paint;
    public final Paint paint2;
    public final Paint paint3;
    public WeakReference parentView;
    public float patternAlpha;
    public Bitmap patternAlphaInverted;
    public Bitmap patternBitmap;
    public final BitmapChangeTracker patternChangeTracker;
    public int patternColor;
    public PorterDuffColorFilter patternColorFilter;
    public Bitmap patternGiftBitmap;
    public int patternInvertedLastAlpha;
    public int patternInvertedLastPosition;
    public Bitmap patternWithGiftBitmap;
    public Canvas patternWithGiftCanvas;
    public final BitmapChangeTracker patternWithGiftChangeTracker;
    public Paint patternWithGiftPaint;
    public int phase;
    public float posAnimationProgress;
    public boolean postInvalidateParent;
    public final RectF rect;
    public boolean rotatingPreview;
    public boolean rotationBack;
    public int roundRadius;
    public int translationY;
    public final Runnable updateAnimationRunnable;

    static {
        int i = Build.VERSION.SDK_INT;
        useLegacyBitmap = i < 28;
        useSoftLight = i >= 29;
    }

    public MotionBackgroundDrawable() {
        this.colors = new int[]{-12423849, -531317, -7888252, -133430};
        this.interpolator = new CubicBezierInterpolator(0.33d, 0.0d, 0.0d, 1.0d);
        this.posAnimationProgress = 1.0f;
        this.rect = new RectF();
        this.gradientToBitmap = new Bitmap[3];
        this.paint = new Paint(2);
        this.paint2 = new Paint(2);
        this.paint3 = new Paint();
        this.intensity = 100;
        this.gradientDrawable = new GradientDrawable();
        this.updateAnimationRunnable = new HintView$1$$ExternalSyntheticLambda0(this, 22);
        this.patternAlpha = 1.0f;
        this.backgroundAlpha = 1.0f;
        this.alpha = 255;
        this.indeterminateSpeedScale = 1.0f;
        this.bitmapWidth = 60;
        this.bitmapHeight = 80;
        this.giftPosition = -1;
        this.patternColor = -16777216;
        this.patternChangeTracker = new BitmapChangeTracker();
        this.giftChangeTracker = new BitmapChangeTracker();
        this.patternWithGiftChangeTracker = new BitmapChangeTracker();
        init();
    }

    public static int getPatternColor(int i, int i2, int i3, int i4) {
        int averageColor = AndroidUtilities.getAverageColor(i, i2);
        if (i3 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i3);
        }
        if (i4 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i4);
        }
        float f = AndroidUtilities.RGBtoHSB(Color.red(averageColor), Color.green(averageColor), Color.blue(averageColor))[2];
        boolean z = useSoftLight;
        if (f < 0.3f) {
            return !z ? Integer.MAX_VALUE : -1;
        }
        if (z) {
            return -16777216;
        }
        int averageColor2 = AndroidUtilities.getAverageColor(i3, AndroidUtilities.getAverageColor(i, i2));
        if (i4 != 0) {
            averageColor2 = AndroidUtilities.getAverageColor(i4, averageColor2);
        }
        return (AndroidUtilities.getPatternColor(averageColor2, true) & 16777215) | 1677721600;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        canvas.save();
        Bitmap orBuildPatternWithGiftBitmap = getOrBuildPatternWithGiftBitmap();
        float f2 = orBuildPatternWithGiftBitmap != null ? bounds.top : this.translationY;
        int width = this.currentBitmap.getWidth();
        int height = this.currentBitmap.getHeight();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        float f3 = width;
        float f4 = height;
        float fMax = Math.max(fWidth / f3, fHeight / f4);
        float f5 = f3 * fMax;
        float f6 = f4 * fMax;
        float f7 = (fWidth - f5) / 2.0f;
        float f8 = (fHeight - f6) / 2.0f;
        if (this.isPreview) {
            int i = bounds.left;
            f7 += i;
            int i2 = bounds.top;
            f8 += i2;
            canvas.clipRect(i, i2, bounds.right, bounds.bottom);
        }
        boolean z = (Build.VERSION.SDK_INT < 28 || this.motionBackgroundPaint == null || this.currentBitmap == null || orBuildPatternWithGiftBitmap == null) ? false : true;
        int i3 = this.intensity;
        Paint paint = this.paint;
        Paint paint2 = this.paint2;
        RectF rectF = this.rect;
        if (i3 < 0) {
            boolean z2 = useLegacyBitmap;
            if (!z && (!z2 || orBuildPatternWithGiftBitmap == null)) {
                canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.alpha * this.backgroundAlpha)));
            }
            if (orBuildPatternWithGiftBitmap != null) {
                if (z2) {
                    int i4 = (((int) (this.alpha * this.patternAlpha)) * (-this.intensity)) / 100;
                    if (this.patternBitmap != null) {
                        Bitmap orBuildPatternWithGiftBitmap2 = getOrBuildPatternWithGiftBitmap();
                        BitmapChangeTracker bitmapChangeTracker = this.patternWithGiftChangeTracker;
                        if (bitmapChangeTracker.isInvalidated(orBuildPatternWithGiftBitmap2) || this.patternAlphaInverted == null || this.patternInvertedLastAlpha != i4) {
                            int width2 = this.patternBitmap.getWidth();
                            int height2 = this.patternBitmap.getHeight();
                            this.patternInvertedLastAlpha = i4;
                            Bitmap bitmap = this.patternAlphaInverted;
                            if (bitmap == null || bitmap.getWidth() != width2 || this.patternAlphaInverted.getHeight() != height2) {
                                this.patternAlphaInverted = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(orBuildPatternWithGiftBitmap2, this.patternAlphaInverted, i4);
                        }
                        bitmapChangeTracker.set(orBuildPatternWithGiftBitmap2);
                    }
                    float width3 = orBuildPatternWithGiftBitmap.getWidth();
                    float height3 = orBuildPatternWithGiftBitmap.getHeight();
                    float fMax2 = Math.max(fWidth / width3, fHeight / height3);
                    float f9 = width3 * fMax2;
                    float f10 = height3 * fMax2;
                    float f11 = (fWidth - f9) / 2.0f;
                    float f12 = (fHeight - f10) / 2.0f;
                    rectF.set(f11, f12, f9 + f11, f10 + f12);
                    if (this.patternAlphaInverted != null) {
                        canvas.drawBitmap(this.currentBitmap, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.patternAlphaInverted, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.alpha * this.backgroundAlpha)));
                    }
                    int i5 = this.giftPosition;
                    if (this.giftPatternPositions != null && this.patternBitmap != null) {
                        float fWidth2 = rectF.width() / this.patternBitmap.getWidth();
                        float fHeight2 = rectF.height() / this.patternBitmap.getHeight();
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        List list = this.giftPatternPositions;
                        if (list != null && this.giftImageReceiver != null && i5 >= 0 && i5 < list.size()) {
                            WallpaperGiftPatternPosition wallpaperGiftPatternPosition = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i5);
                            canvas.save();
                            canvas.translate(f13, f14);
                            canvas.scale(fWidth2, fHeight2);
                            canvas.concat(wallpaperGiftPatternPosition.matrix);
                            this.giftImageReceiver.setImageCoords(wallpaperGiftPatternPosition.rect);
                            this.giftImageReceiver.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    if (this.matrix == null) {
                        this.matrix = new Matrix();
                    }
                    this.matrix.reset();
                    this.matrix.setTranslate(f7, f8 + f2);
                    float fMin = 1.0f / Math.min(this.currentBitmap.getWidth() / bounds.width(), this.currentBitmap.getHeight() / bounds.height());
                    this.matrix.preScale(fMin, fMin);
                    this.bitmapShader.setLocalMatrix(this.matrix);
                    this.matrix.reset();
                    float width4 = orBuildPatternWithGiftBitmap.getWidth();
                    float height4 = orBuildPatternWithGiftBitmap.getHeight();
                    float fMax3 = Math.max(fWidth / width4, fHeight / height4);
                    float f15 = (fWidth - (width4 * fMax3)) / 2.0f;
                    float f16 = ((fHeight - (height4 * fMax3)) / 2.0f) + f2;
                    this.matrix.setTranslate((int) f15, (int) f16);
                    if (!this.disableGradientShaderScaling || fMax3 > 1.4f || fMax3 < 0.8f) {
                        this.matrix.preScale(fMax3, fMax3);
                        f = fMax3;
                    } else {
                        f = 1.0f;
                    }
                    this.gradientShader.setLocalMatrix(this.matrix);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.intensity) / 100.0f) * this.alpha * this.patternAlpha));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z) {
                        Paint paint3 = this.motionBackgroundPaint.getPaint(this.currentBitmap, orBuildPatternWithGiftBitmap, this.patternColor, (int) (this.alpha * this.patternAlpha), this.intensity, canvas.isHardwareAccelerated());
                        this.motionBackgroundPaint.applyPatternMatrix(this.matrix);
                        this.motionBackgroundPaint.applyGradientMatrix(rectF);
                        float f17 = this.roundRadius;
                        canvas.drawRoundRect(rectF, f17, f17, paint3);
                    } else {
                        float f18 = this.roundRadius;
                        canvas.drawRoundRect(rectF, f18, f18, paint2);
                    }
                    int i6 = this.giftPosition;
                    List list2 = this.giftPatternPositions;
                    if (list2 != null && this.giftImageReceiver != null && i6 >= 0 && i6 < list2.size()) {
                        WallpaperGiftPatternPosition wallpaperGiftPatternPosition2 = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i6);
                        canvas.save();
                        canvas.translate(f15, f16);
                        canvas.scale(f, f);
                        canvas.concat(wallpaperGiftPatternPosition2.matrix);
                        this.giftImageReceiver.setImageCoords(wallpaperGiftPatternPosition2.rect);
                        this.giftImageReceiver.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        } else {
            if (this.roundRadius != 0) {
                this.matrix.reset();
                this.matrix.setTranslate(f7, f8);
                float fMin2 = 1.0f / Math.min(this.currentBitmap.getWidth() / bounds.width(), this.currentBitmap.getHeight() / bounds.height());
                this.matrix.preScale(fMin2, fMin2);
                this.bitmapShader.setLocalMatrix(this.matrix);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z) {
                    float f19 = this.roundRadius;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                }
            } else {
                canvas.translate(0.0f, f2);
                GradientDrawable gradientDrawable = this.gradientDrawable;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) f7, (int) f8, (int) (f7 + f5), (int) (f8 + f6));
                    this.gradientDrawable.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    this.gradientDrawable.draw(canvas);
                } else {
                    rectF.set(f7, f8, f7 + f5, f6 + f8);
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * this.backgroundAlpha));
                    if (!z) {
                        canvas.drawBitmap(this.currentBitmap, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (orBuildPatternWithGiftBitmap != null) {
                float width5 = orBuildPatternWithGiftBitmap.getWidth();
                float height5 = orBuildPatternWithGiftBitmap.getHeight();
                float fMax4 = Math.max(fWidth / width5, fHeight / height5);
                float f20 = width5 * fMax4;
                float f21 = height5 * fMax4;
                float f22 = (fWidth - f20) / 2.0f;
                float f23 = (fHeight - f21) / 2.0f;
                rectF.set(f22, f23, f20 + f22, f21 + f23);
                paint2.setColorFilter(this.patternColorFilter);
                paint2.setAlpha((int) ((Math.abs(this.intensity) / 100.0f) * this.alpha * this.patternAlpha));
                if (z) {
                    Paint paint4 = this.motionBackgroundPaint.getPaint(this.currentBitmap, orBuildPatternWithGiftBitmap, this.patternColor, (int) (this.alpha * this.patternAlpha), this.intensity, canvas.isHardwareAccelerated());
                    MotionBackgroundPaint motionBackgroundPaint = this.motionBackgroundPaint;
                    motionBackgroundPaint.tmpRectF.set(0.0f, 0.0f, motionBackgroundPaint.patternWidth, motionBackgroundPaint.patternHeight);
                    Matrix matrix = motionBackgroundPaint.tmpMatrix;
                    matrix.setRectToRect(motionBackgroundPaint.tmpRectF, rectF, Matrix.ScaleToFit.FILL);
                    motionBackgroundPaint.applyPatternMatrix(matrix);
                    this.motionBackgroundPaint.applyGradientMatrix(rectF);
                    canvas.drawRect(rectF, paint4);
                } else {
                    canvas.drawBitmap(orBuildPatternWithGiftBitmap, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.intensity) / 100.0f) * this.alpha * this.patternAlpha * 0.8f));
                int i7 = this.giftPosition;
                if (this.giftPatternPositions != null && this.patternBitmap != null) {
                    float fWidth3 = rectF.width() / this.patternBitmap.getWidth();
                    float fHeight3 = rectF.height() / this.patternBitmap.getHeight();
                    float f24 = rectF.left;
                    float f25 = rectF.top;
                    List list3 = this.giftPatternPositions;
                    if (list3 != null && this.giftImageReceiver != null && i7 >= 0 && i7 < list3.size()) {
                        WallpaperGiftPatternPosition wallpaperGiftPatternPosition3 = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i7);
                        canvas.save();
                        canvas.translate(f24, f25);
                        canvas.scale(fWidth3, fHeight3);
                        canvas.concat(wallpaperGiftPatternPosition3.matrix);
                        this.giftImageReceiver.setImageCoords(wallpaperGiftPatternPosition3.rect);
                        this.giftImageReceiver.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        canvas.restore();
        updateAnimation();
    }

    public final void generateNextGradient() {
        int i = -1;
        while (i < 3) {
            int i2 = i + 1;
            Utilities.generateGradient(i < 0 ? this.gradientFromBitmap : this.gradientToBitmap[i], this.phase, i2 / 3.0f, this.colors);
            i = i2;
        }
    }

    public final Bitmap getBitmap() {
        return this.currentBitmap;
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.patternBitmap;
        return bitmap != null ? bitmap.getHeight() : super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.patternBitmap;
        return bitmap != null ? bitmap.getWidth() : super.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final Bitmap getOrBuildPatternWithGiftBitmap() {
        Bitmap bitmap = this.patternBitmap;
        if (bitmap == null) {
            return null;
        }
        if (this.patternGiftBitmap == null) {
            return bitmap;
        }
        BitmapChangeTracker bitmapChangeTracker = this.patternChangeTracker;
        boolean zIsInvalidated = bitmapChangeTracker.isInvalidated(bitmap);
        Bitmap bitmap2 = this.patternGiftBitmap;
        BitmapChangeTracker bitmapChangeTracker2 = this.giftChangeTracker;
        boolean zIsInvalidated2 = bitmapChangeTracker2.isInvalidated(bitmap2);
        boolean z = true;
        boolean z2 = this.patternInvertedLastPosition != this.giftPosition;
        if (!zIsInvalidated && !zIsInvalidated2 && !z2) {
            z = false;
        }
        Bitmap bitmap3 = this.patternWithGiftBitmap;
        if (bitmap3 != null && !z) {
            return bitmap3;
        }
        int width = this.patternBitmap.getWidth();
        int height = this.patternBitmap.getHeight();
        Bitmap bitmap4 = this.patternWithGiftBitmap;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.patternWithGiftBitmap.getHeight() != height) {
            this.patternWithGiftBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.patternWithGiftCanvas = new Canvas(this.patternWithGiftBitmap);
        }
        Bitmap.Config config = this.patternBitmap.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.patternBitmap, this.patternWithGiftBitmap);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.patternBitmap, this.patternWithGiftBitmap);
        }
        if (this.patternWithGiftPaint == null) {
            Paint paint = new Paint(3);
            this.patternWithGiftPaint = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.patternWithGiftCanvas;
        Paint paint2 = this.patternWithGiftPaint;
        int i = this.giftPosition;
        if (this.patternGiftBitmap != null && this.giftPatternPositions != null) {
            for (int i2 = 0; i2 < this.giftPatternPositions.size(); i2++) {
                if (i2 != i) {
                    WallpaperGiftPatternPosition wallpaperGiftPatternPosition = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i2);
                    canvas.save();
                    canvas.concat(wallpaperGiftPatternPosition.matrix);
                    canvas.drawBitmap(this.patternGiftBitmap, (Rect) null, wallpaperGiftPatternPosition.rect, paint2);
                    canvas.restore();
                }
            }
        }
        this.patternInvertedLastPosition = this.giftPosition;
        bitmapChangeTracker.set(this.patternBitmap);
        bitmapChangeTracker2.set(this.patternGiftBitmap);
        return this.patternWithGiftBitmap;
    }

    public final void init() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.bitmapWidth;
        int i2 = this.bitmapHeight;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        this.currentBitmap = bitmapCreateBitmap;
        bitmapCreateBitmap.setHasAlpha(false);
        for (int i3 = 0; i3 < 3; i3++) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.gradientToBitmap[i3] = bitmapCreateBitmap2;
            bitmapCreateBitmap2.setHasAlpha(false);
        }
        this.gradientCanvas = new Canvas(this.currentBitmap);
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.gradientFromBitmap = bitmapCreateBitmap3;
        bitmapCreateBitmap3.setHasAlpha(false);
        this.gradientFromCanvas = new Canvas(this.gradientFromBitmap);
        Utilities.generateGradient(this.currentBitmap, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.colors);
        if (useSoftLight) {
            Paint paint = this.paint2;
            BlendMode unused = BlendMode.SOFT_LIGHT;
            paint.setBlendMode(BlendMode.SOFT_LIGHT);
        }
    }

    public final void invalidateParent() {
        invalidateSelf();
        WeakReference weakReference = this.parentView;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.parentView.get()).invalidate();
        }
        if (this.postInvalidateParent) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            updateAnimation();
            Runnable runnable = this.updateAnimationRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 16L);
        }
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
        this.paint.setAlpha(i);
        this.paint2.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setColors(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.isPreview && i3 == 0 && i4 == 0) {
            this.gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(i5), new int[]{i, i2});
        } else {
            this.gradientDrawable = null;
        }
        int[] iArr = this.colors;
        if (iArr[0] == i && iArr[1] == i2 && iArr[2] == i3 && iArr[3] == i4) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            Utilities.generateGradient(bitmap, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), iArr);
            if (z) {
                invalidateParent();
            }
        }
    }

    public final void setFastRenderAllowed() {
        if (Build.VERSION.SDK_INT < 28 || this.motionBackgroundPaint != null || SharedConfig.fastWallpaperDisabled) {
            return;
        }
        this.motionBackgroundPaint = new MotionBackgroundPaint();
    }

    public final void setParentView(View view) {
        this.parentView = new WeakReference(view);
        ImageReceiver imageReceiver = this.giftImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setParentView(view);
        }
    }

    public final void setPatternBitmap(Bitmap bitmap, int i) {
        this.intensity = i;
        this.patternBitmap = bitmap;
        if (bitmap == null) {
            return;
        }
        Paint paint = this.paint2;
        if (useSoftLight) {
            if (i >= 0) {
                BlendMode unused = BlendMode.SOFT_LIGHT;
                paint.setBlendMode(BlendMode.SOFT_LIGHT);
            } else {
                paint.setBlendMode(null);
            }
        }
        boolean z = useLegacyBitmap;
        if (i >= 0) {
            if (z) {
                paint.setXfermode(null);
            }
        } else {
            if (z) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                return;
            }
            Bitmap bitmap2 = this.currentBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            Bitmap bitmap3 = this.patternBitmap;
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            this.gradientShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
            this.disableGradientShaderScaling = true;
            paint.setShader(new ComposeShader(this.bitmapShader, this.gradientShader, PorterDuff.Mode.DST_IN));
            paint.setFilterBitmap(true);
            this.matrix = new Matrix();
        }
    }

    public final void setPatternColorFilter(int i) {
        this.patternColor = i;
        this.patternColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        invalidateParent();
    }

    public final void setPhase(int i) {
        this.phase = i;
        if (i < 0) {
            this.phase = 0;
        } else if (i > 7) {
            this.phase = 7;
        }
        Utilities.generateGradient(this.currentBitmap, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.colors);
    }

    public final void setRoundRadius(int i) {
        this.roundRadius = i;
        this.matrix = new Matrix();
        Bitmap bitmap = this.currentBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.bitmapShader = bitmapShader;
        this.paint.setShader(bitmapShader);
        invalidateParent();
    }

    public final void switchToNextPosition(boolean z) {
        if (this.posAnimationProgress < 1.0f || !LiteMode.isEnabled(32)) {
            invalidateParent();
            return;
        }
        this.rotatingPreview = false;
        this.rotationBack = false;
        this.fastAnimation = z;
        this.posAnimationProgress = 0.0f;
        int i = this.phase - 1;
        this.phase = i;
        if (i < 0) {
            this.phase = 7;
        }
        invalidateParent();
        this.gradientFromCanvas.drawBitmap(this.currentBitmap, 0.0f, 0.0f, (Paint) null);
        generateNextGradient();
    }

    public final void switchToPrevPosition() {
        if (this.posAnimationProgress < 1.0f) {
            return;
        }
        this.rotatingPreview = false;
        this.fastAnimation = true;
        this.rotationBack = true;
        this.posAnimationProgress = 0.0f;
        invalidateParent();
        Utilities.generateGradient(this.gradientFromBitmap, this.phase, 0.0f, this.colors);
        generateNextGradient();
    }

    public final void updateAnimation() {
        float interpolation;
        char c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.lastUpdateTime;
        if (j > 20) {
            j = 17;
        }
        this.lastUpdateTime = jElapsedRealtime;
        if (j <= 1) {
            return;
        }
        boolean z = this.isIndeterminateAnimation;
        if (z && this.posAnimationProgress == 1.0f) {
            this.posAnimationProgress = 0.0f;
        }
        float f = this.posAnimationProgress;
        if (f < 1.0f) {
            boolean z2 = true;
            boolean z3 = this.postInvalidateParent || this.rotatingPreview;
            if (z) {
                float f2 = ((j / 12000.0f) * this.indeterminateSpeedScale) + f;
                this.posAnimationProgress = f2;
                if (f2 >= 1.0f) {
                    this.posAnimationProgress = 0.0f;
                }
                float f3 = this.posAnimationProgress;
                int i = (int) (f3 / 0.125f);
                this.phase = i;
                interpolation = 1.0f - ((f3 - (i * 0.125f)) / 0.125f);
            } else {
                boolean z4 = this.rotatingPreview;
                CubicBezierInterpolator cubicBezierInterpolator = this.interpolator;
                if (z4) {
                    float interpolation2 = cubicBezierInterpolator.getInterpolation(f);
                    if (interpolation2 <= 0.25f) {
                        c = 0;
                    } else if (interpolation2 <= 0.5f) {
                        c = 1;
                    } else {
                        c = interpolation2 <= 0.75f ? (char) 2 : (char) 3;
                    }
                    ProfileGooeyView$$ExternalSyntheticLambda0 profileGooeyView$$ExternalSyntheticLambda0 = this.animationProgressProvider;
                    if (profileGooeyView$$ExternalSyntheticLambda0 != null) {
                        this.posAnimationProgress = ((Float) profileGooeyView$$ExternalSyntheticLambda0.provide(this)).floatValue();
                    } else {
                        this.posAnimationProgress = (j / (this.rotationBack ? 1000.0f : 2000.0f)) + this.posAnimationProgress;
                    }
                    if (this.posAnimationProgress > 1.0f) {
                        this.posAnimationProgress = 1.0f;
                    }
                    float interpolation3 = (this.animationProgressProvider != null || this.ignoreInterpolator) ? this.posAnimationProgress : cubicBezierInterpolator.getInterpolation(this.posAnimationProgress);
                    if (this.ignoreInterpolator && (interpolation3 == 0.0f || interpolation3 == 1.0f)) {
                        this.ignoreInterpolator = false;
                    }
                    if ((c == 0 && interpolation3 > 0.25f) || ((c == 1 && interpolation3 > 0.5f) || (c == 2 && interpolation3 > 0.75f))) {
                        if (this.rotationBack) {
                            int i2 = this.phase + 1;
                            this.phase = i2;
                            if (i2 > 7) {
                                this.phase = 0;
                            }
                        } else {
                            int i3 = this.phase - 1;
                            this.phase = i3;
                            if (i3 < 0) {
                                this.phase = 7;
                            }
                        }
                    }
                    if (interpolation3 > 0.25f) {
                        if (interpolation3 <= 0.5f) {
                            interpolation3 -= 0.25f;
                        } else {
                            interpolation3 = interpolation3 <= 0.75f ? interpolation3 - 0.5f : interpolation3 - 0.75f;
                        }
                    }
                    interpolation = interpolation3 / 0.25f;
                    if (this.rotationBack) {
                        interpolation = 1.0f - interpolation;
                        if (this.posAnimationProgress >= 1.0f) {
                            int i4 = this.phase + 1;
                            this.phase = i4;
                            if (i4 > 7) {
                                this.phase = 0;
                            }
                            z2 = z3;
                            interpolation = 1.0f;
                        }
                    }
                    z2 = z3;
                } else {
                    ProfileGooeyView$$ExternalSyntheticLambda0 profileGooeyView$$ExternalSyntheticLambda1 = this.animationProgressProvider;
                    if (profileGooeyView$$ExternalSyntheticLambda1 != null) {
                        this.posAnimationProgress = ((Float) profileGooeyView$$ExternalSyntheticLambda1.provide(this)).floatValue();
                    } else {
                        this.posAnimationProgress = (j / (this.fastAnimation ? 300.0f : 500.0f)) + f;
                    }
                    if (this.posAnimationProgress > 1.0f) {
                        this.posAnimationProgress = 1.0f;
                    }
                    interpolation = (this.animationProgressProvider != null || this.ignoreInterpolator) ? this.posAnimationProgress : cubicBezierInterpolator.getInterpolation(this.posAnimationProgress);
                    if (this.ignoreInterpolator && (interpolation == 0.0f || interpolation == 1.0f)) {
                        this.ignoreInterpolator = false;
                    }
                    if (this.rotationBack) {
                        interpolation = 1.0f - interpolation;
                        if (this.posAnimationProgress >= 1.0f) {
                            int i5 = this.phase + 1;
                            this.phase = i5;
                            if (i5 > 7) {
                                this.phase = 0;
                            }
                            z2 = z3;
                            interpolation = 1.0f;
                        }
                    }
                    z2 = z3;
                }
            }
            if (z2) {
                Utilities.generateGradient(this.currentBitmap, this.phase, interpolation, this.colors);
            } else {
                Paint paint = this.paint3;
                Bitmap[] bitmapArr = this.gradientToBitmap;
                if (interpolation != 1.0f) {
                    int i6 = (int) (interpolation / 0.33333334f);
                    if (i6 == 0) {
                        this.gradientCanvas.drawBitmap(this.gradientFromBitmap, 0.0f, 0.0f, (Paint) null);
                    } else {
                        this.gradientCanvas.drawBitmap(bitmapArr[i6 - 1], 0.0f, 0.0f, (Paint) null);
                    }
                    paint.setAlpha((int) (SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(i6, 0.33333334f, interpolation, 0.33333334f) * 255.0f));
                    this.gradientCanvas.drawBitmap(bitmapArr[i6], 0.0f, 0.0f, paint);
                } else {
                    this.gradientCanvas.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                }
            }
            invalidateParent();
        }
    }

    public final int getPatternColor() {
        int[] iArr = this.colors;
        return getPatternColor(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public MotionBackgroundDrawable(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, true, 0, false);
    }

    public MotionBackgroundDrawable(int i, int i2, int i3, int i4, boolean z, int i5, boolean z2) {
        this.colors = new int[]{-12423849, -531317, -7888252, -133430};
        this.interpolator = new CubicBezierInterpolator(0.33d, 0.0d, 0.0d, 1.0d);
        this.posAnimationProgress = 1.0f;
        this.rect = new RectF();
        this.gradientToBitmap = new Bitmap[3];
        this.paint = new Paint(2);
        this.paint2 = new Paint(2);
        this.paint3 = new Paint();
        this.intensity = 100;
        this.gradientDrawable = new GradientDrawable();
        this.updateAnimationRunnable = new HintView$1$$ExternalSyntheticLambda0(this, 22);
        this.patternAlpha = 1.0f;
        this.backgroundAlpha = 1.0f;
        this.alpha = 255;
        this.indeterminateSpeedScale = 1.0f;
        this.bitmapWidth = 60;
        this.bitmapHeight = 80;
        this.giftPosition = -1;
        this.patternColor = -16777216;
        this.patternChangeTracker = new BitmapChangeTracker();
        this.giftChangeTracker = new BitmapChangeTracker();
        this.patternWithGiftChangeTracker = new BitmapChangeTracker();
        if (z2) {
            this.bitmapWidth = 80;
            this.bitmapHeight = 80;
        }
        this.isPreview = z;
        setColors(i, i2, i3, i4, i5, false);
        init();
    }
}
