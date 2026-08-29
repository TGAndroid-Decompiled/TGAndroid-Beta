package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class y9 {
    public float f34975a;
    public float f34976b;
    public final Path f34977c;
    public final Paint d;
    public final float[] f34978e;
    public final float[] f34979f;
    public final float[] f34980g;
    public final float[] h;
    public final float[] f34981i;
    public final float[] f34982j;
    public final float[] f34983k;
    public final float[] f34984l;
    public final Random f34985m;
    public final float f34986n;
    public final float f34987o;
    public final float f34988p;
    public final Matrix f34989q;
    public final int f34990r;
    public float f34991s;
    public float f34992t;
    public float f34993u;

    public y9(int i10) {
        this(i10, 512);
    }

    public final void a(float f9, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f34990r)) {
            return;
        }
        Path path = this.f34977c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f34986n;
            if (i11 < f11) {
                float[] fArr = this.f34981i;
                float f12 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f11) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f13 = fArr[i10];
                float[] fArr2 = this.f34978e;
                float f14 = 1.0f - f12;
                float[] fArr3 = this.f34980g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f34979f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f34987o * this.f34988p;
                Matrix matrix = this.f34989q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f9, f10);
                float[] fArr6 = this.f34983k;
                fArr6[0] = f9;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f9 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f34984l;
                fArr7[0] = f9;
                float f21 = f10 - f17;
                fArr7[1] = f21;
                fArr7[2] = f9 - max;
                fArr7[3] = f21;
                matrix.reset();
                matrix.setRotate(f19, f9, f10);
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
        for (int i10 = 0; i10 < this.f34986n; i10++) {
            c(this.f34978e, this.f34979f, i10);
            c(this.f34980g, this.h, i10);
            this.f34981i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f9 = this.f34986n;
        float f10 = this.f34976b;
        float f11 = this.f34975a;
        Random random = this.f34985m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f9) * 0.05f) + ((360.0f / f9) * i10);
        this.f34982j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f9, boolean z10) {
        this.f34991s = f9;
        if (!LiteMode.isEnabled(this.f34990r)) {
            return;
        }
        if (z10) {
            float f10 = this.f34991s;
            float f11 = this.f34992t;
            if (f10 > f11) {
                this.f34993u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f34993u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f34991s;
        float f13 = this.f34992t;
        if (f12 > f13) {
            this.f34993u = (f12 - f13) / 320.0f;
        } else {
            this.f34993u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f9, float f10) {
        if (LiteMode.isEnabled(this.f34990r)) {
            for (int i10 = 0; i10 < this.f34986n; i10++) {
                float[] fArr = this.f34981i;
                float f11 = fArr[i10];
                float f12 = this.f34982j[i10];
                float f13 = (f12 * f9 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f34980g;
                    this.f34978e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f34979f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j10) {
        float f9 = this.f34991s;
        float f10 = this.f34992t;
        if (f9 != f10) {
            float f11 = this.f34993u;
            float f12 = (((float) j10) * f11) + f10;
            this.f34992t = f12;
            if (f11 > 0.0f) {
                if (f12 > f9) {
                    this.f34992t = f9;
                }
            } else if (f12 < f9) {
                this.f34992t = f9;
            }
        }
    }

    public y9(int i10, int i11) {
        float f9;
        this.f34977c = new Path();
        this.d = new Paint(1);
        this.f34983k = new float[4];
        this.f34984l = new float[4];
        this.f34985m = new Random();
        this.f34988p = 1.0f;
        this.f34989q = new Matrix();
        this.f34986n = i10;
        this.f34987o = (float) (Math.tan(3.141592653589793d / (f9 * 2.0f)) * 1.3333333333333333d);
        this.f34978e = new float[i10];
        this.f34979f = new float[i10];
        this.f34980g = new float[i10];
        this.h = new float[i10];
        this.f34981i = new float[i10];
        this.f34982j = new float[i10];
        for (int i12 = 0; i12 < this.f34986n; i12++) {
            c(this.f34978e, this.f34979f, i12);
            c(this.f34980g, this.h, i12);
            this.f34981i[i12] = 0.0f;
        }
        this.f34990r = i11;
    }
}
