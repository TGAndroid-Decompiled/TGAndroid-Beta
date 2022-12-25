package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

public class CircleBezierDrawable {
    private final float f1035L;
    private final int f1036N;
    public float radius;
    public float radiusDiff;
    float[] randomAdditionals;
    public float randomK;
    private Path path = new Path();
    private float[] pointStart = new float[4];
    private float[] pointEnd = new float[4];
    private Matrix f1037m = new Matrix();
    float globalRotate = 0.0f;
    public float idleStateDiff = 0.0f;
    public float cubicBezierK = 1.0f;
    final Random random = new Random();

    public CircleBezierDrawable(int i) {
        this.f1036N = i;
        double d = i * 2;
        Double.isNaN(d);
        this.f1035L = (float) (Math.tan(3.141592653589793d / d) * 1.3333333333333333d);
        this.randomAdditionals = new float[i];
        calculateRandomAdditionals();
    }

    public void calculateRandomAdditionals() {
        for (int i = 0; i < this.f1036N; i++) {
            this.randomAdditionals[i] = (this.random.nextInt() % 100) / 100.0f;
        }
    }

    public void setAdditionals(int[] iArr) {
        for (int i = 0; i < this.f1036N; i += 2) {
            float[] fArr = this.randomAdditionals;
            fArr[i] = iArr[i / 2];
            fArr[i + 1] = 0.0f;
        }
    }

    public void draw(float f, float f2, Canvas canvas, Paint paint) {
        float f3 = this.radius;
        float f4 = this.idleStateDiff;
        float f5 = this.radiusDiff;
        float f6 = (f3 - (f4 / 2.0f)) - (f5 / 2.0f);
        float f7 = f3 + (f5 / 2.0f) + (f4 / 2.0f);
        float max = this.f1035L * Math.max(f6, f7) * this.cubicBezierK;
        this.path.reset();
        int i = 0;
        while (i < this.f1036N) {
            this.f1037m.reset();
            this.f1037m.setRotate((360.0f / this.f1036N) * i, f, f2);
            float f8 = i % 2 == 0 ? f6 : f7;
            float f9 = this.randomK;
            float[] fArr = this.randomAdditionals;
            float f10 = f8 + (fArr[i] * f9);
            float[] fArr2 = this.pointStart;
            fArr2[0] = f;
            float f11 = f2 - f10;
            fArr2[1] = f11;
            fArr2[2] = f + max + (f9 * fArr[i] * this.f1035L);
            fArr2[3] = f11;
            this.f1037m.mapPoints(fArr2);
            int i2 = i + 1;
            int i3 = i2 >= this.f1036N ? 0 : i2;
            float f12 = i3 % 2 == 0 ? f6 : f7;
            float f13 = this.randomK;
            float[] fArr3 = this.randomAdditionals;
            float[] fArr4 = this.pointEnd;
            fArr4[0] = f;
            float f14 = f2 - (f12 + (fArr3[i3] * f13));
            fArr4[1] = f14;
            fArr4[2] = (f - max) + (f13 * fArr3[i3] * this.f1035L);
            fArr4[3] = f14;
            this.f1037m.reset();
            this.f1037m.setRotate((360.0f / this.f1036N) * i3, f, f2);
            this.f1037m.mapPoints(this.pointEnd);
            if (i == 0) {
                Path path = this.path;
                float[] fArr5 = this.pointStart;
                path.moveTo(fArr5[0], fArr5[1]);
            }
            Path path2 = this.path;
            float[] fArr6 = this.pointStart;
            float f15 = fArr6[2];
            float f16 = fArr6[3];
            float[] fArr7 = this.pointEnd;
            path2.cubicTo(f15, f16, fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
            i = i2;
        }
        canvas.save();
        canvas.rotate(this.globalRotate, f, f2);
        canvas.drawPath(this.path, paint);
        canvas.restore();
    }
}
