package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class d8 {
    public float f26212f;
    public boolean f26213g;
    public final Paint h;
    public org.telegram.ui.Cells.t1 f26214i;
    public int f26221p;
    public int f26222q;
    public float f26223r;
    public final int[] f26209b = new int[3];
    public final float[] f26210c = new float[8];
    public final float[] d = new float[8];
    public final float[] f26211e = new float[8];
    public final Random f26215j = new Random();
    public final float f26216k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f26217l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f26218m = 120.0f;
    public final int f26219n = 61;
    public final float[] f26220o = new float[6];
    public final sp[] f26208a = new sp[2];

    public d8() {
        for (int i10 = 0; i10 < 2; i10++) {
            sp[] spVarArr = this.f26208a;
            sp spVar = new sp();
            spVarArr[i10] = spVar;
            spVar.f31145g = AndroidUtilities.dp(24.0f);
            spVar.f31148k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f26219n * f12));
        b(canvas, f10, f11);
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr;
        float f12;
        int[] iArr;
        if (LiteMode.isEnabled(32)) {
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.f26210c;
                float f13 = fArr2[i10];
                float f14 = fArr[i10];
                if (f13 != f14) {
                    float[] fArr3 = this.f26211e;
                    float f15 = (fArr3[i10] * 16.0f) + f14;
                    fArr[i10] = f15;
                    float f16 = fArr3[i10];
                    if ((f16 > 0.0f && f15 > fArr2[i10]) || (f16 < 0.0f && f15 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f26214i.invalidate();
                }
                i10++;
            }
            if (this.f26213g) {
                float f17 = this.f26212f + 0.02f;
                this.f26212f = f17;
                if (f17 > 1.0f) {
                    this.f26213g = false;
                    this.f26212f = 1.0f;
                }
            } else {
                float f18 = this.f26212f - 0.02f;
                this.f26212f = f18;
                if (f18 < 0.0f) {
                    this.f26213g = true;
                    this.f26212f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f12 = this.f26217l;
                iArr = this.f26209b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f12);
                i11++;
            }
            sp[] spVarArr = this.f26208a;
            sp spVar = spVarArr[0];
            for (int i12 = 0; i12 < spVar.f31144f; i12 += 2) {
                float[] fArr4 = spVar.f31147j;
                fArr4[i12] = iArr[i12 / 2];
                fArr4[i12 + 1] = 0.0f;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f12);
            }
            sp spVar2 = spVarArr[1];
            for (int i14 = 0; i14 < spVar2.f31144f; i14 += 2) {
                float[] fArr5 = spVar2.f31147j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f26216k * f19) + (AndroidUtilities.dp(4.0f) * f20) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            sp spVar3 = spVarArr[0];
            spVarArr[1].f31145g = dp;
            spVar3.f31145g = dp;
            canvas.save();
            float f21 = (float) (this.f26223r + 0.6d);
            this.f26223r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f26212f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            sp spVar4 = spVarArr[0];
            Paint paint = this.h;
            spVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float w10 = e2.c.w(1.0f, this.f26212f, 0.04f, 1.0f);
            canvas.scale(w10, w10, f10, f11);
            spVarArr[1].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z4, float f12, org.telegram.ui.ActionBar.g6 g6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f26219n;
        Paint paint = this.h;
        if (z4) {
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Nb, g6Var));
            paint.setAlpha((int) (i10 * f12));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21757ie, g6Var));
            paint.setAlpha((int) (i10 * f12));
        }
        b(canvas, f10, f11);
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var) {
        this.f26214i = t1Var;
    }

    public final void e(boolean z4, boolean z10, float[] fArr) {
        boolean z11;
        float f10;
        float f11;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f12 = 0.0f;
            float[] fArr4 = this.f26210c;
            int i10 = 0;
            if (!z4 && !z10) {
                while (i10 < 8) {
                    fArr3[i10] = 0.0f;
                    fArr4[i10] = 0.0f;
                    i10++;
                }
                return;
            }
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
            float[] fArr5 = this.f26220o;
            if (fArr != null && f10 > 0.4d) {
                int i11 = this.f26222q;
                fArr5[i11] = f10;
                int i12 = i11 + 1;
                this.f26222q = i12;
                if (i12 > 5) {
                    this.f26222q = 0;
                }
                this.f26221p++;
            } else {
                this.f26221p = 0;
            }
            if (z11) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f26215j.nextInt() % 500) / 1000.0f;
                }
            }
            float f13 = this.f26218m;
            if (z11) {
                f11 = 2.0f * f13;
            } else {
                f11 = f13;
            }
            if (this.f26221p > 6) {
                float f14 = 0.0f;
                for (int i14 = 0; i14 < 6; i14++) {
                    f14 += fArr5[i14];
                }
                float f15 = f14 / 6.0f;
                if (f15 > 0.52f) {
                    f11 = org.telegram.ui.yh.c(f15, 0.4f, f13, f11);
                }
            }
            while (true) {
                fArr2 = this.f26211e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f26214i == null) {
                    fArr3[i10] = fArr4[i10];
                } else if (i10 == 6) {
                    fArr2[i10] = (fArr4[i10] - fArr3[i10]) / (80.0f + f13);
                } else {
                    fArr2[i10] = (fArr4[i10] - fArr3[i10]) / f11;
                }
                i10++;
            }
            if (z4) {
                f12 = 1.0f;
            }
            fArr4[7] = f12;
            fArr2[7] = (f12 - fArr3[7]) / 120.0f;
        }
    }
}
