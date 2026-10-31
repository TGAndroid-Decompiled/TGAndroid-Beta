package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
public final class x7 {
    public float f32398f;
    public boolean f32399g;
    public final Paint h;
    public org.telegram.ui.Cells.q1 f32400i;
    public int f32407p;
    public int f32408q;
    public float f32409r;
    public final int[] f32396b = new int[3];
    public final float[] f32397c = new float[8];
    public final float[] d = new float[8];
    public final float[] e = new float[8];
    public final Random f32401j = new Random();
    public final float f32402k = org.telegram.messenger.i0.L(6.0f) * 0.33f;
    public final float f32403l = org.telegram.messenger.i0.L(12.0f) * 0.36f;
    public final float f32404m = 120.0f;
    public final int f32405n = 61;
    public final float[] f32406o = new float[6];
    public final jp[] f32395a = new jp[2];

    public x7() {
        for (int i10 = 0; i10 < 2; i10++) {
            jp[] jpVarArr = this.f32395a;
            jp jpVar = new jp();
            jpVarArr[i10] = jpVar;
            jpVar.f27464g = org.telegram.messenger.i0.L(24.0f);
            jpVar.f27467k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f7, float f10, float f11, int i10, Canvas canvas) {
        if (!org.telegram.messenger.sc.e(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f32405n * f11));
        b(canvas, f7, f10);
    }

    public final void b(Canvas canvas, float f7, float f10) {
        float[] fArr;
        float f11;
        int[] iArr;
        if (org.telegram.messenger.sc.e(32)) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                fArr = this.d;
                if (i11 >= 8) {
                    break;
                }
                float[] fArr2 = this.f32397c;
                float f12 = fArr2[i11];
                float f13 = fArr[i11];
                if (f12 != f13) {
                    float[] fArr3 = this.e;
                    float f14 = (fArr3[i11] * 16.0f) + f13;
                    fArr[i11] = f14;
                    float f15 = fArr3[i11];
                    if ((f15 > 0.0f && f14 > fArr2[i11]) || (f15 < 0.0f && f14 < fArr2[i11])) {
                        fArr[i11] = fArr2[i11];
                    }
                    this.f32400i.invalidate();
                }
                i11++;
            }
            char c10 = 1;
            if (this.f32399g) {
                float f16 = this.f32398f + 0.02f;
                this.f32398f = f16;
                if (f16 > 1.0f) {
                    this.f32399g = false;
                    this.f32398f = 1.0f;
                }
            } else {
                float f17 = this.f32398f - 0.02f;
                this.f32398f = f17;
                if (f17 < 0.0f) {
                    this.f32399g = true;
                    this.f32398f = 0.0f;
                }
            }
            float f18 = fArr[7];
            float f19 = fArr[6] * fArr[0];
            if (f18 == 0.0f && f19 == 0.0f) {
                return;
            }
            int i12 = 0;
            while (true) {
                f11 = this.f32403l;
                iArr = this.f32396b;
                if (i12 >= 3) {
                    break;
                }
                iArr[i12] = (int) (fArr[i12] * f11);
                i12++;
            }
            jp[] jpVarArr = this.f32395a;
            jp jpVar = jpVarArr[0];
            while (i10 < jpVar.f27463f) {
                float[] fArr4 = jpVar.f27466j;
                fArr4[i10] = iArr[i10 / 2];
                fArr4[i10 + 1] = 0.0f;
                i10 += 2;
                c10 = c10;
            }
            char c11 = c10;
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f11);
            }
            jp jpVar2 = jpVarArr[c11];
            for (int i14 = 0; i14 < jpVar2.f27463f; i14 += 2) {
                float[] fArr5 = jpVar2.f27466j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float L = (this.f32402k * f18) + (org.telegram.messenger.i0.L(4.0f) * f19) + org.telegram.messenger.i0.L(22.0f);
            if (L > org.telegram.messenger.i0.L(26.0f)) {
                L = org.telegram.messenger.i0.L(26.0f);
            }
            jp jpVar3 = jpVarArr[0];
            jpVarArr[c11].f27464g = L;
            jpVar3.f27464g = L;
            canvas.save();
            float f20 = (float) (this.f32409r + 0.6d);
            this.f32409r = f20;
            canvas.rotate(f20, f7, f10);
            canvas.save();
            float f21 = (this.f32398f * 0.04f) + 1.0f;
            canvas.scale(f21, f21, f7, f10);
            jp jpVar4 = jpVarArr[0];
            Paint paint = this.h;
            jpVar4.a(f7, f10, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f7, f10);
            float z10 = c3.i0.z(1.0f, this.f32398f, 0.04f, 1.0f);
            canvas.scale(z10, z10, f7, f10);
            jpVarArr[c11].a(f7, f10, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f7, float f10, boolean z10, float f11, org.telegram.ui.ActionBar.p6 p6Var) {
        if (!org.telegram.messenger.sc.e(32)) {
            return;
        }
        int i10 = this.f32405n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bc, p6Var));
            paint.setAlpha((int) (i10 * f11));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.We, p6Var));
            paint.setAlpha((int) (i10 * f11));
        }
        b(canvas, f7, f10);
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var) {
        this.f32400i = q1Var;
    }

    public final void e(boolean z10, float[] fArr) {
        boolean z11;
        float f7;
        float f10;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        if (!org.telegram.messenger.sc.e(32)) {
            return;
        }
        float f11 = 0.0f;
        int i10 = 0;
        if (fArr != null && fArr[6] == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (fArr == null) {
            f7 = 0.0f;
        } else {
            f7 = fArr[6];
        }
        float[] fArr5 = this.f32406o;
        if (fArr != null && f7 > 0.4d) {
            int i11 = this.f32408q;
            fArr5[i11] = f7;
            int i12 = i11 + 1;
            this.f32408q = i12;
            if (i12 > 5) {
                this.f32408q = 0;
            }
            this.f32407p++;
        } else {
            this.f32407p = 0;
        }
        if (z11) {
            for (int i13 = 0; i13 < 6; i13++) {
                fArr[i13] = (this.f32401j.nextInt() % 500) / 1000.0f;
            }
        }
        float f12 = this.f32404m;
        if (z11) {
            f10 = 2.0f * f12;
        } else {
            f10 = f12;
        }
        if (this.f32407p > 6) {
            float f13 = 0.0f;
            for (int i14 = 0; i14 < 6; i14++) {
                f13 += fArr5[i14];
            }
            float f14 = f13 / 6.0f;
            if (f14 > 0.52f) {
                f10 = sc.e.z(f14, 0.4f, f12, f10);
            }
        }
        while (true) {
            fArr2 = this.e;
            fArr3 = this.d;
            fArr4 = this.f32397c;
            if (i10 >= 7) {
                break;
            }
            if (fArr == null) {
                fArr4[i10] = 0.0f;
            } else {
                fArr4[i10] = fArr[i10];
            }
            if (this.f32400i == null) {
                fArr3[i10] = fArr4[i10];
            } else if (i10 == 6) {
                fArr2[i10] = (fArr4[i10] - fArr3[i10]) / (80.0f + f12);
            } else {
                fArr2[i10] = (fArr4[i10] - fArr3[i10]) / f10;
            }
            i10++;
        }
        if (z10) {
            f11 = 1.0f;
        }
        fArr4[7] = f11;
        fArr2[7] = (f11 - fArr3[7]) / 120.0f;
    }
}
