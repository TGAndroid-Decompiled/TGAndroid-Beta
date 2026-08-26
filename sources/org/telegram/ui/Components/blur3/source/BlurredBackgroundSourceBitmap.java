package org.telegram.ui.Components.blur3.source;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;

public final class BlurredBackgroundSourceBitmap implements BlurredBackgroundSource {
    public Bitmap bitmap;
    public Bitmap bitmapInternal;
    public final Matrix bitmapMatrix;
    public final Paint bitmapPaint;
    public BitmapShader bitmapShader;
    public final Matrix matrixForDraw;
    public int parentHeight;
    public int parentWidth;

    public BlurredBackgroundSourceBitmap() {
        Paint paint = new Paint(3);
        this.bitmapPaint = paint;
        this.bitmapMatrix = new Matrix();
        this.matrixForDraw = new Matrix();
        paint.setFilterBitmap(true);
    }

    @Override
    public final BlurredBackgroundDrawable createDrawable() {
        return new BlurredBackgroundDrawableSource(this);
    }

    @Override
    public final void dispatchOnDrawablesRelativePositionChange() {
    }

    @Override
    public final void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bitmap.isRecycled() || this.bitmapShader == null) {
            return;
        }
        Matrix matrix = this.matrixForDraw;
        Matrix matrix2 = this.bitmapMatrix;
        matrix.set(matrix2);
        matrix.postTranslate(f, f2);
        this.bitmapShader.setLocalMatrix(matrix2);
        canvas.drawRect(f, f2, f3, f4, this.bitmapPaint);
    }

    public final void setBitmap(Bitmap bitmap) {
        if (this.bitmap == bitmap) {
            return;
        }
        this.bitmap = bitmap;
        Paint paint = this.bitmapPaint;
        paint.setShader(null);
        this.bitmapShader = null;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.bitmapShader = bitmapShader;
            paint.setShader(bitmapShader);
            updateMatrix();
        }
    }

    public final void updateMatrix() {
        Bitmap bitmap = this.bitmap;
        Matrix matrix = this.bitmapMatrix;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.bitmap.getHeight();
        int i = this.parentWidth;
        int i2 = this.parentHeight;
        matrix.reset();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return;
        }
        float f = i;
        float f2 = width;
        float f3 = i2;
        float f4 = height;
        float fMax = Math.max(f / f2, f3 / f4);
        matrix.setScale(fMax, fMax);
        matrix.postTranslate((f - (f2 * fMax)) * 0.5f, ((f3 - (f4 * fMax)) * 0.5f) + 0);
    }
}
