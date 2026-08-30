package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class d8 {
    public float f24190f;
    public boolean f24191g;
    public final Paint h;
    public org.telegram.ui.Cells.t1 f24192i;
    public int f24199p;
    public int f24200q;
    public float f24201r;
    public final int[] f24188b = new int[3];
    public final float[] f24189c = new float[8];
    public final float[] d = new float[8];
    public final float[] e = new float[8];
    public final Random f24193j = new Random();
    public final float f24194k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f24195l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f24196m = 120.0f;
    public final int f24197n = 61;
    public final float[] f24198o = new float[6];
    public final qp[] f24187a = new qp[2];

    public d8() {
        for (int i10 = 0; i10 < 2; i10++) {
            qp[] qpVarArr = this.f24187a;
            qp qpVar = new qp();
            qpVarArr[i10] = qpVar;
            qpVar.f28208g = AndroidUtilities.dp(24.0f);
            qpVar.f28211k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f24197n * f12));
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
                float[] fArr2 = this.f24189c;
                float f13 = fArr2[i10];
                float f14 = fArr[i10];
                if (f13 != f14) {
                    float[] fArr3 = this.e;
                    float f15 = (fArr3[i10] * 16.0f) + f14;
                    fArr[i10] = f15;
                    float f16 = fArr3[i10];
                    if ((f16 > 0.0f && f15 > fArr2[i10]) || (f16 < 0.0f && f15 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f24192i.invalidate();
                }
                i10++;
            }
            if (this.f24191g) {
                float f17 = this.f24190f + 0.02f;
                this.f24190f = f17;
                if (f17 > 1.0f) {
                    this.f24191g = false;
                    this.f24190f = 1.0f;
                }
            } else {
                float f18 = this.f24190f - 0.02f;
                this.f24190f = f18;
                if (f18 < 0.0f) {
                    this.f24191g = true;
                    this.f24190f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f12 = this.f24195l;
                iArr = this.f24188b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f12);
                i11++;
            }
            qp[] qpVarArr = this.f24187a;
            qp qpVar = qpVarArr[0];
            for (int i12 = 0; i12 < qpVar.f28207f; i12 += 2) {
                float[] fArr4 = qpVar.f28210j;
                fArr4[i12] = iArr[i12 / 2];
                fArr4[i12 + 1] = 0.0f;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f12);
            }
            qp qpVar2 = qpVarArr[1];
            for (int i14 = 0; i14 < qpVar2.f28207f; i14 += 2) {
                float[] fArr5 = qpVar2.f28210j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f24194k * f19) + (AndroidUtilities.dp(4.0f) * f20) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            qp qpVar3 = qpVarArr[0];
            qpVarArr[1].f28208g = dp;
            qpVar3.f28208g = dp;
            canvas.save();
            float f21 = (float) (this.f24201r + 0.6d);
            this.f24201r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f24190f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            qp qpVar4 = qpVarArr[0];
            Paint paint = this.h;
            qpVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float w10 = e2.c.w(1.0f, this.f24190f, 0.04f, 1.0f);
            canvas.scale(w10, w10, f10, f11);
            qpVarArr[1].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z4, float f12, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f24197n;
        Paint paint = this.h;
        if (z4) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Nb, f6Var));
            paint.setAlpha((int) (i10 * f12));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20003ie, f6Var));
            paint.setAlpha((int) (i10 * f12));
        }
        b(canvas, f10, f11);
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var) {
        this.f24192i = t1Var;
    }

    public final void e(boolean z4, boolean z10, float[] fArr) {
        boolean z11;
        float f10;
        float f11;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f12 = 0.0f;
            float[] fArr4 = this.f24189c;
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
            float[] fArr5 = this.f24198o;
            if (fArr != null && f10 > 0.4d) {
                int i11 = this.f24200q;
                fArr5[i11] = f10;
                int i12 = i11 + 1;
                this.f24200q = i12;
                if (i12 > 5) {
                    this.f24200q = 0;
                }
                this.f24199p++;
            } else {
                this.f24199p = 0;
            }
            if (z11) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f24193j.nextInt() % 500) / 1000.0f;
                }
            }
            float f13 = this.f24196m;
            if (z11) {
                f11 = 2.0f * f13;
            } else {
                f11 = f13;
            }
            if (this.f24199p > 6) {
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
                fArr2 = this.e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f24192i == null) {
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
