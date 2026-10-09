package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class m8 {
    public float f28741f;
    public boolean f28742g;
    public final Paint h;
    public org.telegram.ui.Cells.u1 f28743i;
    public int f28750p;
    public int f28751q;
    public float f28752r;
    public final int[] f28738b = new int[3];
    public final float[] f28739c = new float[8];
    public final float[] d = new float[8];
    public final float[] f28740e = new float[8];
    public final Random f28744j = new Random();
    public final float f28745k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f28746l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f28747m = 120.0f;
    public final int f28748n = 61;
    public final float[] f28749o = new float[6];
    public final iq[] f28737a = new iq[2];

    public m8() {
        for (int i10 = 0; i10 < 2; i10++) {
            iq[] iqVarArr = this.f28737a;
            iq iqVar = new iq();
            iqVarArr[i10] = iqVar;
            iqVar.f27461g = AndroidUtilities.dp(24.0f);
            iqVar.f27464k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f7, float f10, float f11, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f28748n * f11));
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
                float[] fArr2 = this.f28739c;
                float f12 = fArr2[i11];
                float f13 = fArr[i11];
                if (f12 != f13) {
                    float[] fArr3 = this.f28740e;
                    float f14 = (fArr3[i11] * 16.0f) + f13;
                    fArr[i11] = f14;
                    float f15 = fArr3[i11];
                    if ((f15 > 0.0f && f14 > fArr2[i11]) || (f15 < 0.0f && f14 < fArr2[i11])) {
                        fArr[i11] = fArr2[i11];
                    }
                    this.f28743i.invalidate();
                }
                i11++;
            }
            char c10 = 1;
            if (this.f28742g) {
                float f16 = this.f28741f + 0.02f;
                this.f28741f = f16;
                if (f16 > 1.0f) {
                    this.f28742g = false;
                    this.f28741f = 1.0f;
                }
            } else {
                float f17 = this.f28741f - 0.02f;
                this.f28741f = f17;
                if (f17 < 0.0f) {
                    this.f28742g = true;
                    this.f28741f = 0.0f;
                }
            }
            float f18 = fArr[7];
            float f19 = fArr[6] * fArr[0];
            if (f18 == 0.0f && f19 == 0.0f) {
                return;
            }
            int i12 = 0;
            while (true) {
                f11 = this.f28746l;
                iArr = this.f28738b;
                if (i12 >= 3) {
                    break;
                }
                iArr[i12] = (int) (fArr[i12] * f11);
                i12++;
            }
            iq[] iqVarArr = this.f28737a;
            iq iqVar = iqVarArr[0];
            while (i10 < iqVar.f27460f) {
                float[] fArr4 = iqVar.f27463j;
                fArr4[i10] = iArr[i10 / 2];
                fArr4[i10 + 1] = 0.0f;
                i10 += 2;
                c10 = c10;
            }
            char c11 = c10;
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f11);
            }
            iq iqVar2 = iqVarArr[c11];
            for (int i14 = 0; i14 < iqVar2.f27460f; i14 += 2) {
                float[] fArr5 = iqVar2.f27463j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f28745k * f18) + (AndroidUtilities.dp(4.0f) * f19) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            iq iqVar3 = iqVarArr[0];
            iqVarArr[c11].f27461g = dp;
            iqVar3.f27461g = dp;
            canvas.save();
            float f20 = (float) (this.f28752r + 0.6d);
            this.f28752r = f20;
            canvas.rotate(f20, f7, f10);
            canvas.save();
            float f21 = (this.f28741f * 0.04f) + 1.0f;
            canvas.scale(f21, f21, f7, f10);
            iq iqVar4 = iqVarArr[0];
            Paint paint = this.h;
            iqVar4.a(f7, f10, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f7, f10);
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f28741f, 0.04f, 1.0f);
            canvas.scale(y3, y3, f7, f10);
            iqVarArr[c11].a(f7, f10, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f7, float f10, boolean z10, float f11, org.telegram.ui.ActionBar.e6 e6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f28748n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Nb, e6Var));
            paint.setAlpha((int) (i10 * f11));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20896ie, e6Var));
            paint.setAlpha((int) (i10 * f11));
        }
        b(canvas, f7, f10);
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var) {
        this.f28743i = u1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        boolean z12;
        float f7;
        float f10;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f11 = 0.0f;
            float[] fArr4 = this.f28739c;
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
            float[] fArr5 = this.f28749o;
            if (fArr != null && f7 > 0.4d) {
                int i11 = this.f28751q;
                fArr5[i11] = f7;
                int i12 = i11 + 1;
                this.f28751q = i12;
                if (i12 > 5) {
                    this.f28751q = 0;
                }
                this.f28750p++;
            } else {
                this.f28750p = 0;
            }
            if (z12) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f28744j.nextInt() % 500) / 1000.0f;
                }
            }
            float f12 = this.f28747m;
            if (z12) {
                f10 = 2.0f * f12;
            } else {
                f10 = f12;
            }
            if (this.f28750p > 6) {
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
                fArr2 = this.f28740e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f28743i == null) {
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
