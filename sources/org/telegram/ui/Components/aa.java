package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class aa {
    public float f22595a;
    public float f22596b;
    public final Path f22597c;
    public final Paint d;
    public final float[] e;
    public final float[] f22598f;
    public final float[] f22599g;
    public final float[] h;
    public final float[] f22600i;
    public final float[] f22601j;
    public final float[] f22602k;
    public final float[] f22603l;
    public final Random f22604m;
    public final float f22605n;
    public final float f22606o;
    public final float f22607p;
    public final Matrix f22608q;
    public final int f22609r;
    public float f22610s;
    public float f22611t;
    public float f22612u;

    public aa(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f22609r)) {
            return;
        }
        Path path = this.f22597c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f22605n;
            if (i11 < f11) {
                float[] fArr = this.f22600i;
                float f12 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f11) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f13 = fArr[i10];
                float[] fArr2 = this.e;
                float f14 = 1.0f - f12;
                float[] fArr3 = this.f22599g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f22598f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f22606o * this.f22607p;
                Matrix matrix = this.f22608q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f22602k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f22603l;
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
        for (int i10 = 0; i10 < this.f22605n; i10++) {
            c(this.e, this.f22598f, i10);
            c(this.f22599g, this.h, i10);
            this.f22600i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f22605n;
        float f10 = this.f22596b;
        float f11 = this.f22595a;
        Random random = this.f22604m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f22601j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f22610s = f7;
        if (!LiteMode.isEnabled(this.f22609r)) {
            return;
        }
        if (z10) {
            float f10 = this.f22610s;
            float f11 = this.f22611t;
            if (f10 > f11) {
                this.f22612u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f22612u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f22610s;
        float f13 = this.f22611t;
        if (f12 > f13) {
            this.f22612u = (f12 - f13) / 320.0f;
        } else {
            this.f22612u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f22609r)) {
            for (int i10 = 0; i10 < this.f22605n; i10++) {
                float[] fArr = this.f22600i;
                float f11 = fArr[i10];
                float f12 = this.f22601j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f22599g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f22598f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f22610s;
        float f10 = this.f22611t;
        if (f7 != f10) {
            float f11 = this.f22612u;
            float f12 = (((float) j3) * f11) + f10;
            this.f22611t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f22611t = f7;
                }
            } else if (f12 < f7) {
                this.f22611t = f7;
            }
        }
    }

    public aa(int i10, int i11) {
        float f7;
        this.f22597c = new Path();
        this.d = new Paint(1);
        this.f22602k = new float[4];
        this.f22603l = new float[4];
        this.f22604m = new Random();
        this.f22607p = 1.0f;
        this.f22608q = new Matrix();
        this.f22605n = i10;
        this.f22606o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f22598f = new float[i10];
        this.f22599g = new float[i10];
        this.h = new float[i10];
        this.f22600i = new float[i10];
        this.f22601j = new float[i10];
        for (int i12 = 0; i12 < this.f22605n; i12++) {
            c(this.e, this.f22598f, i12);
            c(this.f22599g, this.h, i12);
            this.f22600i[i12] = 0.0f;
        }
        this.f22609r = i11;
    }
}
