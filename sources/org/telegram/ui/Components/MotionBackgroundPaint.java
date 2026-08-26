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
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.blur3.utils.BitmapChangeTracker;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata;

public class MotionBackgroundPaint {
    private static final int MODE_NEG = 2;
    private static final int MODE_POS = 1;
    private final AgslImpl agslImpl;
    private int gradientHeight;
    private int gradientWidth;
    private int patternHeight;
    private int patternWidth;
    private static final float[] tmpPts = new float[4];
    private static final Matrix tmpInverse = new Matrix();
    private final BitmapMemoizedMetadata patterAlphaBitmapMemo = new BitmapMemoizedMetadata(new EmojiView$$ExternalSyntheticLambda30(15));
    private final BitmapMemoizedSoftLight gradientSoftLightBitmapMemo = new BitmapMemoizedSoftLight();
    private final ShaderImpl shaderImpl = new ShaderImpl();
    private final Matrix tmpMatrix = new Matrix();
    private final RectF tmpRectF = new RectF();

    public static class AgslImpl {
        private final BitmapShaderState gradientShader;
        private final BitmapShaderState gradientSoftLightShader;
        private float lastIntensity;
        private int lastMode;
        private final Paint paint;
        private final BitmapShaderState patternShader;
        private final RuntimeShaderState runtimeShaderNegative;
        private final RuntimeShaderState runtimeShaderPositive;
        private final float[] tmpOut;

        public static class RuntimeShaderState {
            private final RuntimeShader shader;
            private final float[] transformGradient = {1.0f, 1.0f, 0.0f, 0.0f};
            private final float[] transformPattern = {1.0f, 1.0f, 0.0f, 0.0f};

            public RuntimeShaderState(int i) {
                Theme$$ExternalSyntheticApiModelOutline0.m1060m();
                this.shader = Theme$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.readRes(i));
            }

            private void setMatrixUniformGradient() {
                this.shader.setFloatUniform("transformGradient", this.transformGradient);
            }

            private void setMatrixUniformPattern() {
                this.shader.setFloatUniform("transformPattern", this.transformPattern);
            }

            public void setMatrixUniforms() {
                setMatrixUniformGradient();
                setMatrixUniformPattern();
            }

            public void setMiniMatrixGradient(float[] fArr) {
                if (Arrays.equals(fArr, this.transformGradient)) {
                    return;
                }
                System.arraycopy(fArr, 0, this.transformGradient, 0, 4);
                setMatrixUniformGradient();
            }

            public void setMiniMatrixPattern(float[] fArr) {
                if (Arrays.equals(fArr, this.transformPattern)) {
                    return;
                }
                System.arraycopy(fArr, 0, this.transformPattern, 0, 4);
                setMatrixUniformPattern();
            }
        }

        public AgslImpl() {
            Paint paint = new Paint();
            this.paint = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.gradientShader = new BitmapShaderState(tileMode);
            this.gradientSoftLightShader = new BitmapShaderState(tileMode);
            this.patternShader = new BitmapShaderState(Shader.TileMode.REPEAT);
            this.runtimeShaderPositive = new RuntimeShaderState(R.raw.wallpaper_pos_intensity);
            this.runtimeShaderNegative = new RuntimeShaderState(R.raw.wallpaper_neg_intensity);
            this.tmpOut = new float[4];
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }

        public void applyGradientMatrix(Matrix matrix) {
            MotionBackgroundPaint.matrixToScaleTranslate(matrix, this.tmpOut);
            this.runtimeShaderPositive.setMiniMatrixGradient(this.tmpOut);
            this.runtimeShaderNegative.setMiniMatrixGradient(this.tmpOut);
        }

        public void applyPatternMatrix(Matrix matrix) {
            MotionBackgroundPaint.matrixToScaleTranslate(matrix, this.tmpOut);
            BitmapShaderState bitmapShaderState = this.patternShader;
            boolean z = false;
            if (MotionBackgroundPaint.isOne(this.tmpOut[0]) && MotionBackgroundPaint.isOne(this.tmpOut[1])) {
                z = true;
            }
            bitmapShaderState.setUseNearestInterpolation(z);
            this.runtimeShaderPositive.setMiniMatrixPattern(this.tmpOut);
            this.runtimeShaderNegative.setMiniMatrixPattern(this.tmpOut);
        }

