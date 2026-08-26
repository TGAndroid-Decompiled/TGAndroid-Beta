package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;

public class BlobDrawable {
    public final float L;
    public final float N;
    public float amplitude;
    public final float[] angle;
    public final float[] angleNext;
    public float animateAmplitudeDiff;
    public float animateToAmplitude;
    public final float cubicBezierK;
    public final int liteFlag;
    public final Matrix m;
    public float maxRadius;
    public float minRadius;
    public final Paint paint;
    public final Path path;
    public final float[] pointEnd;
    public final float[] pointStart;
    public final float[] progress;
    public final float[] radius;
    public final float[] radiusNext;
    public final Random random;
    public final float[] speed;

    public BlobDrawable(int i) {
        this(i, 512);
    }

    public final void draw(float f, float f2, Canvas canvas, Paint paint) {
        if (!LiteMode.isEnabled(this.liteFlag)) {
            return;
        }
        Path path = this.path;
        path.reset();
        int i = 0;
        while (true) {
            float f3 = i;
            float f4 = this.N;
            if (f3 >= f4) {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            float[] fArr = this.progress;
            float f5 = fArr[i];
            int i2 = i + 1;
            int i3 = ((float) i2) < f4 ? i2 : 0;
            float f6 = fArr[i3];
            float[] fArr2 = this.radius;
            float f7 = 1.0f - f5;
            float f8 = fArr2[i] * f7;
            float[] fArr3 = this.radiusNext;
            float f9 = (fArr3[i] * f5) + f8;
            float f10 = 1.0f - f6;
            float f11 = (fArr3[i3] * f6) + (fArr2[i3] * f10);
            float[] fArr4 = this.angle;
            float f12 = fArr4[i] * f7;
            float[] fArr5 = this.angleNext;
            float f13 = (fArr5[i] * f5) + f12;
            float f14 = (fArr5[i3] * f6) + (fArr4[i3] * f10);
            float fMax = (((Math.max(f9, f11) - Math.min(f9, f11)) / 2.0f) + Math.min(f9, f11)) * this.L * this.cubicBezierK;
            Matrix matrix = this.m;
            matrix.reset();
            matrix.setRotate(f13, f, f2);
            float[] fArr6 = this.pointStart;
            fArr6[0] = f;
            float f15 = f2 - f9;
            fArr6[1] = f15;
            fArr6[2] = f + fMax;
            fArr6[3] = f15;
            matrix.mapPoints(fArr6);
            float[] fArr7 = this.pointEnd;
            fArr7[0] = f;
            float f16 = f2 - f11;
            fArr7[1] = f16;
            fArr7[2] = f - fMax;
            fArr7[3] = f16;
            matrix.reset();
            matrix.setRotate(f14, f, f2);
            matrix.mapPoints(fArr7);
            if (i == 0) {
                path.moveTo(fArr6[0], fArr6[1]);
            }
            path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
            i = i2;
        }
    }

    public final void generateBlob(float[] fArr, float[] fArr2, int i) {
        float f = this.N;
        float f2 = this.maxRadius;
        float f3 = this.minRadius;
        Random random = this.random;
        fArr[i] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f2 - f3)) + f3;
        fArr2[i] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f) * 0.05f) + ((360.0f / f) * i);
        this.speed[i] = (float) ((((double) (Math.abs(random.nextInt() % 100.0f) / 100.0f)) * 0.003d) + 0.017d);
    }

    public final void setValue(float f, boolean z) {
        this.animateToAmplitude = f;
        if (LiteMode.isEnabled(this.liteFlag)) {
            if (z) {
                float f2 = this.animateToAmplitude;
                float f3 = this.amplitude;
                if (f2 > f3) {
                    this.animateAmplitudeDiff = (f2 - f3) / 205.0f;
                    return;
                } else {
                    this.animateAmplitudeDiff = (f2 - f3) / 275.0f;
                    return;
                }
            }
            float f4 = this.animateToAmplitude;
            float f5 = this.amplitude;
            if (f4 > f5) {
                this.animateAmplitudeDiff = (f4 - f5) / 320.0f;
            } else {
                this.animateAmplitudeDiff = (f4 - f5) / 375.0f;
            }
        }
    }

    public final void update(float f, float f2) {
        if (LiteMode.isEnabled(this.liteFlag)) {
            for (int i = 0; i < this.N; i++) {
                float[] fArr = this.progress;
                float f3 = fArr[i];
                float f4 = this.speed[i];
                float f5 = (f4 * f * 8.2f * f2) + (0.8f * f4) + f3;
                fArr[i] = f5;
                if (f5 >= 1.0f) {
                    fArr[i] = 0.0f;
                    float[] fArr2 = this.radiusNext;
                    this.radius[i] = fArr2[i];
                    float[] fArr3 = this.angleNext;
                    this.angle[i] = fArr3[i];
                    generateBlob(fArr2, fArr3, i);
                }
            }
        }
    }

    public BlobDrawable(int i, int i2) {
        this.path = new Path();
        this.paint = new Paint(1);
        this.pointStart = new float[4];
        this.pointEnd = new float[4];
        this.random = new Random();
        this.cubicBezierK = 1.0f;
        this.m = new Matrix();
        float f = i;
        this.N = f;
        this.L = (float) (Math.tan(3.141592653589793d / ((double) (f * 2.0f))) * 1.3333333333333333d);
        this.radius = new float[i];
        this.angle = new float[i];
        this.radiusNext = new float[i];
        this.angleNext = new float[i];
        this.progress = new float[i];
        this.speed = new float[i];
        for (int i3 = 0; i3 < this.N; i3++) {
            generateBlob(this.radius, this.angle, i3);
            generateBlob(this.radiusNext, this.angleNext, i3);
            this.progress[i3] = 0.0f;
        }
        this.liteFlag = i2;
    }

    public final void generateBlob() {
        for (int i = 0; i < this.N; i++) {
            generateBlob(this.radius, this.angle, i);
            generateBlob(this.radiusNext, this.angleNext, i);
            this.progress[i] = 0.0f;
        }
    }
}
