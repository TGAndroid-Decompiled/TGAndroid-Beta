package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ColorShader;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata;

public class MotionBackgroundPaint {
    private final ColorShaderState alphaShader;
    private final ColorShaderState colorShader;
    private final BitmapShaderState gradientShader;
    private final BitmapMemoizedSoftLight gradientSoftLightBitmapMemo;
    private final BitmapShaderState gradientSoftLightShader;
    private float lastHwIntensity;
    private int lastMode;
    private int lastModeHwAgsl;
    private final Paint paint;
    private final Paint paintHwAgsl;
    private final BitmapMemoizedMetadata patterAlphaBitmapMemo;
    private final BitmapShaderState patternShader;
    private final RuntimeShaderState runtimeShaderNegative;
    private final RuntimeShaderState runtimeShaderPositive;
    private final Matrix tmpMatrix;
    private final RectF tmpRectF;
    private static final float[] tmpPts = new float[4];
    private static final float[] tmpOut = new float[4];
    private static final Matrix tmpInverse = new Matrix();

    public MotionBackgroundPaint() {
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.paintHwAgsl = paint2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.gradientShader = new BitmapShaderState(tileMode);
        this.gradientSoftLightShader = new BitmapShaderState(tileMode);
        this.patternShader = new BitmapShaderState(Shader.TileMode.REPEAT);
        this.colorShader = new ColorShaderState();
        this.alphaShader = new ColorShaderState();
        this.patterAlphaBitmapMemo = new BitmapMemoizedMetadata(new BitmapMemoizedMetadata.Provider() {
            @Override
            public final Object get(Bitmap bitmap) {
                return MotionBackgroundPaint.getAlphaChannel(bitmap);
            }

            @Override
            public boolean isValid(Object obj) {
                return BitmapMemoizedMetadata.Provider.CC.$default$isValid(this, obj);
            }
        });
        this.gradientSoftLightBitmapMemo = new BitmapMemoizedSoftLight();
        this.tmpMatrix = new Matrix();
        this.tmpRectF = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            this.runtimeShaderPositive = new RuntimeShaderState(R.raw.wallpaper_pos_intensity);
            this.runtimeShaderNegative = new RuntimeShaderState(R.raw.wallpaper_neg_intensity);
        } else {
            this.runtimeShaderNegative = null;
            this.runtimeShaderPositive = null;
        }
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        paint.setFilterBitmap(true);
        paint.setXfermode(porterDuffXfermode);
        paint2.setXfermode(porterDuffXfermode);
    }

    public Paint getPaint(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, boolean z) {
        if (z && Build.VERSION.SDK_INT >= 33) {
            return getPaintHwAgsl(bitmap, bitmap2, i, i2, i3);
        }
        return getPaintSw(bitmap, bitmap2, i, i2, i3);
    }

    private Paint getPaintHwAgsl(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3) {
        boolean upVar = this.patternShader.setup((Bitmap) this.patterAlphaBitmapMemo.get(bitmap2)) | this.gradientShader.setup(bitmap);
        if (i3 >= 0) {
            if ((this.gradientSoftLightShader.setup(this.gradientSoftLightBitmapMemo.get(bitmap, ColorUtils.setAlphaComponent(i, ((Color.alpha(i) * i2) * i3) / 25500))) | upVar) || this.lastModeHwAgsl != 1) {
                this.lastModeHwAgsl = 1;
                this.runtimeShaderPositive.shader.setInputShader("shaderPattern", this.patternShader.shader);
                this.runtimeShaderPositive.shader.setInputShader("shaderGradient", this.gradientShader.shader);
                this.runtimeShaderPositive.shader.setInputShader("shaderGradientSoftLight", this.gradientSoftLightShader.shader);
                this.runtimeShaderPositive.shader.setFloatUniform("transformGradient", this.runtimeShaderPositive.transformGradient);
                this.runtimeShaderPositive.shader.setFloatUniform("transformPattern", this.runtimeShaderPositive.transformPattern);
                this.paintHwAgsl.setShader(this.runtimeShaderPositive.shader);
            }
        } else {
            float fClamp = MathUtils.clamp((i2 * (-i3)) / 25500.0f, 0.0f, 1.0f);
            if (upVar || this.lastHwIntensity != fClamp || this.lastModeHwAgsl != 2) {
                this.lastModeHwAgsl = 2;
                this.lastHwIntensity = fClamp;
                this.runtimeShaderNegative.shader.setInputShader("shaderPattern", this.patternShader.shader);
                this.runtimeShaderNegative.shader.setInputShader("shaderGradient", this.gradientShader.shader);
                this.runtimeShaderNegative.shader.setFloatUniform("intensity", fClamp);
                this.runtimeShaderNegative.shader.setFloatUniform("transformGradient", this.runtimeShaderNegative.transformGradient);
                this.runtimeShaderNegative.shader.setFloatUniform("transformPattern", this.runtimeShaderNegative.transformPattern);
                this.paintHwAgsl.setShader(this.runtimeShaderNegative.shader);
            }
        }
        return this.paintHwAgsl;
    }

    private Paint getPaintSw(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3) {
        boolean upVar = this.patternShader.setup((Bitmap) this.patterAlphaBitmapMemo.get(bitmap2)) | this.gradientShader.setup(bitmap);
        if (i3 >= 0) {
            if ((this.gradientSoftLightShader.setup(this.gradientSoftLightBitmapMemo.get(bitmap, ColorUtils.setAlphaComponent(i, ((Color.alpha(i) * i2) * i3) / 25500))) | upVar) || this.lastMode != 1) {
                this.lastMode = 1;
                this.paint.setShader(new ComposeShader(this.gradientShader.shader, new ComposeShader(this.gradientSoftLightShader.shader, this.patternShader.shader, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
            }
        } else {
            if ((this.alphaShader.setup(ColorUtils.setAlphaComponent(-1, (i2 * (-i3)) / 100)) | upVar | this.colorShader.setup(-16777216)) || this.lastMode != 2) {
                this.lastMode = 2;
                this.paint.setShader(new ComposeShader(this.colorShader.shader, new ComposeShader(new ComposeShader(this.gradientShader.shader, this.patternShader.shader, PorterDuff.Mode.DST_IN), this.alphaShader.shader, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            }
        }
        return this.paint;
    }

    public void applyGradientMatrix(RectF rectF) {
        RectF rectF2 = this.tmpRectF;
        BitmapShaderState bitmapShaderState = this.gradientShader;
        rectF2.set(0.0f, 0.0f, bitmapShaderState.width, bitmapShaderState.height);
        this.tmpMatrix.setRectToRect(this.tmpRectF, rectF, Matrix.ScaleToFit.FILL);
        this.gradientShader.shader.setLocalMatrix(this.tmpMatrix);
        BitmapShader bitmapShader = this.gradientSoftLightShader.shader;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(this.tmpMatrix);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Matrix matrix = this.tmpMatrix;
            float[] fArr = tmpOut;
            matrixToScaleTranslate(matrix, fArr);
            this.runtimeShaderPositive.setMiniMatrixGradient(fArr);
            this.runtimeShaderNegative.setMiniMatrixGradient(fArr);
        }
    }

    public void applyPatternMatrix(RectF rectF) {
        RectF rectF2 = this.tmpRectF;
        BitmapShaderState bitmapShaderState = this.patternShader;
        rectF2.set(0.0f, 0.0f, bitmapShaderState.width, bitmapShaderState.height);
        this.tmpMatrix.setRectToRect(this.tmpRectF, rectF, Matrix.ScaleToFit.FILL);
        applyPatternMatrix(this.tmpMatrix);
    }

    public void applyPatternMatrix(Matrix matrix) {
        float[] fArr = tmpOut;
        matrixToScaleTranslate(matrix, fArr);
        this.patternShader.shader.setLocalMatrix(matrix);
        BitmapShaderState bitmapShaderState = this.patternShader;
        boolean z = false;
        if (isOne(fArr[0]) && isOne(fArr[1])) {
            z = true;
        }
        bitmapShaderState.setUseNearestInterpolation(z);
        if (Build.VERSION.SDK_INT >= 33) {
            this.runtimeShaderPositive.setMiniMatrixPattern(fArr);
            this.runtimeShaderNegative.setMiniMatrixPattern(fArr);
        }
    }

    private static boolean isOne(float f) {
        return Math.abs(f - 1.0f) <= 1.0E-4f;
    }

    private static class RuntimeShaderState {
        private final RuntimeShader shader;
        private final float[] transformGradient = {1.0f, 1.0f, 0.0f, 0.0f};
        private final float[] transformPattern = {1.0f, 1.0f, 0.0f, 0.0f};

        public RuntimeShaderState(int i) {
            MotionBackgroundPaint$RuntimeShaderState$$ExternalSyntheticApiModelOutline1.m();
            this.shader = MotionBackgroundPaint$RuntimeShaderState$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.readRes(i));
        }

        public void setMiniMatrixGradient(float[] fArr) {
            if (Arrays.equals(fArr, this.transformGradient)) {
                return;
            }
            System.arraycopy(fArr, 0, this.transformGradient, 0, 4);
            this.shader.setFloatUniform("transformGradient", this.transformGradient);
        }

        public void setMiniMatrixPattern(float[] fArr) {
            if (Arrays.equals(fArr, this.transformPattern)) {
                return;
            }
            System.arraycopy(fArr, 0, this.transformPattern, 0, 4);
            this.shader.setFloatUniform("transformPattern", this.transformPattern);
        }
    }

    private static class ColorShaderState {
        int color;
        ColorShader shader;

        private ColorShaderState() {
        }

        public boolean setup(int i) {
            if (this.shader != null && this.color == i) {
                return false;
            }
            this.color = i;
            this.shader = new ColorShader(i);
            return true;
        }
    }

    private static class BitmapShaderState {
        WeakReference bitmap;
        int height;
        BitmapShader shader;
        final Shader.TileMode tileMode;
        boolean useNearestInterpolation;
        int width;

        public BitmapShaderState(Shader.TileMode tileMode) {
            this.tileMode = tileMode;
        }

        public boolean setup(Bitmap bitmap) {
            this.width = bitmap.getWidth();
            this.height = bitmap.getHeight();
            WeakReference weakReference = this.bitmap;
            if (weakReference != null && weakReference.get() == bitmap) {
                return false;
            }
            this.bitmap = new WeakReference(bitmap);
            Shader.TileMode tileMode = this.tileMode;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.shader = bitmapShader;
            if (Build.VERSION.SDK_INT >= 33) {
                bitmapShader.setFilterMode(this.useNearestInterpolation ? 1 : 2);
            }
            return true;
        }

        public void setUseNearestInterpolation(boolean z) {
            BitmapShader bitmapShader;
            if (this.useNearestInterpolation != z) {
                this.useNearestInterpolation = z;
                if (Build.VERSION.SDK_INT < 33 || (bitmapShader = this.shader) == null) {
                    return;
                }
                bitmapShader.setFilterMode(z ? 1 : 2);
            }
        }
    }

    private static class BitmapMemoizedSoftLight {
        private long generationId;
        private int lastColor;
        private Bitmap memoized;
        private WeakReference ref;

        private BitmapMemoizedSoftLight() {
        }

        public Bitmap get(Bitmap bitmap, int i) {
            WeakReference weakReference = this.ref;
            Bitmap bitmap2 = weakReference != null ? (Bitmap) weakReference.get() : null;
            long generationId = !bitmap.isRecycled() ? bitmap.getGenerationId() : 0L;
            if (bitmap2 == bitmap && generationId == this.generationId && i == this.lastColor) {
                return this.memoized;
            }
            this.ref = new WeakReference(bitmap);
            this.generationId = generationId;
            this.lastColor = i;
            Bitmap bitmap3 = this.memoized;
            if (bitmap3 == null || bitmap3.getWidth() != bitmap.getWidth() || this.memoized.getHeight() != bitmap.getHeight()) {
                this.memoized = Bitmap.createBitmap(bitmap);
            }
            Utilities.applySoftLight(bitmap, this.memoized, i);
            return this.memoized;
        }
    }

    public static Bitmap getAlphaChannel(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    private static void matrixToScaleTranslate(Matrix matrix, float[] fArr) {
        Matrix matrix2 = tmpInverse;
        matrix.invert(matrix2);
        float[] fArr2 = tmpPts;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        matrix2.mapPoints(fArr2);
        fArr[0] = fArr2[2] - fArr2[0];
        fArr[1] = fArr2[3] - fArr2[1];
        fArr[2] = fArr2[0];
        fArr[3] = fArr2[1];
    }
}
