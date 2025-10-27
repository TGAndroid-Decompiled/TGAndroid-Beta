package org.telegram.ui.Components.blur3.source;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;

public class BlurredBackgroundSourceBitmap implements BlurredBackgroundSource {
    protected int actionBarHeight;
    private Bitmap bitmap;
    private Bitmap bitmapInternal;
    private final Matrix bitmapMatrix;
    private final Paint bitmapPaint;
    private BitmapShader bitmapShader;
    private final Matrix matrixForDraw;
    protected int parentHeight;
    protected int parentWidth;

    public BlurredBackgroundSourceBitmap() {
        Paint paint = new Paint(3);
        this.bitmapPaint = paint;
        this.bitmapMatrix = new Matrix();
        this.matrixForDraw = new Matrix();
        paint.setFilterBitmap(true);
    }

    public void setBitmap(Bitmap bitmap) {
        if (this.bitmap == bitmap) {
            return;
        }
        this.bitmap = bitmap;
        this.bitmapPaint.setShader(null);
        this.bitmapShader = null;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.bitmapShader = bitmapShader;
            this.bitmapPaint.setShader(bitmapShader);
            updateMatrix();
        }
    }

    public Matrix getMatrix() {
        return this.bitmapMatrix;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override
    public void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bitmap.isRecycled() || this.bitmapShader == null) {
            return;
        }
        this.matrixForDraw.set(this.bitmapMatrix);
        this.matrixForDraw.postTranslate(f, f2);
        this.bitmapShader.setLocalMatrix(this.bitmapMatrix);
        canvas.drawRect(f, f2, f3, f4, this.bitmapPaint);
    }

    @Override
    public BlurredBackgroundDrawable createDrawable() {
        return new BlurredBackgroundDrawableSource(this);
    }

    public Canvas beginRecording(int i, int i2) {
        return beginRecording(i, i2, 1.0f);
    }

    public Canvas beginRecording(int i, int i2, float f) {
        float f2 = i;
        float f3 = f2 / f;
        int round = Math.round(f3);
        int round2 = Math.round(f3);
        Bitmap bitmap = this.bitmapInternal;
        if (bitmap == null || bitmap.isRecycled() || this.bitmapInternal.getWidth() != round2 || this.bitmapInternal.getHeight() != round2) {
            this.bitmapInternal = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        } else {
            this.bitmapInternal.eraseColor(0);
        }
        Canvas canvas = new Canvas(this.bitmapInternal);
        canvas.scale(f2 / round, i2 / round2);
        return canvas;
    }

    public void endRecording() {
        setBitmap(this.bitmapInternal);
        this.bitmapInternal = null;
    }

    public final void setParentSize(int i, int i2, int i3) {
        if (this.parentWidth == i && this.parentHeight == i2 && this.actionBarHeight == i3) {
            return;
        }
        this.parentWidth = i;
        this.parentHeight = i2;
        this.actionBarHeight = i3;
        updateMatrix();
    }

    private void updateMatrix() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            this.bitmapMatrix.reset();
        } else {
            buildCenterCropMatrix(this.bitmapMatrix, bitmap.getWidth(), this.bitmap.getHeight(), this.parentWidth, this.parentHeight, this.actionBarHeight);
        }
    }

    private static void buildCenterCropMatrix(Matrix matrix, int i, int i2, int i3, int i4, int i5) {
        matrix.reset();
        int i6 = i4 - i5;
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i6 <= 0) {
            return;
        }
        float f = i3;
        float f2 = i;
        float f3 = i6;
        float f4 = i2;
        float max = Math.max(f / f2, f3 / f4);
        matrix.setScale(max, max);
        matrix.postTranslate((f - (f2 * max)) * 0.5f, ((f3 - (f4 * max)) * 0.5f) + i5);
    }
}
