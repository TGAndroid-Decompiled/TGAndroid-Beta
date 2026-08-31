package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class u9 {
    public float f31606a;
    public float f31607b;
    public final Path f31608c;
    public final Paint d;
    public final float[] f31609e;
    public final float[] f31610f;
    public final float[] f31611g;
    public final float[] h;
    public final float[] f31612i;
    public final float[] f31613j;
    public final float[] f31614k;
    public final float[] f31615l;
    public final Random f31616m;
    public final float f31617n;
    public final float f31618o;
    public final float f31619p;
    public final Matrix f31620q;
    public final int f31621r;
    public float f31622s;
    public float f31623t;
    public float f31624u;

    public u9(int i10) {
        this(i10, 512);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f31621r)) {
            return;
        }
        Path path = this.f31608c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f12 = this.f31617n;
            if (i11 < f12) {
                float[] fArr = this.f31612i;
                float f13 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f12) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f14 = fArr[i10];
                float[] fArr2 = this.f31609e;
                float f15 = 1.0f - f13;
                float[] fArr3 = this.f31611g;
                float f16 = (fArr3[i11] * f13) + (fArr2[i11] * f15);
                float f17 = 1.0f - f14;
                float f18 = (fArr3[i10] * f14) + (fArr2[i10] * f17);
                float[] fArr4 = this.f31610f;
                float f19 = fArr4[i11] * f15;
                float[] fArr5 = this.h;
                float f20 = (fArr5[i10] * f14) + (fArr4[i10] * f17);
                float max = (((Math.max(f16, f18) - Math.min(f16, f18)) / 2.0f) + Math.min(f16, f18)) * this.f31618o * this.f31619p;
                Matrix matrix = this.f31620q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f13) + f19, f10, f11);
                float[] fArr6 = this.f31614k;
                fArr6[0] = f10;
                float f21 = f11 - f16;
                fArr6[1] = f21;
                fArr6[2] = f10 + max;
                fArr6[3] = f21;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f31615l;
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
        for (int i10 = 0; i10 < this.f31617n; i10++) {
            c(this.f31609e, this.f31610f, i10);
            c(this.f31611g, this.h, i10);
            this.f31612i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f10 = this.f31617n;
        float f11 = this.f31607b;
        float f12 = this.f31606a;
        Random random = this.f31616m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f11 - f12)) + f12;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f10) * 0.05f) + ((360.0f / f10) * i10);
        this.f31613j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f10, boolean z4) {
        this.f31622s = f10;
        if (!LiteMode.isEnabled(this.f31621r)) {
            return;
        }
        if (z4) {
            float f11 = this.f31622s;
            float f12 = this.f31623t;
            if (f11 > f12) {
                this.f31624u = (f11 - f12) / 205.0f;
                return;
            } else {
                this.f31624u = (f11 - f12) / 275.0f;
                return;
            }
        }
        float f13 = this.f31622s;
        float f14 = this.f31623t;
        if (f13 > f14) {
            this.f31624u = (f13 - f14) / 320.0f;
        } else {
            this.f31624u = (f13 - f14) / 375.0f;
        }
    }

    public final void e(float f10, float f11) {
        if (LiteMode.isEnabled(this.f31621r)) {
            for (int i10 = 0; i10 < this.f31617n; i10++) {
                float[] fArr = this.f31612i;
                float f12 = fArr[i10];
                float f13 = this.f31613j[i10];
                float f14 = (f13 * f10 * 8.2f * f11) + (0.8f * f13) + f12;
                fArr[i10] = f14;
                if (f14 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f31611g;
                    this.f31609e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f31610f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j10) {
        float f10 = this.f31622s;
        float f11 = this.f31623t;
        if (f10 != f11) {
            float f12 = this.f31624u;
            float f13 = (((float) j10) * f12) + f11;
            this.f31623t = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f31623t = f10;
                }
            } else if (f13 < f10) {
                this.f31623t = f10;
            }
        }
    }

    public u9(int i10, int i11) {
        float f10;
        this.f31608c = new Path();
        this.d = new Paint(1);
        this.f31614k = new float[4];
        this.f31615l = new float[4];
        this.f31616m = new Random();
        this.f31619p = 1.0f;
        this.f31620q = new Matrix();
        this.f31617n = i10;
        this.f31618o = (float) (Math.tan(3.141592653589793d / (f10 * 2.0f)) * 1.3333333333333333d);
        this.f31609e = new float[i10];
        this.f31610f = new float[i10];
        this.f31611g = new float[i10];
        this.h = new float[i10];
        this.f31612i = new float[i10];
        this.f31613j = new float[i10];
        for (int i12 = 0; i12 < this.f31617n; i12++) {
            c(this.f31609e, this.f31610f, i12);
            c(this.f31611g, this.h, i12);
            this.f31612i[i12] = 0.0f;
        }
        this.f31621r = i11;
    }
}