        public Paint getPaint(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, int i2) {
            boolean upVar = this.gradientShader.setup(bitmap) | this.patternShader.setup(bitmap2);
            if (i2 < 0) {
                float fClamp = MathUtils.clamp((i * (-i2)) / 25500.0f, 0.0f, 1.0f);
                if (upVar || this.lastIntensity != fClamp || this.lastMode != 2) {
                    this.lastMode = 2;
                    this.lastIntensity = fClamp;
                    this.runtimeShaderNegative.shader.setInputBuffer("shaderPattern", this.patternShader.shader);
                    this.runtimeShaderNegative.shader.setInputBuffer("shaderGradient", this.gradientShader.shader);
                    this.runtimeShaderNegative.shader.setFloatUniform("intensity", fClamp);
                    this.runtimeShaderNegative.setMatrixUniforms();
                    this.paint.setShader(this.runtimeShaderNegative.shader);
                }
            } else if ((upVar | this.gradientSoftLightShader.setup(bitmap3)) || this.lastMode != 1) {
                this.lastMode = 1;
                this.runtimeShaderPositive.shader.setInputBuffer("shaderPattern", this.patternShader.shader);
                this.runtimeShaderPositive.shader.setInputBuffer("shaderGradient", this.gradientShader.shader);
                this.runtimeShaderPositive.shader.setInputBuffer("shaderGradientSoftLight", this.gradientSoftLightShader.shader);
                this.runtimeShaderPositive.setMatrixUniforms();
                this.paint.setShader(this.runtimeShaderPositive.shader);
            }
            return this.paint;
        }
    }

    public static class BitmapMemoizedSoftLight {
        private final BitmapChangeTracker lastBitmap;
        private int lastColor;
        private Bitmap memoized;

        private BitmapMemoizedSoftLight() {
            this.lastBitmap = new BitmapChangeTracker();
        }

        public Bitmap get(Bitmap bitmap, int i) {
            if (this.lastBitmap.isInvalidated(bitmap) || i != this.lastColor || this.memoized == null) {
                Bitmap bitmap2 = this.memoized;
                if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.memoized.getHeight() != bitmap.getHeight()) {
                    this.memoized = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, this.memoized, i);
                this.lastBitmap.set(bitmap);
                this.lastColor = i;
            }
            return this.memoized;
        }
    }

    public static class BitmapShaderState {
        WeakReference<Bitmap> bitmap;
        final Matrix localMatrix = new Matrix();
        BitmapShader shader;
        final Shader.TileMode tileMode;
        boolean useNearestInterpolation;

        public BitmapShaderState(Shader.TileMode tileMode) {
            this.tileMode = tileMode;
        }

        public void setLocalMatrix(Matrix matrix) {
            this.localMatrix.set(matrix);
            BitmapShader bitmapShader = this.shader;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(matrix);
            }
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

        public boolean setup(Bitmap bitmap) {
            WeakReference<Bitmap> weakReference = this.bitmap;
            if (weakReference != null && weakReference.get() == bitmap) {
                return false;
            }
            this.bitmap = new WeakReference<>(bitmap);
            Shader.TileMode tileMode = this.tileMode;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.shader = bitmapShader;
            bitmapShader.setLocalMatrix(this.localMatrix);
            if (Build.VERSION.SDK_INT >= 33) {
                this.shader.setFilterMode(this.useNearestInterpolation ? 1 : 2);
            }
            return true;
        }
    }

    public static class ShaderImpl {
        private final ColorShaderState alphaShader;
        private final ColorShaderState colorShader;
        private final BitmapShaderState gradientShader;
        private final BitmapShaderState gradientSoftLightShader;
        private int lastMode;
        private final Paint paint;
        private final BitmapShaderState patternShader;
        private final float[] tmpOut;

        public static class ColorShaderState {
            int color;
            ColorShader shader;

            private ColorShaderState() {
            }

            public boolean setup(int i) {
                if (this.shader != null && this.color == i) {
                    return false;
                }
                this.color = i;
                this.shader = new ColorShader(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i, i}, null, Shader.TileMode.CLAMP);
                return true;
            }
        }

        public ShaderImpl() {
            Paint paint = new Paint();
            this.paint = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.gradientShader = new BitmapShaderState(tileMode);
            this.gradientSoftLightShader = new BitmapShaderState(tileMode);
            this.patternShader = new BitmapShaderState(Shader.TileMode.REPEAT);
            this.colorShader = new ColorShaderState();
            this.alphaShader = new ColorShaderState();
            this.tmpOut = new float[4];
            paint.setFilterBitmap(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }

        public void applyGradientMatrix(Matrix matrix) {
            this.gradientShader.setLocalMatrix(matrix);
            this.gradientSoftLightShader.setLocalMatrix(matrix);
        }

        public void applyPatternMatrix(Matrix matrix) {
            MotionBackgroundPaint.matrixToScaleTranslate(matrix, this.tmpOut);
            this.patternShader.setLocalMatrix(matrix);
            BitmapShaderState bitmapShaderState = this.patternShader;
            boolean z = false;
            if (MotionBackgroundPaint.isOne(this.tmpOut[0]) && MotionBackgroundPaint.isOne(this.tmpOut[1])) {
                z = true;
            }
            bitmapShaderState.setUseNearestInterpolation(z);
        }

        public Paint getPaint(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, int i2) {
            boolean upVar = this.gradientShader.setup(bitmap) | this.patternShader.setup(bitmap2);
            if (i2 < 0) {
                if ((upVar | this.alphaShader.setup(ColorUtils.setAlphaComponent(-1, (i * (-i2)) / 100)) | this.colorShader.setup(-16777216)) || this.lastMode != 2) {
                    this.lastMode = 2;
                    this.paint.setShader(new ComposeShader(this.colorShader.shader, new ComposeShader(new ComposeShader(this.gradientShader.shader, this.patternShader.shader, PorterDuff.Mode.DST_IN), this.alphaShader.shader, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
                }
            } else if ((upVar | this.gradientSoftLightShader.setup(bitmap3)) || this.lastMode != 1) {
                this.lastMode = 1;
                this.paint.setShader(new ComposeShader(this.gradientShader.shader, new ComposeShader(this.gradientSoftLightShader.shader, this.patternShader.shader, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
            }
            return this.paint;
        }
    }

    public MotionBackgroundPaint() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.agslImpl = new AgslImpl();
        } else {
            this.agslImpl = null;
        }
    }

    public static Bitmap getAlphaChannel(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    public static boolean isOne(float f) {
        return Math.abs(f - 1.0f) <= 1.0E-4f;
    }

    public static void matrixToScaleTranslate(Matrix matrix, float[] fArr) {
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

    public void applyGradientMatrix(RectF rectF) {
        this.tmpRectF.set(0.0f, 0.0f, this.gradientWidth, this.gradientHeight);
        this.tmpMatrix.setRectToRect(this.tmpRectF, rectF, Matrix.ScaleToFit.FILL);
        this.shaderImpl.applyGradientMatrix(this.tmpMatrix);
        AgslImpl agslImpl = this.agslImpl;
        if (agslImpl == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        agslImpl.applyGradientMatrix(this.tmpMatrix);
    }

    public void applyPatternMatrix(RectF rectF) {
        this.tmpRectF.set(0.0f, 0.0f, this.patternWidth, this.patternHeight);
        this.tmpMatrix.setRectToRect(this.tmpRectF, rectF, Matrix.ScaleToFit.FILL);
        applyPatternMatrix(this.tmpMatrix);
    }

    public Paint getPaint(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, boolean z) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.patterAlphaBitmapMemo.get(bitmap2);
        if (i3 >= 0) {
            bitmap3 = this.gradientSoftLightBitmapMemo.get(bitmap, ColorUtils.setAlphaComponent(i, ((Color.alpha(i) * i2) * i3) / 25500));
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap5 = bitmap3;
        this.gradientWidth = bitmap.getWidth();
        this.gradientHeight = bitmap.getHeight();
        this.patternWidth = bitmap4.getWidth();
        this.patternHeight = bitmap4.getHeight();
        AgslImpl agslImpl = this.agslImpl;
        return (agslImpl == null || !z || Build.VERSION.SDK_INT < 33) ? this.shaderImpl.getPaint(bitmap, bitmap4, bitmap5, i2, i3) : agslImpl.getPaint(bitmap, bitmap4, bitmap5, i2, i3);
    }

    public void applyPatternMatrix(Matrix matrix) {
        this.shaderImpl.applyPatternMatrix(matrix);
        AgslImpl agslImpl = this.agslImpl;
        if (agslImpl == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        agslImpl.applyPatternMatrix(matrix);
    }
}
