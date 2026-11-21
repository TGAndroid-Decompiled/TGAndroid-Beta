package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public class w9 {
    public float f41719a;
    public float f41720b;
    public final Path f41721c;
    public final Paint d;
    public final float[] f41722e;
    public final float[] f41723f;
    public final float[] f41724g;
    public final float[] h;
    public final float[] f41725i;
    public final float[] f41726j;
    public final float[] f41727k;
    public final float[] f41728l;
    public final Random f41729m;
    public final float f41730n;
    public final float f41731o;
    public final float f41732p;
    public final Matrix f41733q;
    public final int f41734r;
    public float f41735s;
    public float f41736t;
    public float f41737u;

    public w9(int i7) {
        this(i7, 512);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        int i7;
        if (!org.telegram.messenger.pc.e(this.f41734r)) {
            return;
        }
        Path path = this.f41721c;
        path.reset();
        int i10 = 0;
        while (true) {
            float f12 = this.f41730n;
            if (i10 < f12) {
                float[] fArr = this.f41725i;
                float f13 = fArr[i10];
                int i11 = i10 + 1;
                if (i11 < f12) {
                    i7 = i11;
                } else {
                    i7 = 0;
                }
                float f14 = fArr[i7];
                float[] fArr2 = this.f41722e;
                float f15 = 1.0f - f13;
                float[] fArr3 = this.f41724g;
                float f16 = (fArr3[i10] * f13) + (fArr2[i10] * f15);
                float f17 = 1.0f - f14;
                float f18 = (fArr3[i7] * f14) + (fArr2[i7] * f17);
                float[] fArr4 = this.f41723f;
                float f19 = fArr4[i10] * f15;
                float[] fArr5 = this.h;
                float f20 = (fArr5[i7] * f14) + (fArr4[i7] * f17);
                float max = (((Math.max(f16, f18) - Math.min(f16, f18)) / 2.0f) + Math.min(f16, f18)) * this.f41731o * this.f41732p;
                Matrix matrix = this.f41733q;
                matrix.reset();
                matrix.setRotate((fArr5[i10] * f13) + f19, f10, f11);
                float[] fArr6 = this.f41727k;
                fArr6[0] = f10;
                float f21 = f11 - f16;
                fArr6[1] = f21;
                fArr6[2] = f10 + max;
                fArr6[3] = f21;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f41728l;
                fArr7[0] = f10;
                float f22 = f11 - f18;
                fArr7[1] = f22;
                fArr7[2] = f10 - max;
                fArr7[3] = f22;
                matrix.reset();
                matrix.setRotate(f20, f10, f11);
                matrix.mapPoints(fArr7);
                if (i10 == 0) {
                    path.moveTo(fArr6[0], fArr6[1]);
                }
                path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
                i10 = i11;
            } else {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }

    public final void b() {
        for (int i7 = 0; i7 < this.f41730n; i7++) {
            c(this.f41722e, this.f41723f, i7);
            c(this.f41724g, this.h, i7);
            this.f41725i[i7] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i7) {
        float f10 = this.f41730n;
        float f11 = this.f41720b;
        float f12 = this.f41719a;
        Random random = this.f41729m;
        fArr[i7] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f11 - f12)) + f12;
        fArr2[i7] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f10) * 0.05f) + ((360.0f / f10) * i7);
        this.f41726j[i7] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(boolean z10, float f10) {
        this.f41735s = f10;
        if (!org.telegram.messenger.pc.e(this.f41734r)) {
            return;
        }
        if (z10) {
            float f11 = this.f41735s;
            float f12 = this.f41736t;
            if (f11 > f12) {
                this.f41737u = (f11 - f12) / 205.0f;
                return;
            } else {
                this.f41737u = (f11 - f12) / 275.0f;
                return;
            }
        }
        float f13 = this.f41735s;
        float f14 = this.f41736t;
        if (f13 > f14) {
            this.f41737u = (f13 - f14) / 320.0f;
        } else {
            this.f41737u = (f13 - f14) / 375.0f;
        }
    }

    public final void e(float f10, float f11) {
        if (org.telegram.messenger.pc.e(this.f41734r)) {
            for (int i7 = 0; i7 < this.f41730n; i7++) {
                float[] fArr = this.f41725i;
                float f12 = fArr[i7];
                float f13 = this.f41726j[i7];
                float f14 = (f13 * f10 * 8.2f * f11) + (0.8f * f13) + f12;
                fArr[i7] = f14;
                if (f14 >= 1.0f) {
                    fArr[i7] = 0.0f;
                    float[] fArr2 = this.f41724g;
                    this.f41722e[i7] = fArr2[i7];
                    float[] fArr3 = this.h;
                    this.f41723f[i7] = fArr3[i7];
                    c(fArr2, fArr3, i7);
                }
            }
        }
    }

    public final void f(long j3) {
        float f10 = this.f41735s;
        float f11 = this.f41736t;
        if (f10 != f11) {
            float f12 = this.f41737u;
            float f13 = (((float) j3) * f12) + f11;
            this.f41736t = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f41736t = f10;
                }
            } else if (f13 < f10) {
                this.f41736t = f10;
            }
        }
    }

    public w9(int i7, int i10) {
        float f10;
        this.f41721c = new Path();
        this.d = new Paint(1);
        this.f41727k = new float[4];
        this.f41728l = new float[4];
        this.f41729m = new Random();
        this.f41732p = 1.0f;
        this.f41733q = new Matrix();
        this.f41730n = i7;
        this.f41731o = (float) (Math.tan(3.141592653589793d / (f10 * 2.0f)) * 1.3333333333333333d);
        this.f41722e = new float[i7];
        this.f41723f = new float[i7];
        this.f41724g = new float[i7];
        this.h = new float[i7];
        this.f41725i = new float[i7];
        this.f41726j = new float[i7];
        for (int i11 = 0; i11 < this.f41730n; i11++) {
            c(this.f41722e, this.f41723f, i11);
            c(this.f41724g, this.h, i11);
            this.f41725i[i11] = 0.0f;
        }
        this.f41734r = i10;
    }
}
