package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
public final class g8 {
    public float f35436f;
    public boolean f35437g;
    public final Paint h;
    public org.telegram.ui.Cells.r1 f35438i;
    public int f35445p;
    public int f35446q;
    public float f35447r;
    public final int[] f35433b = new int[3];
    public final float[] f35434c = new float[8];
    public final float[] d = new float[8];
    public final float[] f35435e = new float[8];
    public final Random f35439j = new Random();
    public final float f35440k = org.telegram.messenger.g0.L(6.0f) * 0.33f;
    public final float f35441l = org.telegram.messenger.g0.L(12.0f) * 0.36f;
    public final float f35442m = 120.0f;
    public final int f35443n = 61;
    public final float[] f35444o = new float[6];
    public final tp[] f35432a = new tp[2];

    public g8() {
        for (int i7 = 0; i7 < 2; i7++) {
            tp[] tpVarArr = this.f35432a;
            tp tpVar = new tp();
            tpVarArr[i7] = tpVar;
            tpVar.f40016g = org.telegram.messenger.g0.L(24.0f);
            tpVar.f40019k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i7, Canvas canvas) {
        if (!org.telegram.messenger.pc.e(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i7);
        paint.setAlpha((int) (this.f35443n * f12));
        b(canvas, f10, f11);
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr;
        float f12;
        int[] iArr;
        if (org.telegram.messenger.pc.e(32)) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.f35434c;
                float f13 = fArr2[i10];
                float f14 = fArr[i10];
                if (f13 != f14) {
                    float[] fArr3 = this.f35435e;
                    float f15 = (fArr3[i10] * 16.0f) + f14;
                    fArr[i10] = f15;
                    float f16 = fArr3[i10];
                    if ((f16 > 0.0f && f15 > fArr2[i10]) || (f16 < 0.0f && f15 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f35438i.invalidate();
                }
                i10++;
            }
            char c10 = 1;
            if (this.f35437g) {
                float f17 = this.f35436f + 0.02f;
                this.f35436f = f17;
                if (f17 > 1.0f) {
                    this.f35437g = false;
                    this.f35436f = 1.0f;
                }
            } else {
                float f18 = this.f35436f - 0.02f;
                this.f35436f = f18;
                if (f18 < 0.0f) {
                    this.f35437g = true;
                    this.f35436f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f12 = this.f35441l;
                iArr = this.f35433b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f12);
                i11++;
            }
            tp[] tpVarArr = this.f35432a;
            tp tpVar = tpVarArr[0];
            while (i7 < tpVar.f40015f) {
                float[] fArr4 = tpVar.f40018j;
                fArr4[i7] = iArr[i7 / 2];
                fArr4[i7 + 1] = 0.0f;
                i7 += 2;
                c10 = c10;
            }
            char c11 = c10;
            for (int i12 = 0; i12 < 3; i12++) {
                iArr[i12] = (int) (fArr[i12 + 3] * f12);
            }
            tp tpVar2 = tpVarArr[c11];
            for (int i13 = 0; i13 < tpVar2.f40015f; i13 += 2) {
                float[] fArr5 = tpVar2.f40018j;
                fArr5[i13] = iArr[i13 / 2];
                fArr5[i13 + 1] = 0.0f;
            }
            float L = (this.f35440k * f19) + (org.telegram.messenger.g0.L(4.0f) * f20) + org.telegram.messenger.g0.L(22.0f);
            if (L > org.telegram.messenger.g0.L(26.0f)) {
                L = org.telegram.messenger.g0.L(26.0f);
            }
            tp tpVar3 = tpVarArr[0];
            tpVarArr[c11].f40016g = L;
            tpVar3.f40016g = L;
            canvas.save();
            float f21 = (float) (this.f35447r + 0.6d);
            this.f35447r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f35436f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            tp tpVar4 = tpVarArr[0];
            Paint paint = this.h;
            tpVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f35436f, 0.04f, 1.0f);
            canvas.scale(z10, z10, f10, f11);
            tpVarArr[c11].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z10, float f12, org.telegram.ui.ActionBar.h6 h6Var) {
        if (!org.telegram.messenger.pc.e(32)) {
            return;
        }
        int i7 = this.f35443n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ec, h6Var));
            paint.setAlpha((int) (i7 * f12));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ze, h6Var));
            paint.setAlpha((int) (i7 * f12));
        }
        b(canvas, f10, f11);
    }

    public final void d(org.telegram.ui.Cells.r1 r1Var) {
        this.f35438i = r1Var;
    }

    public final void e(boolean z10, float[] fArr) {
        boolean z11;
        float f10;
        float f11;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        if (!org.telegram.messenger.pc.e(32)) {
            return;
        }
        float f12 = 0.0f;
        int i7 = 0;
        if (fArr != null && fArr[6] == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (fArr == null) {
            f10 = 0.0f;
        } else {
            f10 = fArr[6];
        }
        float[] fArr5 = this.f35444o;
        if (fArr != null && f10 > 0.4d) {
            int i10 = this.f35446q;
            fArr5[i10] = f10;
            int i11 = i10 + 1;
            this.f35446q = i11;
            if (i11 > 5) {
                this.f35446q = 0;
            }
            this.f35445p++;
        } else {
            this.f35445p = 0;
        }
        if (z11) {
            for (int i12 = 0; i12 < 6; i12++) {
                fArr[i12] = (this.f35439j.nextInt() % 500) / 1000.0f;
            }
        }
        float f13 = this.f35442m;
        if (z11) {
            f11 = 2.0f * f13;
        } else {
            f11 = f13;
        }
        if (this.f35445p > 6) {
            float f14 = 0.0f;
            for (int i13 = 0; i13 < 6; i13++) {
                f14 += fArr5[i13];
            }
            float f15 = f14 / 6.0f;
            if (f15 > 0.52f) {
                f11 = com.google.android.gms.internal.vision.e2.t(f15, 0.4f, f13, f11);
            }
        }
        while (true) {
            fArr2 = this.f35435e;
            fArr3 = this.d;
            fArr4 = this.f35434c;
            if (i7 >= 7) {
                break;
            }
            if (fArr == null) {
                fArr4[i7] = 0.0f;
            } else {
                fArr4[i7] = fArr[i7];
            }
            if (this.f35438i == null) {
                fArr3[i7] = fArr4[i7];
            } else if (i7 == 6) {
                fArr2[i7] = (fArr4[i7] - fArr3[i7]) / (80.0f + f13);
            } else {
                fArr2[i7] = (fArr4[i7] - fArr3[i7]) / f11;
            }
            i7++;
        }
        if (z10) {
            f12 = 1.0f;
        }
        fArr4[7] = f12;
        fArr2[7] = (f12 - fArr3[7]) / 120.0f;
    }
}
