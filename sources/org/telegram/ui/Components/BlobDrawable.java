package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;

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
    private final float L;
    protected final float N;
    public float amplitude;
    protected float[] angle;
    protected float[] angleNext;
    private float animateAmplitudeDiff;
    private float animateToAmplitude;
    public float cubicBezierK;
    protected final int liteFlag;
    private final Matrix m;
    public float maxRadius;
    public float minRadius;
    public Paint paint;
    private Path path;
    private float[] pointEnd;
    private float[] pointStart;
    protected float[] progress;
    protected float[] radius;
    protected float[] radiusNext;
    protected final Random random;
    protected float[] speed;

    public BlobDrawable(int i) {
        this(i, 512);
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
        double d = f * 2.0f;
        Double.isNaN(d);
        this.L = (float) (Math.tan(3.141592653589793d / d) * 1.3333333333333333d);
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

    public void generateBlob(float[] fArr, float[] fArr2, int i) {
        float f = (360.0f / this.N) * 0.05f;
        float f2 = this.maxRadius;
        float f3 = this.minRadius;
        fArr[i] = f3 + (Math.abs((this.random.nextInt() % 100.0f) / 100.0f) * (f2 - f3));
        fArr2[i] = ((360.0f / this.N) * i) + (((this.random.nextInt() % 100.0f) / 100.0f) * f);
        float[] fArr3 = this.speed;
        double abs = Math.abs(this.random.nextInt() % 100.0f) / 100.0f;
        Double.isNaN(abs);
        fArr3[i] = (float) ((abs * 0.003d) + 0.017d);
    }

    public void update(float f, float f2) {
        if (LiteMode.isEnabled(this.liteFlag)) {
            for (int i = 0; i < this.N; i++) {
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
    }

    public void draw(float f, float f2, Canvas canvas, Paint paint) {
        if (!LiteMode.isEnabled(this.liteFlag)) {
            return;
        }
        this.path.reset();
        int i = 0;
        while (true) {
            float f3 = i;
            float f4 = this.N;
            if (f3 < f4) {
                float[] fArr = this.progress;
                float f5 = fArr[i];
                int i2 = i + 1;
                int i3 = ((float) i2) < f4 ? i2 : 0;
                float f6 = fArr[i3];
                float[] fArr2 = this.radius;
                float f7 = 1.0f - f5;
                float f8 = fArr2[i] * f7;
                float[] fArr3 = this.radiusNext;
                float f9 = f8 + (fArr3[i] * f5);
                float f10 = 1.0f - f6;
                float f11 = (fArr2[i3] * f10) + (fArr3[i3] * f6);
                float[] fArr4 = this.angle;
                float f12 = fArr4[i] * f7;
                float[] fArr5 = this.angleNext;
                float f13 = f12 + (fArr5[i] * f5);
                float f14 = (fArr4[i3] * f10) + (fArr5[i3] * f6);
                float min = this.L * (Math.min(f9, f11) + ((Math.max(f9, f11) - Math.min(f9, f11)) / 2.0f)) * this.cubicBezierK;
                this.m.reset();
                this.m.setRotate(f13, f, f2);
                float[] fArr6 = this.pointStart;
                fArr6[0] = f;
                float f15 = f2 - f9;
                fArr6[1] = f15;
                fArr6[2] = f + min;
                fArr6[3] = f15;
                this.m.mapPoints(fArr6);
                float[] fArr7 = this.pointEnd;
                fArr7[0] = f;
                float f16 = f2 - f11;
                fArr7[1] = f16;
                fArr7[2] = f - min;
                fArr7[3] = f16;
                this.m.reset();
                this.m.setRotate(f14, f, f2);
                this.m.mapPoints(this.pointEnd);
                if (i == 0) {
                    Path path = this.path;
                    float[] fArr8 = this.pointStart;
                    path.moveTo(fArr8[0], fArr8[1]);
                }
                Path path2 = this.path;
                float[] fArr9 = this.pointStart;
                float f17 = fArr9[2];
                float f18 = fArr9[3];
                float[] fArr10 = this.pointEnd;
                path2.cubicTo(f17, f18, fArr10[2], fArr10[3], fArr10[0], fArr10[1]);
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
        for (int i = 0; i < this.N; i++) {
            generateBlob(this.radius, this.angle, i);
            generateBlob(this.radiusNext, this.angleNext, i);
            this.progress[i] = 0.0f;
        }
    }

    public void setValue(float f, boolean z) {
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
