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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperGiftPatternPosition;
import org.telegram.tgnet.TLRPC;

public class MotionBackgroundDrawable extends Drawable {
    private static boolean errorWhileGenerateLegacyBitmap;
    private static float legacyBitmapScale;
    private static final boolean useLegacyBitmap;
    private static final boolean useSoftLight;
    private int alpha;
    private GenericProvider animationProgressProvider;
    private float backgroundAlpha;
    private BitmapShader bitmapGiftShader;
    private int bitmapHeight;
    private BitmapShader bitmapShader;
    private int bitmapWidth;
    private int[] colors;
    private Bitmap currentBitmap;
    private boolean disableGradientShaderScaling;
    private boolean fastAnimation;
    private ImageReceiver giftImageReceiver;
    private List giftPatternPositions;
    private int giftPosition;
    private Canvas gradientCanvas;
    private GradientDrawable gradientDrawable;
    private Bitmap gradientFromBitmap;
    private Canvas gradientFromCanvas;
    private BitmapShader gradientGiftShader;
    private BitmapShader gradientShader;
    private Bitmap[] gradientToBitmap;
    private boolean ignoreInterpolator;
    private float indeterminateSpeedScale;
    private int intensity;
    private final CubicBezierInterpolator interpolator;
    private boolean invalidateLegacy;
    public boolean isAttached;
    private boolean isIndeterminateAnimation;
    public boolean isPreview;
    private long lastUpdateTime;
    private Bitmap legacyBitmap;
    private Bitmap legacyBitmap2;
    private int legacyBitmapColor;
    private ColorFilter legacyBitmapColorFilter;
    private Canvas legacyCanvas;
    private Canvas legacyCanvas2;
    private final Paint legacyPaintNegativeIntensityGradient;
    private final Paint legacyPaintNegativeIntensityPattern;
    private Matrix matrix;
    private MotionBackgroundPaint motionBackgroundPaint;
    private Paint overrideBitmapPaint;
    private Paint paint;
    private Paint paint2;
    private final Paint paint2Gift;
    private Paint paint3;
    private WeakReference parentView;
    private float patternAlpha;
    private Bitmap patternBitmap;
    private android.graphics.Rect patternBounds;
    private int patternColor;
    private ColorFilter patternColorFilter;
    private Bitmap patternGiftBitmap;
    private int phase;
    public float posAnimationProgress;
    private boolean postInvalidateParent;
    private RectF rect;
    private boolean rotatingPreview;
    private boolean rotationBack;
    private int roundRadius;
    private final Matrix tmpMatrix;
    private final Matrix tmpMatrix2;
    private final Matrix tmpMatrix3;
    private int translationY;
    private Runnable updateAnimationRunnable;

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
        errorWhileGenerateLegacyBitmap = false;
        legacyBitmapScale = 0.7f;
    }

    public void lambda$new$0() {
        updateAnimation(true);
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
        this.legacyPaintNegativeIntensityPattern = new Paint(2);
        this.legacyPaintNegativeIntensityGradient = new Paint(2);
        this.intensity = 100;
        this.paint2Gift = new Paint(2);
        this.gradientDrawable = new GradientDrawable();
        this.updateAnimationRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        this.patternBounds = new android.graphics.Rect();
        this.patternAlpha = 1.0f;
        this.backgroundAlpha = 1.0f;
        this.alpha = 255;
        this.indeterminateSpeedScale = 1.0f;
        this.bitmapWidth = 60;
        this.bitmapHeight = 80;
        this.patternColor = -16777216;
        this.tmpMatrix = new Matrix();
        this.tmpMatrix2 = new Matrix();
        this.tmpMatrix3 = new Matrix();
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
        this.legacyPaintNegativeIntensityPattern = new Paint(2);
        this.legacyPaintNegativeIntensityGradient = new Paint(2);
        this.intensity = 100;
        this.paint2Gift = new Paint(2);
        this.gradientDrawable = new GradientDrawable();
        this.updateAnimationRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        this.patternBounds = new android.graphics.Rect();
        this.patternAlpha = 1.0f;
        this.backgroundAlpha = 1.0f;
        this.alpha = 255;
        this.indeterminateSpeedScale = 1.0f;
        this.bitmapWidth = 60;
        this.bitmapHeight = 80;
        this.patternColor = -16777216;
        this.tmpMatrix = new Matrix();
        this.tmpMatrix2 = new Matrix();
        this.tmpMatrix3 = new Matrix();
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
        Utilities.generateGradient(this.currentBitmap, true, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.currentBitmap.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
        if (useSoftLight) {
            this.paint2.setBlendMode(BlendMode.SOFT_LIGHT);
        }
        this.legacyPaintNegativeIntensityGradient.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public void setFastRenderAllowed() {
        if (this.motionBackgroundPaint != null || SharedConfig.fastWallpaperDisabled || Build.VERSION.SDK_INT < 28) {
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

    @Override
    public void setBounds(android.graphics.Rect rect) {
        super.setBounds(rect);
        this.patternBounds.set(rect);
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
        Utilities.generateGradient(this.currentBitmap, true, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.currentBitmap.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
    }

    public float getPosAnimationProgress() {
        return this.posAnimationProgress;
    }

    public void setPosAnimationProgress(float f) {
        this.posAnimationProgress = f;
        updateAnimation(true);
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
        if (useLegacyBitmap && this.intensity < 0) {
            try {
                if (this.legacyBitmap != null) {
                    Bitmap bitmap = this.legacyBitmap2;
                    if (bitmap == null || bitmap.getHeight() != this.legacyBitmap.getHeight() || this.legacyBitmap2.getWidth() != this.legacyBitmap.getWidth()) {
                        Bitmap bitmap2 = this.legacyBitmap2;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.legacyBitmap2 = Bitmap.createBitmap(this.legacyBitmap.getWidth(), this.legacyBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                        this.legacyCanvas2 = new Canvas(this.legacyBitmap2);
                    } else {
                        this.legacyBitmap2.eraseColor(0);
                    }
                    this.legacyCanvas2.drawBitmap(this.legacyBitmap, 0.0f, 0.0f, (Paint) null);
                }
            } catch (Throwable th) {
                FileLog.e(th);
                Bitmap bitmap3 = this.legacyBitmap2;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    this.legacyBitmap2 = null;
                }
            }
            Bitmap bitmap4 = this.currentBitmap;
            Utilities.generateGradient(bitmap4, true, this.phase, 1.0f, bitmap4.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
            this.invalidateLegacy = true;
        }
        int i = -1;
        while (i < 3) {
            int i2 = i + 1;
            Utilities.generateGradient(i < 0 ? this.gradientFromBitmap : this.gradientToBitmap[i], true, this.phase, i2 / 3.0f, this.currentBitmap.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
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
        Utilities.generateGradient(this.gradientFromBitmap, true, this.phase, 0.0f, this.currentBitmap.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
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
        Utilities.generateGradient(bitmap, true, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.currentBitmap.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
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
            Utilities.generateGradient(bitmap, true, this.phase, this.interpolator.getInterpolation(this.posAnimationProgress), this.currentBitmap.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
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
            updateAnimation(false);
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
        this.invalidateLegacy = true;
        if (this.intensity < 0) {
            if (!useLegacyBitmap) {
                Bitmap bitmap2 = this.currentBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.bitmapGiftShader = new BitmapShader(bitmap2, tileMode, tileMode);
                Bitmap bitmap3 = this.patternGiftBitmap;
                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                this.gradientGiftShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                this.paint2Gift.setShader(new ComposeShader(this.bitmapGiftShader, this.gradientGiftShader, PorterDuff.Mode.DST_IN));
                this.paint2Gift.setFilterBitmap(true);
            } else {
                createLegacyBitmap();
                if (!errorWhileGenerateLegacyBitmap) {
                    this.paint2Gift.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                } else {
                    this.paint2Gift.setXfermode(null);
                }
            }
        } else if (useLegacyBitmap) {
            this.paint2Gift.setXfermode(null);
        }
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
        this.invalidateLegacy = true;
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
            createLegacyBitmap();
            if (!errorWhileGenerateLegacyBitmap) {
                this.paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                return;
            } else {
                this.paint2.setXfermode(null);
                return;
            }
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
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.patternBounds.set(i, i2, i3, i4);
        createLegacyBitmap();
    }

    private void createLegacyBitmap() {
        if (!useLegacyBitmap || this.intensity >= 0 || errorWhileGenerateLegacyBitmap) {
            return;
        }
        int iWidth = (int) (this.patternBounds.width() * legacyBitmapScale);
        int iHeight = (int) (this.patternBounds.height() * legacyBitmapScale);
        if (iWidth <= 0 || iHeight <= 0) {
            return;
        }
        Bitmap bitmap = this.legacyBitmap;
        if (bitmap != null && bitmap.getWidth() == iWidth && this.legacyBitmap.getHeight() == iHeight) {
            return;
        }
        Bitmap bitmap2 = this.legacyBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        Bitmap bitmap3 = this.legacyBitmap2;
        if (bitmap3 != null) {
            bitmap3.recycle();
            this.legacyBitmap2 = null;
        }
        try {
            this.legacyBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            this.legacyCanvas = new Canvas(this.legacyBitmap);
            this.invalidateLegacy = true;
        } catch (Throwable th) {
            Bitmap bitmap4 = this.legacyBitmap;
            if (bitmap4 != null) {
                bitmap4.recycle();
                this.legacyBitmap = null;
            }
            FileLog.e(th);
            errorWhileGenerateLegacyBitmap = true;
            this.paint2.setXfermode(null);
        }
    }

    public void drawBackground(Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.save();
        float f = this.patternBitmap != null ? bounds.top : this.translationY;
        int width = this.currentBitmap.getWidth();
        int height = this.currentBitmap.getHeight();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        float f2 = width;
        float f3 = height;
        float fMax = Math.max(fWidth / f2, fHeight / f3);
        float f4 = f2 * fMax;
        float f5 = f3 * fMax;
        float f6 = (fWidth - f4) / 2.0f;
        float f7 = (fHeight - f5) / 2.0f;
        if (this.isPreview) {
            int i = bounds.left;
            f6 += i;
            int i2 = bounds.top;
            f7 += i2;
            canvas.clipRect(i, i2, bounds.right, bounds.bottom);
        }
        if (this.intensity < 0) {
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.alpha * this.backgroundAlpha)));
        } else if (this.roundRadius != 0) {
            this.matrix.reset();
            this.matrix.setTranslate(f6, f7);
            float fMin = 1.0f / Math.min(this.currentBitmap.getWidth() / bounds.width(), this.currentBitmap.getHeight() / bounds.height());
            this.matrix.preScale(fMin, fMin);
            this.bitmapShader.setLocalMatrix(this.matrix);
            BitmapShader bitmapShader = this.bitmapGiftShader;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.matrix);
            }
            this.rect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            int alpha = this.paint.getAlpha();
            this.paint.setAlpha((int) (alpha * this.backgroundAlpha));
            RectF rectF = this.rect;
            float f8 = this.roundRadius;
            canvas.drawRoundRect(rectF, f8, f8, this.paint);
            this.paint.setAlpha(alpha);
        } else {
            canvas.translate(0.0f, f);
            GradientDrawable gradientDrawable = this.gradientDrawable;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds((int) f6, (int) f7, (int) (f6 + f4), (int) (f7 + f5));
                this.gradientDrawable.setAlpha((int) (this.backgroundAlpha * 255.0f));
                this.gradientDrawable.draw(canvas);
            } else {
                this.rect.set(f6, f7, f4 + f6, f5 + f7);
                Paint paint = this.overrideBitmapPaint;
                if (paint == null) {
                    paint = this.paint;
                }
                int alpha2 = paint.getAlpha();
                paint.setAlpha((int) (alpha2 * this.backgroundAlpha));
                canvas.drawBitmap(this.currentBitmap, (android.graphics.Rect) null, this.rect, paint);
                paint.setAlpha(alpha2);
            }
        }
        canvas.restore();
        updateAnimation(true);
    }

    public void drawPattern(android.graphics.Canvas r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.MotionBackgroundDrawable.drawPattern(android.graphics.Canvas):void");
    }

    @Override
    public void draw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.MotionBackgroundDrawable.draw(android.graphics.Canvas):void");
    }

    public void setAnimationProgressProvider(GenericProvider genericProvider) {
        this.animationProgressProvider = genericProvider;
        updateAnimation(true);
    }

    public void updateAnimation(boolean z) {
        float interpolation;
        float f;
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
        boolean z2 = this.isIndeterminateAnimation;
        if (z2 && this.posAnimationProgress == 1.0f) {
            this.posAnimationProgress = 0.0f;
        }
        float f2 = this.posAnimationProgress;
        if (f2 < 1.0f) {
            boolean z3 = this.postInvalidateParent || this.rotatingPreview;
            if (z2) {
                float f3 = f2 + ((j / 12000.0f) * this.indeterminateSpeedScale);
                this.posAnimationProgress = f3;
                if (f3 >= 1.0f) {
                    this.posAnimationProgress = 0.0f;
                }
                float f4 = this.posAnimationProgress;
                int i = (int) (f4 / 0.125f);
                this.phase = i;
                f = 1.0f - ((f4 - (i * 0.125f)) / 0.125f);
                z3 = true;
            } else if (this.rotatingPreview) {
                float interpolation3 = this.interpolator.getInterpolation(f2);
                char c = interpolation3 <= 0.25f ? (char) 0 : interpolation3 <= 0.5f ? (char) 1 : interpolation3 <= 0.75f ? (char) 2 : (char) 3;
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
                    interpolation2 = interpolation2 <= 0.5f ? interpolation2 - 0.25f : interpolation2 <= 0.75f ? interpolation2 - 0.5f : interpolation2 - 0.75f;
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
                        f = 1.0f;
                    }
                }
                f = interpolation;
            } else {
                GenericProvider genericProvider2 = this.animationProgressProvider;
                if (genericProvider2 != null) {
                    this.posAnimationProgress = ((Float) genericProvider2.provide(this)).floatValue();
                } else {
                    this.posAnimationProgress = f2 + (j / (this.fastAnimation ? 300.0f : 500.0f));
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
                        f = 1.0f;
                    }
                }
                f = interpolation;
            }
            if (z3) {
                Bitmap bitmap = this.currentBitmap;
                Utilities.generateGradient(bitmap, true, this.phase, f, bitmap.getWidth(), this.currentBitmap.getHeight(), this.currentBitmap.getRowBytes(), this.colors);
                this.invalidateLegacy = true;
            } else if (!useLegacyBitmap || this.intensity >= 0) {
                if (f != 1.0f) {
                    int i6 = (int) (f / 0.33333334f);
                    if (i6 == 0) {
                        this.gradientCanvas.drawBitmap(this.gradientFromBitmap, 0.0f, 0.0f, (Paint) null);
                    } else {
                        this.gradientCanvas.drawBitmap(this.gradientToBitmap[i6 - 1], 0.0f, 0.0f, (Paint) null);
                    }
                    this.paint3.setAlpha((int) (((f - (i6 * 0.33333334f)) / 0.33333334f) * 255.0f));
                    this.gradientCanvas.drawBitmap(this.gradientToBitmap[i6], 0.0f, 0.0f, this.paint3);
                } else {
                    this.gradientCanvas.drawBitmap(this.gradientToBitmap[2], 0.0f, 0.0f, this.paint3);
                }
            }
            if (z) {
                invalidateParent();
            }
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
            this.posAnimationProgress = 1.0f - ((this.posAnimationProgress - (((int) (r0 / 0.125f)) * 0.125f)) / 0.125f);
            this.ignoreInterpolator = true;
        }
        this.isIndeterminateAnimation = z;
    }

    private void drawGiftPatternsForNegativeIntensity(Canvas canvas, float f, float f2, float f3) {
        BitmapShader bitmapShader;
        ImageReceiver imageReceiver;
        if (this.giftPatternPositions == null || this.gradientGiftShader == null || (bitmapShader = this.bitmapGiftShader) == null || this.patternGiftBitmap == null) {
            return;
        }
        bitmapShader.getLocalMatrix(this.tmpMatrix);
        this.paint2Gift.setColorFilter(null);
        this.paint2Gift.setAlpha((int) ((Math.abs(this.intensity) / 100.0f) * this.alpha * this.patternAlpha * 0.8f));
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        for (int i = 0; i < this.giftPatternPositions.size(); i++) {
            WallpaperGiftPatternPosition wallpaperGiftPatternPosition = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i);
            canvas.save();
            canvas.concat(wallpaperGiftPatternPosition.matrix);
            if (i == this.giftPosition && (imageReceiver = this.giftImageReceiver) != null) {
                imageReceiver.setImageCoords(wallpaperGiftPatternPosition.rect);
                this.giftImageReceiver.draw(canvas);
            } else {
                wallpaperGiftPatternPosition.matrix.invert(this.tmpMatrix2);
                this.tmpMatrix2.preConcat(this.tmpMatrix);
                this.bitmapGiftShader.setLocalMatrix(this.tmpMatrix2);
                this.tmpMatrix3.reset();
                this.tmpMatrix3.setScale(wallpaperGiftPatternPosition.rect.width() / this.patternGiftBitmap.getWidth(), wallpaperGiftPatternPosition.rect.height() / this.patternGiftBitmap.getHeight());
                Matrix matrix = this.tmpMatrix3;
                RectF rectF = wallpaperGiftPatternPosition.rect;
                matrix.postTranslate(rectF.left, rectF.top);
                this.gradientGiftShader.setLocalMatrix(this.tmpMatrix3);
                canvas.drawRect(wallpaperGiftPatternPosition.rect, this.paint2Gift);
            }
            canvas.restore();
        }
        canvas.restore();
    }

    private void drawGiftPatternsForPositiveIntensity(Canvas canvas, RectF rectF, Paint paint, int i) {
        ImageReceiver imageReceiver;
        if (this.patternGiftBitmap == null || this.giftPatternPositions == null) {
            return;
        }
        canvas.save();
        float fWidth = rectF.width() / this.patternBitmap.getWidth();
        float fHeight = rectF.height() / this.patternBitmap.getHeight();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(fWidth, fHeight);
        for (int i2 = 0; i2 < this.giftPatternPositions.size(); i2++) {
            WallpaperGiftPatternPosition wallpaperGiftPatternPosition = (WallpaperGiftPatternPosition) this.giftPatternPositions.get(i2);
            canvas.save();
            canvas.concat(wallpaperGiftPatternPosition.matrix);
            if (i2 == i && (imageReceiver = this.giftImageReceiver) != null) {
                imageReceiver.setImageCoords(wallpaperGiftPatternPosition.rect);
                this.giftImageReceiver.draw(canvas);
            } else {
                canvas.drawBitmap(this.patternGiftBitmap, (android.graphics.Rect) null, wallpaperGiftPatternPosition.rect, paint);
            }
            canvas.restore();
        }
        canvas.restore();
    }
}
