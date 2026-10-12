package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class m8 {
    public float f28428f;
    public boolean f28429g;
    public final Paint h;
    public org.telegram.ui.Cells.u1 f28430i;
    public int f28437p;
    public int f28438q;
    public float f28439r;
    public final int[] f28425b = new int[3];
    public final float[] f28426c = new float[8];
    public final float[] d = new float[8];
    public final float[] f28427e = new float[8];
    public final Random f28431j = new Random();
    public final float f28432k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f28433l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f28434m = 120.0f;
    public final int f28435n = 61;
    public final float[] f28436o = new float[6];
    public final kq[] f28424a = new kq[2];

    public m8() {
        for (int i10 = 0; i10 < 2; i10++) {
            kq[] kqVarArr = this.f28424a;
            kq kqVar = new kq();
            kqVarArr[i10] = kqVar;
            kqVar.f27922g = AndroidUtilities.dp(24.0f);
            kqVar.f27925k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f7, float f10, float f11, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f28435n * f11));
        b(canvas, f7, f10);
    }

    public final void b(Canvas canvas, float f7, float f10) {
        float[] fArr;
        float f11;
        int[] iArr;
        if (LiteMode.isEnabled(32)) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                fArr = this.d;
                if (i11 >= 8) {
                    break;
                }
                float[] fArr2 = this.f28426c;
                float f12 = fArr2[i11];
                float f13 = fArr[i11];
                if (f12 != f13) {
                    float[] fArr3 = this.f28427e;
                    float f14 = (fArr3[i11] * 16.0f) + f13;
                    fArr[i11] = f14;
                    float f15 = fArr3[i11];
                    if ((f15 > 0.0f && f14 > fArr2[i11]) || (f15 < 0.0f && f14 < fArr2[i11])) {
                        fArr[i11] = fArr2[i11];
                    }
                    this.f28430i.invalidate();
                }
                i11++;
            }
            char c10 = 1;
            if (this.f28429g) {
                float f16 = this.f28428f + 0.02f;
                this.f28428f = f16;
                if (f16 > 1.0f) {
                    this.f28429g = false;
                    this.f28428f = 1.0f;
                }
            } else {
                float f17 = this.f28428f - 0.02f;
                this.f28428f = f17;
                if (f17 < 0.0f) {
                    this.f28429g = true;
                    this.f28428f = 0.0f;
                }
            }
            float f18 = fArr[7];
            float f19 = fArr[6] * fArr[0];
            if (f18 == 0.0f && f19 == 0.0f) {
                return;
            }
            int i12 = 0;
            while (true) {
                f11 = this.f28433l;
                iArr = this.f28425b;
                if (i12 >= 3) {
                    break;
                }
                iArr[i12] = (int) (fArr[i12] * f11);
                i12++;
            }
            kq[] kqVarArr = this.f28424a;
            kq kqVar = kqVarArr[0];
            while (i10 < kqVar.f27921f) {
                float[] fArr4 = kqVar.f27924j;
                fArr4[i10] = iArr[i10 / 2];
                fArr4[i10 + 1] = 0.0f;
                i10 += 2;
                c10 = c10;
            }
            char c11 = c10;
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f11);
            }
            kq kqVar2 = kqVarArr[c11];
            for (int i14 = 0; i14 < kqVar2.f27921f; i14 += 2) {
                float[] fArr5 = kqVar2.f27924j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f28432k * f18) + (AndroidUtilities.dp(4.0f) * f19) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            kq kqVar3 = kqVarArr[0];
            kqVarArr[c11].f27922g = dp;
            kqVar3.f27922g = dp;
            canvas.save();
            float f20 = (float) (this.f28439r + 0.6d);
            this.f28439r = f20;
            canvas.rotate(f20, f7, f10);
            canvas.save();
            float f21 = (this.f28428f * 0.04f) + 1.0f;
            canvas.scale(f21, f21, f7, f10);
            kq kqVar4 = kqVarArr[0];
            Paint paint = this.h;
            kqVar4.a(f7, f10, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f7, f10);
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f28428f, 0.04f, 1.0f);
            canvas.scale(y3, y3, f7, f10);
            kqVarArr[c11].a(f7, f10, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f7, float f10, boolean z10, float f11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f28435n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Nb, c6Var));
            paint.setAlpha((int) (i10 * f11));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20658ie, c6Var));
            paint.setAlpha((int) (i10 * f11));
        }
        b(canvas, f7, f10);
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var) {
        this.f28430i = u1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        boolean z12;
        float f7;
        float f10;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f11 = 0.0f;
            float[] fArr4 = this.f28426c;
            int i10 = 0;
            if (!z10 && !z11) {
                while (i10 < 8) {
                    fArr3[i10] = 0.0f;
                    fArr4[i10] = 0.0f;
                    i10++;
                }
                return;
            }
            if (fArr != null && fArr[6] == 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (fArr == null) {
                f7 = 0.0f;
            } else {
                f7 = fArr[6];
            }
            float[] fArr5 = this.f28436o;
            if (fArr != null && f7 > 0.4d) {
                int i11 = this.f28438q;
                fArr5[i11] = f7;
                int i12 = i11 + 1;
                this.f28438q = i12;
                if (i12 > 5) {
                    this.f28438q = 0;
                }
                this.f28437p++;
            } else {
                this.f28437p = 0;
            }
            if (z12) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f28431j.nextInt() % 500) / 1000.0f;
                }
            }
            float f12 = this.f28434m;
            if (z12) {
                f10 = 2.0f * f12;
            } else {
                f10 = f12;
            }
            if (this.f28437p > 6) {
                float f13 = 0.0f;
                for (int i14 = 0; i14 < 6; i14++) {
                    f13 += fArr5[i14];
                }
                float f14 = f13 / 6.0f;
                if (f14 > 0.52f) {
                    f10 = com.google.android.gms.internal.vision.e2.b(f14, 0.4f, f12, f10);
                }
            }
            while (true) {
                fArr2 = this.f28427e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f28430i == null) {
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
}
