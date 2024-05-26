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

    public void draw(Canvas canvas, RectF rectF, boolean z, float f) {
        draw(canvas, rectF, z ? 1 : 3, f);
    }

    public void draw(Canvas canvas, RectF rectF, int i, float f) {
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
            this.matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 1) {
            this.matrix.postScale(1.0f, rectF.height() / 16.0f);
            this.matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 2) {
            this.matrix.postScale(1.0f, rectF.width() / 16.0f);
            this.matrix.postRotate(90.0f);
            this.matrix.postTranslate(rectF.right, rectF.top);
        } else if (i == 3) {
            this.matrix.postScale(1.0f, rectF.height() / 16.0f);
            this.matrix.postScale(1.0f, -1.0f);
            this.matrix.postTranslate(rectF.left, rectF.bottom);
        }
        this.gradient.setLocalMatrix(this.matrix);
        this.paint[i].setAlpha((int) (f * 255.0f));
        canvas.drawRect(rectF, this.paint[i]);
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
