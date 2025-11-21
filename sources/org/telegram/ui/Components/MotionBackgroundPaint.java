package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.ColorUtils;
import java.lang.ref.WeakReference;
import org.telegram.messenger.utils.ColorShader;

public class MotionBackgroundPaint {
    private ColorShader alphaShader;
    private int alphaShaderLastAlpha;
    private ColorShader colorShader;
    private int colorShaderLastColor;
    private final BitmapShaderState gradientShader;
    private final Paint paint;
    private final BitmapShaderState patternShader;
    private final Matrix tmpMatrix;
    private final RectF tmpRectF;

    public MotionBackgroundPaint() {
        BlendMode blendMode;
        Paint paint = new Paint();
        this.paint = paint;
        this.gradientShader = new BitmapShaderState(Shader.TileMode.CLAMP);
        this.patternShader = new BitmapShaderState(Shader.TileMode.REPEAT);
        this.tmpMatrix = new Matrix();
        this.tmpRectF = new RectF();
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC;
            paint.setBlendMode(blendMode);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        paint.setFilterBitmap(true);
    }

    public Paint getPaint(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        int i3;
        boolean z;
        BlendMode blendMode;
        int i4 = 255;
        if (i2 >= 0) {
            i3 = ColorUtils.setAlphaComponent(i, (Color.alpha(i) * i2) / 100);
        } else {
            i4 = ((-i2) * 255) / 100;
            i3 = -16777216;
        }
        boolean z2 = true;
        if (this.colorShaderLastColor != i3 || this.colorShader == null) {
            this.colorShaderLastColor = i3;
            this.colorShader = new ColorShader(i3);
            z = true;
        } else {
            z = false;
        }
        if (this.alphaShaderLastAlpha != i4 || this.alphaShader == null) {
            this.alphaShaderLastAlpha = i4;
            this.alphaShader = new ColorShader(ColorUtils.setAlphaComponent(-1, i4));
        } else {
            z2 = z;
        }
        if (this.gradientShader.setup(bitmap) | z2 | this.patternShader.setup(bitmap2)) {
            if (i2 >= 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    Paint paint = this.paint;
                    MotionBackgroundPaint$$ExternalSyntheticApiModelOutline1.m();
                    BitmapShader bitmapShader = this.gradientShader.shader;
                    ComposeShader composeShader = new ComposeShader(this.colorShader, this.patternShader.shader, PorterDuff.Mode.DST_IN);
                    blendMode = BlendMode.SOFT_LIGHT;
                    paint.setShader(MotionBackgroundPaint$$ExternalSyntheticApiModelOutline0.m(bitmapShader, composeShader, blendMode));
                } else {
                    this.paint.setShader(new ComposeShader(this.gradientShader.shader, new ComposeShader(this.colorShader, this.patternShader.shader, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                }
            } else {
                this.paint.setShader(new ComposeShader(this.colorShader, new ComposeShader(new ComposeShader(this.gradientShader.shader, this.patternShader.shader, PorterDuff.Mode.DST_IN), this.alphaShader, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
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
    }

    public void applyPatternMatrix(RectF rectF) {
        RectF rectF2 = this.tmpRectF;
        BitmapShaderState bitmapShaderState = this.patternShader;
        rectF2.set(0.0f, 0.0f, bitmapShaderState.width, bitmapShaderState.height);
        this.tmpMatrix.setRectToRect(this.tmpRectF, rectF, Matrix.ScaleToFit.FILL);
        this.patternShader.shader.setLocalMatrix(this.tmpMatrix);
    }

    public void applyPatternMatrix(Matrix matrix) {
        this.patternShader.shader.setLocalMatrix(matrix);
    }

    private static class BitmapShaderState {
        WeakReference bitmap;
        int height;
        BitmapShader shader;
        final Shader.TileMode tileMode;
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
            if (Build.VERSION.SDK_INT < 33) {
                return true;
            }
            bitmapShader.setFilterMode(2);
            return true;
        }
    }
}
