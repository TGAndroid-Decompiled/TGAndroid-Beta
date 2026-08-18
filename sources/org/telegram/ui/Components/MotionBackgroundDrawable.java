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
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperGiftPatternPosition;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.blur3.utils.BitmapChangeTracker;

public class MotionBackgroundDrawable extends Drawable {
    private static final boolean useLegacyBitmap;
    private static final boolean useSoftLight;
    private int alpha;
    private GenericProvider animationProgressProvider;
    private float backgroundAlpha;
    private int bitmapHeight;
    private BitmapShader bitmapShader;
    private int bitmapWidth;
    private final int[] colors;
    private Bitmap currentBitmap;
    private boolean disableGradientShaderScaling;
    private boolean fastAnimation;
    private final BitmapChangeTracker giftChangeTracker;
    private ImageReceiver giftImageReceiver;
    private List giftPatternPositions;
    private int giftPosition;
    private Canvas gradientCanvas;
    private GradientDrawable gradientDrawable;
    private Bitmap gradientFromBitmap;
    private Canvas gradientFromCanvas;
    private BitmapShader gradientShader;
    private final Bitmap[] gradientToBitmap;
    private boolean ignoreInterpolator;
    private float indeterminateSpeedScale;
    private int intensity;
    private final CubicBezierInterpolator interpolator;
    public boolean isAttached;
    private boolean isIndeterminateAnimation;
    public boolean isPreview;
    private long lastUpdateTime;
    private Matrix matrix;
    private MotionBackgroundPaint motionBackgroundPaint;
    private final Paint paint;
    private final Paint paint2;
    private final Paint paint3;
    private WeakReference parentView;
    private float patternAlpha;
    private Bitmap patternAlphaInverted;
    private Bitmap patternBitmap;
    private final BitmapChangeTracker patternChangeTracker;
    private int patternColor;
    private ColorFilter patternColorFilter;
    private Bitmap patternGiftBitmap;
    private int patternInvertedLastAlpha;
    private int patternInvertedLastPosition;
    private Bitmap patternWithGiftBitmap;
    private Canvas patternWithGiftCanvas;
    private final BitmapChangeTracker patternWithGiftChangeTracker;
    private Paint patternWithGiftPaint;
    private int phase;
    public float posAnimationProgress;
    private boolean postInvalidateParent;
    private final RectF rect;
    private boolean rotatingPreview;
    private boolean rotationBack;
    private int roundRadius;
    private int translationY;
    private final Runnable updateAnimationRunnable;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

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
        this.updateAnimationRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateAnimation();
            }
        };
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

    public MotionBackgroundDrawable(int i, int i2, int i3, int i4, boolean z) {
        this(i, i2, i3, i4, 0, z);
    }

    public MotionBackgroundDrawable(int i, int i2, int i3, int i4, int i5, boolean z) {
        this(i, i2, i3, i4, i5, z, false);
    }

    public MotionBackgroundDrawable(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
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
        this.updateAnimationRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateAnimation();
            }
        };
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

    private void init() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888);
        this.currentBitmap = bitmapCreateBitmap;
        bitmapCreateBitmap.setHasAlpha(false);
        for (int i = 0; i < 3; i++) {
            this.gradientToBitmap[i] = Bitmap.createBitmap(this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888);
            this.gradientToBitmap[i].setHasAlpha(false);
        }
        this.gradientCanvas = new Canvas(this.currentBitmap);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888);
        this.gradientFromBitmap = bitmapCreateBitmap2;
        bitmapCreateBitmap2.setHasAlpha(false);
        this.gradientFromCanvas = new Canvas(this.gradientFromBitmap);
        Utilities.generateGradient(this.currentBitmap, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.colors);
        if (useSoftLight) {
            this.paint2.setBlendMode(BlendMode.SOFT_LIGHT);
        }
    }

    public void setFastRenderAllowed() {
        if (Build.VERSION.SDK_INT < 28 || this.motionBackgroundPaint != null || SharedConfig.fastWallpaperDisabled) {
            return;
        }
        this.motionBackgroundPaint = new MotionBackgroundPaint();
    }

    public void setRoundRadius(int i) {
        this.roundRadius = i;
        this.matrix = new Matrix();
        Bitmap bitmap = this.currentBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.bitmapShader = bitmapShader;
        this.paint.setShader(bitmapShader);
        invalidateParent();
    }

    public BitmapShader getBitmapShader() {
        return this.bitmapShader;
    }

    public Bitmap getBitmap() {
        return this.currentBitmap;
    }

    public Bitmap getPatternBitmap() {
        return this.patternBitmap;
    }

    public int getIntensity() {
        return this.intensity;
    }

    public static boolean isDark(int i, int i2, int i3, int i4) {
        int averageColor = AndroidUtilities.getAverageColor(i, i2);
        if (i3 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i3);
        }
        if (i4 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i4);
        }
        return AndroidUtilities.RGBtoHSB(Color.red(averageColor), Color.green(averageColor), Color.blue(averageColor))[2] < 0.3f;
    }

    public static int getPatternColor(int i, int i2, int i3, int i4) {
        if (isDark(i, i2, i3, i4)) {
            return !useSoftLight ? Integer.MAX_VALUE : -1;
        }
        if (useSoftLight) {
            return -16777216;
        }
        int averageColor = AndroidUtilities.getAverageColor(i3, AndroidUtilities.getAverageColor(i, i2));
        if (i4 != 0) {
            averageColor = AndroidUtilities.getAverageColor(i4, averageColor);
        }
        return (AndroidUtilities.getPatternColor(averageColor, true) & 16777215) | 1677721600;
    }

    public int getPatternColor() {
        int[] iArr = this.colors;
        return getPatternColor(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public int getPhase() {
        return this.phase;
    }

    public void setPostInvalidateParent(boolean z) {
        this.postInvalidateParent = z;
    }

    public void rotatePreview(boolean z) {
        if (this.posAnimationProgress < 1.0f) {
            return;
        }
        this.rotatingPreview = true;
        this.posAnimationProgress = 0.0f;
        this.rotationBack = z;
        invalidateParent();
    }

    public void setPhase(int i) {
        this.phase = i;
        if (i < 0) {
            this.phase = 0;
        } else if (i > 7) {
            this.phase = 7;
        }
        Utilities.generateGradient(this.currentBitmap, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.colors);
    }

    public float getPosAnimationProgress() {
        return this.posAnimationProgress;
    }

    public void setPosAnimationProgress(float f) {
        this.posAnimationProgress = f;
        updateAnimation();
    }

    public void switchToNextPosition() {
        switchToNextPosition(false);
    }

    public void switchToNextPosition(boolean z) {
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

    public void generateNextGradient() {
        int i = -1;
        while (i < 3) {
            int i2 = i + 1;
            Utilities.generateGradient(i < 0 ? this.gradientFromBitmap : this.gradientToBitmap[i], this.phase, i2 / 3.0f, this.colors);
            i = i2;
        }
    }

    public void switchToPrevPosition(boolean z) {
        if (this.posAnimationProgress < 1.0f) {
            return;
        }
        this.rotatingPreview = false;
        this.fastAnimation = z;
        this.rotationBack = true;
        this.posAnimationProgress = 0.0f;
        invalidateParent();
        Utilities.generateGradient(this.gradientFromBitmap, this.phase, 0.0f, this.colors);
        generateNextGradient();
    }

    public int[] getColors() {
        return this.colors;
    }

    public void setParentView(View view) {
        this.parentView = new WeakReference(view);
        ImageReceiver imageReceiver = this.giftImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setParentView(view);
        }
    }

    public void setColors(int i, int i2, int i3, int i4) {
        setColors(i, i2, i3, i4, 0, true);
    }

    public void setColors(int i, int i2, int i3, int i4, Bitmap bitmap) {
        int[] iArr = this.colors;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        Utilities.generateGradient(bitmap, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.colors);
    }

    public void setColors(int i, int i2, int i3, int i4, int i5, boolean z) {
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
            Utilities.generateGradient(bitmap, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.colors);
            if (z) {
                invalidateParent();
            }
        }
    }

    private void invalidateParent() {
        invalidateSelf();
        WeakReference weakReference = this.parentView;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.parentView.get()).invalidate();
        }
        if (this.postInvalidateParent) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            updateAnimation();
            AndroidUtilities.cancelRunOnUIThread(this.updateAnimationRunnable);
            AndroidUtilities.runOnUIThread(this.updateAnimationRunnable, 16L);
        }
    }

    public boolean hasPattern() {
        return this.patternBitmap != null;
    }

    @Override
    public int getIntrinsicWidth() {
        Bitmap bitmap = this.patternBitmap;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        Bitmap bitmap = this.patternBitmap;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    public void setTranslationY(int i) {
        this.translationY = i;
    }

    public void setPatternBitmap(int i) {
        setPatternBitmap(i, this.patternBitmap, true);
    }

    public void setPatternBitmap(int i, Bitmap bitmap) {
        setPatternBitmap(i, bitmap, true);
    }

    public void setPatternGiftPositions(List list) {
        this.giftPatternPositions = list;
    }

    public void setGiftPatternRandomSeed(long j) {
        if (this.giftPatternPositions != null) {
            this.giftPosition = new Random(j).nextInt(this.giftPatternPositions.size());
        }
    }

    public void setGiftPatternBitmap(Bitmap bitmap) {
        this.patternGiftBitmap = bitmap;
        invalidateParent();
    }

    public void setGiftDrawable(TLRPC.Document document) {
        if (this.giftImageReceiver == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.giftImageReceiver = imageReceiver;
            imageReceiver.setAlpha(0.5f);
            WeakReference weakReference = this.parentView;
            if (weakReference != null) {
                this.giftImageReceiver.setParentView((View) weakReference.get());
            }
            if (this.isAttached) {
                this.giftImageReceiver.onAttachedToWindow();
            }
        }
        this.giftImageReceiver.setImage(ImageLocation.getForDocument(document), "80_80", null, null, null, 0);
        this.giftImageReceiver.setAutoRepeatCount(1);
        this.giftImageReceiver.setAutoRepeat(1);
    }

    public void onAttachedToWindow() {
        this.isAttached = true;
        ImageReceiver imageReceiver = this.giftImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    public void onDetachedFromWindow() {
        this.isAttached = false;
        ImageReceiver imageReceiver = this.giftImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    public void setPatternBitmap(int i, Bitmap bitmap, boolean z) {
        this.intensity = i;
        this.patternBitmap = bitmap;
        if (bitmap == null) {
            return;
        }
        if (useSoftLight) {
            if (i >= 0) {
                this.paint2.setBlendMode(BlendMode.SOFT_LIGHT);
            } else {
                this.paint2.setBlendMode(null);
            }
        }
        if (i < 0) {
            if (!useLegacyBitmap) {
                Bitmap bitmap2 = this.currentBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                Bitmap bitmap3 = this.patternBitmap;
                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                this.gradientShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                this.disableGradientShaderScaling = z;
                this.paint2.setShader(new ComposeShader(this.bitmapShader, this.gradientShader, PorterDuff.Mode.DST_IN));
                this.paint2.setFilterBitmap(true);
                this.matrix = new Matrix();
                return;
            }
            this.paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            return;
        }
        if (useLegacyBitmap) {
            this.paint2.setXfermode(null);
        }
    }

    public void setPatternColorFilter(int i) {
        this.patternColor = i;
        this.patternColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        invalidateParent();
    }

    public void setPatternAlpha(float f) {
        this.patternAlpha = f;
        invalidateParent();
    }

    public void setBackgroundAlpha(float f) {
        this.backgroundAlpha = f;
        invalidateParent();
    }

    @Override
    public void draw(Canvas canvas) {
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
        if (this.intensity < 0) {
            if (!z && (!useLegacyBitmap || orBuildPatternWithGiftBitmap == null)) {
                canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.alpha * this.backgroundAlpha)));
            }
            if (orBuildPatternWithGiftBitmap != null) {
                if (useLegacyBitmap) {
                    checkLegacyForNegativeIntensity((((int) (this.alpha * this.patternAlpha)) * (-this.intensity)) / 100);
                    float width2 = orBuildPatternWithGiftBitmap.getWidth();
                    float height2 = orBuildPatternWithGiftBitmap.getHeight();
                    float fMax2 = Math.max(fWidth / width2, fHeight / height2);
                    float f9 = width2 * fMax2;
                    float f10 = height2 * fMax2;
                    float f11 = (fWidth - f9) / 2.0f;
                    float f12 = (fHeight - f10) / 2.0f;
                    this.rect.set(f11, f12, f9 + f11, f10 + f12);
                    if (this.patternAlphaInverted != null) {
                        canvas.drawBitmap(this.currentBitmap, (Rect) null, this.rect, this.paint);
                        canvas.drawBitmap(this.patternAlphaInverted, (Rect) null, this.rect, this.paint);
                    } else {
                        canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.alpha * this.backgroundAlpha)));
                    }
                    drawGiftImageForLegacyNegativeIntensity(canvas, this.rect, this.giftPosition);
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
                    float width3 = orBuildPatternWithGiftBitmap.getWidth();
                    float height3 = orBuildPatternWithGiftBitmap.getHeight();
                    float fMax3 = Math.max(fWidth / width3, fHeight / height3);
                    float f13 = (fWidth - (width3 * fMax3)) / 2.0f;
                    float f14 = ((fHeight - (height3 * fMax3)) / 2.0f) + f2;
                    this.matrix.setTranslate((int) f13, (int) f14);
                    if (!this.disableGradientShaderScaling || fMax3 > 1.4f || fMax3 < 0.8f) {
                        this.matrix.preScale(fMax3, fMax3);
                        f = fMax3;
                    } else {
                        f = 1.0f;
                    }
                    this.gradientShader.setLocalMatrix(this.matrix);
                    this.paint2.setColorFilter(null);
                    this.paint2.setAlpha((int) ((Math.abs(this.intensity) / 100.0f) * this.alpha * this.patternAlpha));
                    this.rect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z) {
                        Paint paint = this.motionBackgroundPaint.getPaint(this.currentBitmap, orBuildPatternWithGiftBitmap, this.patternColor, (int) (this.alpha * this.patternAlpha), this.intensity, canvas.isHardwareAccelerated());
                        this.motionBackgroundPaint.applyPatternMatrix(this.matrix);
                        this.motionBackgroundPaint.applyGradientMatrix(this.rect);
                        RectF rectF = this.rect;
                        float f15 = this.roundRadius;
                        canvas.drawRoundRect(rectF, f15, f15, paint);
                    } else {
                        RectF rectF2 = this.rect;
                        float f16 = this.roundRadius;
                        canvas.drawRoundRect(rectF2, f16, f16, this.paint2);
                    }
                    drawGiftImageForNegativeIntensity(canvas, f13, f14, f);
                }
            }
        } else {
            if (this.roundRadius != 0) {
                this.matrix.reset();
                this.matrix.setTranslate(f7, f8);
                float fMin2 = 1.0f / Math.min(this.currentBitmap.getWidth() / bounds.width(), this.currentBitmap.getHeight() / bounds.height());
                this.matrix.preScale(fMin2, fMin2);
                this.bitmapShader.setLocalMatrix(this.matrix);
                this.rect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z) {
                    RectF rectF3 = this.rect;
                    float f17 = this.roundRadius;
                    canvas.drawRoundRect(rectF3, f17, f17, this.paint);
                }
            } else {
                canvas.translate(0.0f, f2);
                GradientDrawable gradientDrawable = this.gradientDrawable;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) f7, (int) f8, (int) (f7 + f5), (int) (f8 + f6));
                    this.gradientDrawable.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    this.gradientDrawable.draw(canvas);
                } else {
                    this.rect.set(f7, f8, f5 + f7, f6 + f8);
                    Paint paint2 = this.paint;
                    int alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (alpha * this.backgroundAlpha));
                    if (!z) {
                        canvas.drawBitmap(this.currentBitmap, (Rect) null, this.rect, paint2);
                    }
                    paint2.setAlpha(alpha);
                }
            }
            if (orBuildPatternWithGiftBitmap != null) {
                float width4 = orBuildPatternWithGiftBitmap.getWidth();
                float height4 = orBuildPatternWithGiftBitmap.getHeight();
                float fMax4 = Math.max(fWidth / width4, fHeight / height4);
                float f18 = width4 * fMax4;
                float f19 = height4 * fMax4;
                float f20 = (fWidth - f18) / 2.0f;
                float f21 = (fHeight - f19) / 2.0f;
                this.rect.set(f20, f21, f18 + f20, f19 + f21);
                this.paint2.setColorFilter(this.patternColorFilter);
                this.paint2.setAlpha((int) ((Math.abs(this.intensity) / 100.0f) * this.alpha * this.patternAlpha));
                if (z) {
                    Paint paint3 = this.motionBackgroundPaint.getPaint(this.currentBitmap, orBuildPatternWithGiftBitmap, this.patternColor, (int) (this.alpha * this.patternAlpha), this.intensity, canvas.isHardwareAccelerated());
                    this.motionBackgroundPaint.applyPatternMatrix(this.rect);
                    this.motionBackgroundPaint.applyGradientMatrix(this.rect);
                    canvas.drawRect(this.rect, paint3);
                } else {
                    canvas.drawBitmap(orBuildPatternWithGiftBitmap, (Rect) null, this.rect, this.paint2);
                }
                this.paint2.setAlpha((int) ((Math.abs(this.intensity) / 100.0f) * this.alpha * this.patternAlpha * 0.8f));
                drawGiftImageForPositiveIntensity(canvas, this.rect, this.giftPosition);
            }
        }
        canvas.restore();
        updateAnimation();
    }

    public void setAnimationProgressProvider(GenericProvider genericProvider) {
        this.animationProgressProvider = genericProvider;
        updateAnimation();
    }

    public void updateAnimation() {
        float interpolation;
        char c;
        float interpolation2;
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
                float f2 = f + ((j / 12000.0f) * this.indeterminateSpeedScale);
                this.posAnimationProgress = f2;
                if (f2 >= 1.0f) {
                    this.posAnimationProgress = 0.0f;
                }
                float f3 = this.posAnimationProgress;
                int i = (int) (f3 / 0.125f);
                this.phase = i;
                interpolation = 1.0f - ((f3 - (i * 0.125f)) / 0.125f);
            } else if (this.rotatingPreview) {
                float interpolation3 = this.interpolator.getInterpolation(f);
                if (interpolation3 <= 0.25f) {
                    c = 0;
                } else if (interpolation3 <= 0.5f) {
                    c = 1;
                } else {
                    c = interpolation3 <= 0.75f ? (char) 2 : (char) 3;
                }
                GenericProvider genericProvider = this.animationProgressProvider;
                if (genericProvider != null) {
                    this.posAnimationProgress = ((Float) genericProvider.provide(this)).floatValue();
                } else {
                    this.posAnimationProgress += j / (this.rotationBack ? 1000.0f : 2000.0f);
                }
                if (this.posAnimationProgress > 1.0f) {
                    this.posAnimationProgress = 1.0f;
                }
                if (this.animationProgressProvider == null && !this.ignoreInterpolator) {
                    interpolation2 = this.interpolator.getInterpolation(this.posAnimationProgress);
                } else {
                    interpolation2 = this.posAnimationProgress;
                }
                if (this.ignoreInterpolator && (interpolation2 == 0.0f || interpolation2 == 1.0f)) {
                    this.ignoreInterpolator = false;
                }
                if ((c == 0 && interpolation2 > 0.25f) || ((c == 1 && interpolation2 > 0.5f) || (c == 2 && interpolation2 > 0.75f))) {
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
                if (interpolation2 > 0.25f) {
                    if (interpolation2 <= 0.5f) {
                        interpolation2 -= 0.25f;
                    } else {
                        interpolation2 = interpolation2 <= 0.75f ? interpolation2 - 0.5f : interpolation2 - 0.75f;
                    }
                }
                interpolation = interpolation2 / 0.25f;
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
                GenericProvider genericProvider2 = this.animationProgressProvider;
                if (genericProvider2 != null) {
                    this.posAnimationProgress = ((Float) genericProvider2.provide(this)).floatValue();
                } else {
                    this.posAnimationProgress = f + (j / (this.fastAnimation ? 300.0f : 500.0f));
                }
                if (this.posAnimationProgress > 1.0f) {
                    this.posAnimationProgress = 1.0f;
                }
                if (this.animationProgressProvider == null && !this.ignoreInterpolator) {
                    interpolation = this.interpolator.getInterpolation(this.posAnimationProgress);
                } else {
                    interpolation = this.posAnimationProgress;
                }
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
            if (z2) {
                Utilities.generateGradient(this.currentBitmap, this.phase, interpolation, this.colors);
            } else if (interpolation != 1.0f) {
                int i6 = (int) (interpolation / 0.33333334f);
                if (i6 == 0) {
                    this.gradientCanvas.drawBitmap(this.gradientFromBitmap, 0.0f, 0.0f, (Paint) null);
                } else {
                    this.gradientCanvas.drawBitmap(this.gradientToBitmap[i6 - 1], 0.0f, 0.0f, (Paint) null);
                }
                this.paint3.setAlpha((int) (((interpolation - (i6 * 0.33333334f)) / 0.33333334f) * 255.0f));
                this.gradientCanvas.drawBitmap(this.gradientToBitmap[i6], 0.0f, 0.0f, this.paint3);
            } else {
                this.gradientCanvas.drawBitmap(this.gradientToBitmap[2], 0.0f, 0.0f, this.paint3);
            }
            invalidateParent();
        }
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
        this.paint.setAlpha(i);
        this.paint2.setAlpha(i);
    }

    public boolean isOneColor() {
        int[] iArr = this.colors;
        int i = iArr[0];
        return i == iArr[1] && i == iArr[2] && i == iArr[3];
    }

    public void setIndeterminateSpeedScale(float f) {
        this.indeterminateSpeedScale = f;
    }

    public boolean isIndeterminateAnimation() {
        return this.isIndeterminateAnimation;
    }

    public void setIndeterminateAnimation(boolean z) {
        if (!z && this.isIndeterminateAnimation) {
            float f = this.posAnimationProgress;
            this.posAnimationProgress = 1.0f - ((f - (((int) (f / 0.125f)) * 0.125f)) / 0.125f);
            this.ignoreInterpolator = true;
        }
        this.isIndeterminateAnimation = z;
    }

    private void drawGiftImageForNegativeIntensity(Canvas canvas, float f, float f2, float f3) {
        drawGiftImage(canvas, this.giftPosition, f, f2, f3, f3);
    }

    private void drawGiftImageForLegacyNegativeIntensity(Canvas canvas, RectF rectF, int i) {
        drawGiftImageForPositiveIntensity(canvas, rectF, i);
    }

    private void drawGiftImageForPositiveIntensity(Canvas canvas, RectF rectF, int i) {
        if (this.giftPatternPositions == null || this.patternBitmap == null) {
            return;
        }
        drawGiftImage(canvas, i, rectF.left, rectF.top, rectF.width() / this.patternBitmap.getWidth(), rectF.height() / this.patternBitmap.getHeight());
    }

    private void drawGiftImage(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        List list = this.giftPatternPositions;
        if (list == null || this.giftImageReceiver == null || i < 0 || i >= list.size()) {
            return;
        }
        WallpaperGiftPatternPosition wallpaperGiftPatternPosition = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f4);
        canvas.concat(wallpaperGiftPatternPosition.matrix);
        this.giftImageReceiver.setImageCoords(wallpaperGiftPatternPosition.rect);
        this.giftImageReceiver.draw(canvas);
        canvas.restore();
    }

    private Bitmap getOrBuildPatternWithGiftBitmap() {
        Bitmap bitmap = this.patternBitmap;
        if (bitmap == null) {
            return null;
        }
        if (this.patternGiftBitmap == null) {
            return bitmap;
        }
        boolean z = this.patternChangeTracker.isInvalidated(bitmap) || this.giftChangeTracker.isInvalidated(this.patternGiftBitmap) || (this.patternInvertedLastPosition != this.giftPosition);
        Bitmap bitmap2 = this.patternWithGiftBitmap;
        if (bitmap2 != null && !z) {
            return bitmap2;
        }
        int width = this.patternBitmap.getWidth();
        int height = this.patternBitmap.getHeight();
        Bitmap bitmap3 = this.patternWithGiftBitmap;
        if (bitmap3 == null || bitmap3.getWidth() != width || this.patternWithGiftBitmap.getHeight() != height) {
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
        drawGiftPatterns(this.patternWithGiftCanvas, this.patternWithGiftPaint, this.giftPosition);
        this.patternInvertedLastPosition = this.giftPosition;
        this.patternChangeTracker.set(this.patternBitmap);
        this.giftChangeTracker.set(this.patternGiftBitmap);
        return this.patternWithGiftBitmap;
    }

    private void drawGiftPatterns(Canvas canvas, Paint paint, int i) {
        if (this.patternGiftBitmap == null || this.giftPatternPositions == null) {
            return;
        }
        for (int i2 = 0; i2 < this.giftPatternPositions.size(); i2++) {
            if (i2 != i) {
                WallpaperGiftPatternPosition wallpaperGiftPatternPosition = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i2);
                canvas.save();
                canvas.concat(wallpaperGiftPatternPosition.matrix);
                canvas.drawBitmap(this.patternGiftBitmap, (Rect) null, wallpaperGiftPatternPosition.rect, paint);
                canvas.restore();
            }
        }
    }

    private void checkLegacyForNegativeIntensity(int i) {
        if (this.patternBitmap == null) {
            return;
        }
        Bitmap orBuildPatternWithGiftBitmap = getOrBuildPatternWithGiftBitmap();
        if (this.patternWithGiftChangeTracker.isInvalidated(orBuildPatternWithGiftBitmap) || this.patternAlphaInverted == null || this.patternInvertedLastAlpha != i) {
            int width = this.patternBitmap.getWidth();
            int height = this.patternBitmap.getHeight();
            this.patternInvertedLastAlpha = i;
            Bitmap bitmap = this.patternAlphaInverted;
            if (bitmap == null || bitmap.getWidth() != width || this.patternAlphaInverted.getHeight() != height) {
                this.patternAlphaInverted = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            }
            Utilities.applyAlphaInvert(orBuildPatternWithGiftBitmap, this.patternAlphaInverted, i);
        }
        this.patternWithGiftChangeTracker.set(orBuildPatternWithGiftBitmap);
    }
}
