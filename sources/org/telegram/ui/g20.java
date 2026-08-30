package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
public final class g20 {
    public LinearGradient f34439b;
    public final Paint[] f34438a = new Paint[4];
    public final Matrix f34440c = new Matrix();

    public final void a(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = this.f34438a;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader(this.f34439b);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public final void b(Canvas canvas, RectF rectF, int i10, float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        if (this.f34439b == null) {
            this.f34439b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        Paint[] paintArr = this.f34438a;
        if (paintArr[i10] == null) {
            paintArr[i10] = new Paint(1);
            paintArr[i10].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i10].setShader(this.f34439b);
        Matrix matrix = this.f34440c;
        matrix.reset();
        if (i10 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i10 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        this.f34439b.setLocalMatrix(matrix);
        paintArr[i10].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[i10]);
    }
}
