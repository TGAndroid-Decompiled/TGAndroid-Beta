package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.Random;

public final class CircleBezierDrawable {
    public float radius;
    public float randomK;
    public final Path path = new Path();
    public final float[] pointStart = new float[4];
    public final float[] pointEnd = new float[4];
    public final Matrix m = new Matrix();
    public final float cubicBezierK = 1.0f;
    public final Random random = new Random();
    public final int N = 6;
    public final float L = (float) (Math.tan(3.141592653589793d / ((double) 12)) * 1.3333333333333333d);
    public final float[] randomAdditionals = new float[6];

    public CircleBezierDrawable() {
        for (int i = 0; i < this.N; i++) {
            this.randomAdditionals[i] = (this.random.nextInt() % 100) / 100.0f;
        }
    }

    public final void draw(float f, float f2, Canvas canvas, Paint paint) {
        CircleBezierDrawable circleBezierDrawable = this;
        float f3 = circleBezierDrawable.radius;
        float f4 = (f3 - 0.0f) - 0.0f;
        float f5 = f3 + 0.0f + 0.0f;
        float fMax = Math.max(f4, f5);
        float f6 = circleBezierDrawable.L;
        float f7 = fMax * f6 * circleBezierDrawable.cubicBezierK;
        Path path = circleBezierDrawable.path;
        path.reset();
        int i = 0;
        while (true) {
            int i2 = circleBezierDrawable.N;
            if (i >= i2) {
                canvas.save();
                canvas.rotate(0.0f, f, f2);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = circleBezierDrawable.m;
            matrix.reset();
            float f8 = 360.0f / i2;
            matrix.setRotate(i * f8, f, f2);
            float f9 = i % 2 == 0 ? f4 : f5;
            float f10 = circleBezierDrawable.randomK;
            float[] fArr = circleBezierDrawable.randomAdditionals;
            float f11 = (fArr[i] * f10) + f9;
            float[] fArr2 = circleBezierDrawable.pointStart;
            fArr2[0] = f;
            float f12 = f2 - f11;
            fArr2[1] = f12;
            float f13 = f5;
            fArr2[2] = SurfaceContainer$$ExternalSyntheticOutline0.m(f10, fArr[i], f6, f + f7);
            fArr2[3] = f12;
            matrix.mapPoints(fArr2);
            int i3 = i + 1;
            int i4 = i3 >= i2 ? 0 : i3;
            float f14 = i4 % 2 == 0 ? f4 : f13;
            float f15 = circleBezierDrawable.randomK;
            float f16 = (fArr[i4] * f15) + f14;
            float[] fArr3 = circleBezierDrawable.pointEnd;
            fArr3[0] = f;
            float f17 = f2 - f16;
            fArr3[1] = f17;
            float f18 = f4;
            fArr3[2] = SurfaceContainer$$ExternalSyntheticOutline0.m(f15, fArr[i4], f6, f - f7);
            fArr3[3] = f17;
            matrix.reset();
            matrix.setRotate(f8 * i4, f, f2);
            matrix.mapPoints(fArr3);
            if (i == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            }
            path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
            i = i3;
            f5 = f13;
            f4 = f18;
            circleBezierDrawable = this;
        }
    }
}
