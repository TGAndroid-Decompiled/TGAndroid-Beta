package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class u9 {
    public float f29139a;
    public float f29140b;
    public final Path f29141c;
    public final Paint d;
    public final float[] e;
    public final float[] f29142f;
    public final float[] f29143g;
    public final float[] h;
    public final float[] f29144i;
    public final float[] f29145j;
    public final float[] f29146k;
    public final float[] f29147l;
    public final Random f29148m;
    public final float f29149n;
    public final float f29150o;
    public final float f29151p;
    public final Matrix f29152q;
    public final int f29153r;
    public float f29154s;
    public float f29155t;
    public float f29156u;

    public u9(int i10) {
        this(i10, 512);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f29153r)) {
            return;
        }
        Path path = this.f29141c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f12 = this.f29149n;
            if (i11 < f12) {
                float[] fArr = this.f29144i;
                float f13 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f12) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f14 = fArr[i10];
                float[] fArr2 = this.e;
                float f15 = 1.0f - f13;
                float[] fArr3 = this.f29143g;
                float f16 = (fArr3[i11] * f13) + (fArr2[i11] * f15);
                float f17 = 1.0f - f14;
                float f18 = (fArr3[i10] * f14) + (fArr2[i10] * f17);
                float[] fArr4 = this.f29142f;
                float f19 = fArr4[i11] * f15;
                float[] fArr5 = this.h;
                float f20 = (fArr5[i10] * f14) + (fArr4[i10] * f17);
                float max = (((Math.max(f16, f18) - Math.min(f16, f18)) / 2.0f) + Math.min(f16, f18)) * this.f29150o * this.f29151p;
                Matrix matrix = this.f29152q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f13) + f19, f10, f11);
                float[] fArr6 = this.f29146k;
                fArr6[0] = f10;
                float f21 = f11 - f16;
                fArr6[1] = f21;
                fArr6[2] = f10 + max;
                fArr6[3] = f21;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f29147l;
                fArr7[0] = f10;
                float f22 = f11 - f18;
                fArr7[1] = f22;
                fArr7[2] = f10 - max;
                fArr7[3] = f22;
                matrix.reset();
                matrix.setRotate(f20, f10, f11);
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
        for (int i10 = 0; i10 < this.f29149n; i10++) {
            c(this.e, this.f29142f, i10);
            c(this.f29143g, this.h, i10);
            this.f29144i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f10 = this.f29149n;
        float f11 = this.f29140b;
        float f12 = this.f29139a;
        Random random = this.f29148m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f11 - f12)) + f12;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f10) * 0.05f) + ((360.0f / f10) * i10);
        this.f29145j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f10, boolean z4) {
        this.f29154s = f10;
        if (!LiteMode.isEnabled(this.f29153r)) {
            return;
        }
        if (z4) {
            float f11 = this.f29154s;
            float f12 = this.f29155t;
            if (f11 > f12) {
                this.f29156u = (f11 - f12) / 205.0f;
                return;
            } else {
                this.f29156u = (f11 - f12) / 275.0f;
                return;
            }
        }
        float f13 = this.f29154s;
        float f14 = this.f29155t;
        if (f13 > f14) {
            this.f29156u = (f13 - f14) / 320.0f;
        } else {
            this.f29156u = (f13 - f14) / 375.0f;
        }
    }

    public final void e(float f10, float f11) {
        if (LiteMode.isEnabled(this.f29153r)) {
            for (int i10 = 0; i10 < this.f29149n; i10++) {
                float[] fArr = this.f29144i;
                float f12 = fArr[i10];
                float f13 = this.f29145j[i10];
                float f14 = (f13 * f10 * 8.2f * f11) + (0.8f * f13) + f12;
                fArr[i10] = f14;
                if (f14 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f29143g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f29142f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j10) {
        float f10 = this.f29154s;
        float f11 = this.f29155t;
        if (f10 != f11) {
            float f12 = this.f29156u;
            float f13 = (((float) j10) * f12) + f11;
            this.f29155t = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f29155t = f10;
                }
            } else if (f13 < f10) {
                this.f29155t = f10;
            }
        }
    }

    public u9(int i10, int i11) {
        float f10;
        this.f29141c = new Path();
        this.d = new Paint(1);
        this.f29146k = new float[4];
        this.f29147l = new float[4];
        this.f29148m = new Random();
        this.f29151p = 1.0f;
        this.f29152q = new Matrix();
        this.f29149n = i10;
        this.f29150o = (float) (Math.tan(3.141592653589793d / (f10 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f29142f = new float[i10];
        this.f29143g = new float[i10];
        this.h = new float[i10];
        this.f29144i = new float[i10];
        this.f29145j = new float[i10];
        for (int i12 = 0; i12 < this.f29149n; i12++) {
            c(this.e, this.f29142f, i12);
            c(this.f29143g, this.h, i12);
            this.f29144i[i12] = 0.0f;
        }
        this.f29153r = i11;
    }
}
