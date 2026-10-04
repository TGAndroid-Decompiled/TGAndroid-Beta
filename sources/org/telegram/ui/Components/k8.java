package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class k8 {
    public float f27991f;
    public boolean f27992g;
    public final Paint h;
    public org.telegram.ui.Cells.u1 f27993i;
    public int f28000p;
    public int f28001q;
    public float f28002r;
    public final int[] f27988b = new int[3];
    public final float[] f27989c = new float[8];
    public final float[] d = new float[8];
    public final float[] f27990e = new float[8];
    public final Random f27994j = new Random();
    public final float f27995k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f27996l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f27997m = 120.0f;
    public final int f27998n = 61;
    public final float[] f27999o = new float[6];
    public final vp[] f27987a = new vp[2];

    public k8() {
        for (int i10 = 0; i10 < 2; i10++) {
            vp[] vpVarArr = this.f27987a;
            vp vpVar = new vp();
            vpVarArr[i10] = vpVar;
            vpVar.f32335g = AndroidUtilities.dp(24.0f);
            vpVar.f32338k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f7, float f10, float f11, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f27998n * f11));
        b(canvas, f7, f10);
    }

    public final void b(Canvas canvas, float f7, float f10) {
        float[] fArr;
        float f11;
        int[] iArr;
        if (LiteMode.isEnabled(32)) {
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.f27989c;
                float f12 = fArr2[i10];
                float f13 = fArr[i10];
                if (f12 != f13) {
                    float[] fArr3 = this.f27990e;
                    float f14 = (fArr3[i10] * 16.0f) + f13;
                    fArr[i10] = f14;
                    float f15 = fArr3[i10];
                    if ((f15 > 0.0f && f14 > fArr2[i10]) || (f15 < 0.0f && f14 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f27993i.invalidate();
                }
                i10++;
            }
            if (this.f27992g) {
                float f16 = this.f27991f + 0.02f;
                this.f27991f = f16;
                if (f16 > 1.0f) {
                    this.f27992g = false;
                    this.f27991f = 1.0f;
                }
            } else {
                float f17 = this.f27991f - 0.02f;
                this.f27991f = f17;
                if (f17 < 0.0f) {
                    this.f27992g = true;
                    this.f27991f = 0.0f;
                }
            }
            float f18 = fArr[7];
            float f19 = fArr[6] * fArr[0];
            if (f18 == 0.0f && f19 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f11 = this.f27996l;
                iArr = this.f27988b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f11);
                i11++;
            }
            vp[] vpVarArr = this.f27987a;
            vp vpVar = vpVarArr[0];
            for (int i12 = 0; i12 < vpVar.f32334f; i12 += 2) {
                float[] fArr4 = vpVar.f32337j;
                fArr4[i12] = iArr[i12 / 2];
                fArr4[i12 + 1] = 0.0f;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f11);
            }
            vp vpVar2 = vpVarArr[1];
            for (int i14 = 0; i14 < vpVar2.f32334f; i14 += 2) {
                float[] fArr5 = vpVar2.f32337j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f27995k * f18) + (AndroidUtilities.dp(4.0f) * f19) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            vp vpVar3 = vpVarArr[0];
            vpVarArr[1].f32335g = dp;
            vpVar3.f32335g = dp;
            canvas.save();
            float f20 = (float) (this.f28002r + 0.6d);
            this.f28002r = f20;
            canvas.rotate(f20, f7, f10);
            canvas.save();
            float f21 = (this.f27991f * 0.04f) + 1.0f;
            canvas.scale(f21, f21, f7, f10);
            vp vpVar4 = vpVarArr[0];
            Paint paint = this.h;
            vpVar4.a(f7, f10, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f7, f10);
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f27991f, 0.04f, 1.0f);
            canvas.scale(z10, z10, f7, f10);
            vpVarArr[1].a(f7, f10, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f7, float f10, boolean z10, float f11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f27998n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Nb, d6Var));
            paint.setAlpha((int) (i10 * f11));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20921ie, d6Var));
            paint.setAlpha((int) (i10 * f11));
        }
        b(canvas, f7, f10);
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var) {
        this.f27993i = u1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        boolean z12;
        float f7;
        float f10;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f11 = 0.0f;
            float[] fArr4 = this.f27989c;
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
            float[] fArr5 = this.f27999o;
            if (fArr != null && f7 > 0.4d) {
                int i11 = this.f28001q;
                fArr5[i11] = f7;
                int i12 = i11 + 1;
                this.f28001q = i12;
                if (i12 > 5) {
                    this.f28001q = 0;
                }
                this.f28000p++;
            } else {
                this.f28000p = 0;
            }
            if (z12) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f27994j.nextInt() % 500) / 1000.0f;
                }
            }
            float f12 = this.f27997m;
            if (z12) {
                f10 = 2.0f * f12;
            } else {
                f10 = f12;
            }
            if (this.f28000p > 6) {
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
                fArr2 = this.f27990e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f27993i == null) {
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
