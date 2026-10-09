package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class da {
    public float f25650a;
    public float f25651b;
    public final Path f25652c;
    public final Paint d;
    public final float[] f25653e;
    public final float[] f25654f;
    public final float[] f25655g;
    public final float[] h;
    public final float[] f25656i;
    public final float[] f25657j;
    public final float[] f25658k;
    public final float[] f25659l;
    public final Random f25660m;
    public final float f25661n;
    public final float f25662o;
    public final float f25663p;
    public final Matrix f25664q;
    public final int f25665r;
    public float f25666s;
    public float f25667t;
    public float f25668u;

    public da(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f25665r)) {
            return;
        }
        Path path = this.f25652c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f25661n;
            if (i11 < f11) {
                float[] fArr = this.f25656i;
                float f12 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f11) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f13 = fArr[i10];
                float[] fArr2 = this.f25653e;
                float f14 = 1.0f - f12;
                float[] fArr3 = this.f25655g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f25654f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f25662o * this.f25663p;
                Matrix matrix = this.f25664q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f25658k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f25659l;
                fArr7[0] = f7;
                float f21 = f10 - f17;
                fArr7[1] = f21;
                fArr7[2] = f7 - max;
                fArr7[3] = f21;
                matrix.reset();
                matrix.setRotate(f19, f7, f10);
                matrix.mapPoints(fArr7);
                if (i11 == 0) {
                    path.moveTo(fArr6[0], fArr6[1]);
                }
                path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
                i11 = i12;
            } else {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }

    public final void b() {
        for (int i10 = 0; i10 < this.f25661n; i10++) {
            c(this.f25653e, this.f25654f, i10);
            c(this.f25655g, this.h, i10);
            this.f25656i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f25661n;
        float f10 = this.f25651b;
        float f11 = this.f25650a;
        Random random = this.f25660m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f25657j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f25666s = f7;
        if (!LiteMode.isEnabled(this.f25665r)) {
            return;
        }
        if (z10) {
            float f10 = this.f25666s;
            float f11 = this.f25667t;
            if (f10 > f11) {
                this.f25668u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f25668u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f25666s;
        float f13 = this.f25667t;
        if (f12 > f13) {
            this.f25668u = (f12 - f13) / 320.0f;
        } else {
            this.f25668u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f25665r)) {
            for (int i10 = 0; i10 < this.f25661n; i10++) {
                float[] fArr = this.f25656i;
                float f11 = fArr[i10];
                float f12 = this.f25657j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f25655g;
                    this.f25653e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f25654f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f25666s;
        float f10 = this.f25667t;
        if (f7 != f10) {
            float f11 = this.f25668u;
            float f12 = (((float) j3) * f11) + f10;
            this.f25667t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f25667t = f7;
                }
            } else if (f12 < f7) {
                this.f25667t = f7;
            }
        }
    }

    public da(int i10, int i11) {
        float f7;
        this.f25652c = new Path();
        this.d = new Paint(1);
        this.f25658k = new float[4];
        this.f25659l = new float[4];
        this.f25660m = new Random();
        this.f25663p = 1.0f;
        this.f25664q = new Matrix();
        this.f25661n = i10;
        this.f25662o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.f25653e = new float[i10];
        this.f25654f = new float[i10];
        this.f25655g = new float[i10];
        this.h = new float[i10];
        this.f25656i = new float[i10];
        this.f25657j = new float[i10];
        for (int i12 = 0; i12 < this.f25661n; i12++) {
            c(this.f25653e, this.f25654f, i12);
            c(this.f25655g, this.h, i12);
            this.f25656i[i12] = 0.0f;
        }
        this.f25665r = i11;
    }
}
