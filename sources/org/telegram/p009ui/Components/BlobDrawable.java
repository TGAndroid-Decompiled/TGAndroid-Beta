package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

public class BlobDrawable {
    public static float AMPLITUDE_SPEED = 0.33f;
    public static float FORM_BIG_MAX = 0.6f;
    public static float FORM_SMALL_MAX = 0.6f;
    public static float GLOBAL_SCALE = 1.0f;
    public static float GRADIENT_SPEED_MAX = 0.01f;
    public static float GRADIENT_SPEED_MIN = 0.5f;
    public static float LIGHT_GRADIENT_SIZE = 0.5f;
    public static float MAX_SPEED = 8.2f;
    public static float MIN_SPEED = 0.8f;
    public static float SCALE_BIG = 0.807f;
    public static float SCALE_BIG_MIN = 0.878f;
    public static float SCALE_SMALL = 0.704f;
    public static float SCALE_SMALL_MIN = 0.926f;
    private final float f1037L;
    private final float f1038N;
    public float amplitude;
    private float[] angle;
    private float[] angleNext;
    private float animateAmplitudeDiff;
    private float animateToAmplitude;
    public float maxRadius;
    public float minRadius;
    private float[] progress;
    private float[] radius;
    private float[] radiusNext;
    private float[] speed;
    private Path path = new Path();
    public Paint paint = new Paint(1);
    private float[] pointStart = new float[4];
    private float[] pointEnd = new float[4];
    final Random random = new Random();
    public float cubicBezierK = 1.0f;
    private final Matrix f1039m = new Matrix();

    public BlobDrawable(int i) {
        float f = i;
        this.f1038N = f;
        double d = f * 2.0f;
        Double.isNaN(d);
        this.f1037L = (float) (Math.tan(3.141592653589793d / d) * 1.3333333333333333d);
        this.radius = new float[i];
        this.angle = new float[i];
        this.radiusNext = new float[i];
        this.angleNext = new float[i];
        this.progress = new float[i];
        this.speed = new float[i];
        for (int i2 = 0; i2 < this.f1038N; i2++) {
            generateBlob(this.radius, this.angle, i2);
            generateBlob(this.radiusNext, this.angleNext, i2);
            this.progress[i2] = 0.0f;
        }
    }

    private void generateBlob(float[] fArr, float[] fArr2, int i) {
        float f = this.maxRadius;
        float f2 = this.minRadius;
        fArr[i] = f2 + (Math.abs((this.random.nextInt() % 100.0f) / 100.0f) * (f - f2));
        fArr2[i] = ((360.0f / this.f1038N) * i) + (((this.random.nextInt() % 100.0f) / 100.0f) * (360.0f / this.f1038N) * 0.05f);
        float[] fArr3 = this.speed;
        double abs = Math.abs(this.random.nextInt() % 100.0f) / 100.0f;
        Double.isNaN(abs);
        fArr3[i] = (float) ((abs * 0.003d) + 0.017d);
    }

    public void update(float f, float f2) {
        for (int i = 0; i < this.f1038N; i++) {
            float[] fArr = this.progress;
            float f3 = fArr[i];
            float[] fArr2 = this.speed;
            fArr[i] = f3 + (fArr2[i] * MIN_SPEED) + (fArr2[i] * f * MAX_SPEED * f2);
            if (fArr[i] >= 1.0f) {
                fArr[i] = 0.0f;
                float[] fArr3 = this.radius;
                float[] fArr4 = this.radiusNext;
                fArr3[i] = fArr4[i];
                float[] fArr5 = this.angle;
                float[] fArr6 = this.angleNext;
                fArr5[i] = fArr6[i];
                generateBlob(fArr4, fArr6, i);
            }
        }
    }

    public void draw(float f, float f2, Canvas canvas, Paint paint) {
        this.path.reset();
        int i = 0;
        while (true) {
            float f3 = this.f1038N;
            if (i < f3) {
                float[] fArr = this.progress;
                float f4 = fArr[i];
                int i2 = i + 1;
                int i3 = ((float) i2) < f3 ? i2 : 0;
                float f5 = fArr[i3];
                float[] fArr2 = this.radius;
                float f6 = 1.0f - f4;
                float[] fArr3 = this.radiusNext;
                float f7 = (fArr2[i] * f6) + (fArr3[i] * f4);
                float f8 = 1.0f - f5;
                float f9 = (fArr2[i3] * f8) + (fArr3[i3] * f5);
                float[] fArr4 = this.angle;
                float f10 = fArr4[i] * f6;
                float[] fArr5 = this.angleNext;
                float f11 = (fArr4[i3] * f8) + (fArr5[i3] * f5);
                float min = this.f1037L * (Math.min(f7, f9) + ((Math.max(f7, f9) - Math.min(f7, f9)) / 2.0f)) * this.cubicBezierK;
                this.f1039m.reset();
                this.f1039m.setRotate(f10 + (fArr5[i] * f4), f, f2);
                float[] fArr6 = this.pointStart;
                fArr6[0] = f;
                float f12 = f2 - f7;
                fArr6[1] = f12;
                fArr6[2] = f + min;
                fArr6[3] = f12;
                this.f1039m.mapPoints(fArr6);
                float[] fArr7 = this.pointEnd;
                fArr7[0] = f;
                float f13 = f2 - f9;
                fArr7[1] = f13;
                fArr7[2] = f - min;
                fArr7[3] = f13;
                this.f1039m.reset();
                this.f1039m.setRotate(f11, f, f2);
                this.f1039m.mapPoints(this.pointEnd);
                if (i == 0) {
                    Path path = this.path;
                    float[] fArr8 = this.pointStart;
                    path.moveTo(fArr8[0], fArr8[1]);
                }
                Path path2 = this.path;
                float[] fArr9 = this.pointStart;
                float f14 = fArr9[2];
                float f15 = fArr9[3];
                float[] fArr10 = this.pointEnd;
                path2.cubicTo(f14, f15, fArr10[2], fArr10[3], fArr10[0], fArr10[1]);
                i = i2;
            } else {
                canvas.save();
                canvas.drawPath(this.path, paint);
                canvas.restore();
                return;
            }
        }
    }

    public void generateBlob() {
        for (int i = 0; i < this.f1038N; i++) {
            generateBlob(this.radius, this.angle, i);
            generateBlob(this.radiusNext, this.angleNext, i);
            this.progress[i] = 0.0f;
        }
    }

    public void setValue(float f, boolean z) {
        this.animateToAmplitude = f;
        if (z) {
            float f2 = this.amplitude;
            if (f > f2) {
                this.animateAmplitudeDiff = (f - f2) / 205.0f;
                return;
            } else {
                this.animateAmplitudeDiff = (f - f2) / 275.0f;
                return;
            }
        }
        float f3 = this.amplitude;
        if (f > f3) {
            this.animateAmplitudeDiff = (f - f3) / 320.0f;
        } else {
            this.animateAmplitudeDiff = (f - f3) / 375.0f;
        }
    }

    public void updateAmplitude(long j) {
        float f = this.animateToAmplitude;
        float f2 = this.amplitude;
        if (f != f2) {
            float f3 = this.animateAmplitudeDiff;
            float f4 = f2 + (((float) j) * f3);
            this.amplitude = f4;
            if (f3 > 0.0f) {
                if (f4 > f) {
                    this.amplitude = f;
                }
            } else if (f4 < f) {
                this.amplitude = f;
            }
        }
    }
}
