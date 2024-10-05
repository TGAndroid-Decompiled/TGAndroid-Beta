package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;

public class GradientClip {
    private LinearGradient gradient;
    private final Paint[] paint = new Paint[4];
    private final Matrix matrix = new Matrix();

    public void clipOut(Canvas canvas, RectF rectF, float f) {
        Paint[] paintArr = this.paint;
        if (paintArr[0] == null) {
            paintArr[0] = new Paint(1);
            this.paint[0].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.paint[0].setShader(this.gradient);
        this.paint[0].setAlpha((int) (f * 255.0f));
        canvas.drawRect(rectF, this.paint[0]);
    }

    public void draw(Canvas canvas, RectF rectF, int i, float f) {
        Matrix matrix;
        float f2;
        float f3;
        if (f <= 0.0f) {
            return;
        }
        if (this.gradient == null) {
            this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        Paint[] paintArr = this.paint;
        if (paintArr[i] == null) {
            paintArr[i] = new Paint(1);
            this.paint[i].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.paint[i].setShader(this.gradient);
        this.matrix.reset();
        if (i == 0) {
            this.matrix.postScale(1.0f, rectF.width() / 16.0f);
            this.matrix.postRotate(-90.0f);
        } else {
            if (i != 1) {
                if (i == 2) {
                    this.matrix.postScale(1.0f, rectF.width() / 16.0f);
                    this.matrix.postRotate(90.0f);
                    matrix = this.matrix;
                    f2 = rectF.right;
                    f3 = rectF.top;
                    matrix.postTranslate(f2, f3);
                    this.gradient.setLocalMatrix(this.matrix);
                    this.paint[i].setAlpha((int) (f * 255.0f));
                    canvas.drawRect(rectF, this.paint[i]);
                }
                if (i == 3) {
                    this.matrix.postScale(1.0f, rectF.height() / 16.0f);
                    this.matrix.postScale(1.0f, -1.0f);
                    matrix = this.matrix;
                    f2 = rectF.left;
                    f3 = rectF.bottom;
                    matrix.postTranslate(f2, f3);
                }
                this.gradient.setLocalMatrix(this.matrix);
                this.paint[i].setAlpha((int) (f * 255.0f));
                canvas.drawRect(rectF, this.paint[i]);
            }
            this.matrix.postScale(1.0f, rectF.height() / 16.0f);
        }
        matrix = this.matrix;
        f2 = rectF.left;
        f3 = rectF.top;
        matrix.postTranslate(f2, f3);
        this.gradient.setLocalMatrix(this.matrix);
        this.paint[i].setAlpha((int) (f * 255.0f));
        canvas.drawRect(rectF, this.paint[i]);
    }

    public void draw(Canvas canvas, RectF rectF, boolean z, float f) {
        draw(canvas, rectF, z ? 1 : 3, f);
    }

    public Paint getPaint(int i, float f) {
        Paint[] paintArr = this.paint;
        if (paintArr[i] == null) {
            paintArr[i] = new Paint(1);
            this.paint[i].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.paint[i].setShader(null);
        this.paint[i].setColor(-65536);
        this.paint[i].setAlpha((int) (f * 255.0f));
        return this.paint[i];
    }
}
