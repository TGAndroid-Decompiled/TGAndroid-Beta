package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class k8 extends View {
    public final r8 f44462a;

    public k8(r8 r8Var, Context context) {
        super(context);
        this.f44462a = r8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f10;
        Canvas canvas2;
        float f11;
        float f12;
        r8 r8Var = this.f44462a;
        if (r8Var.Z0 > 0.0f) {
            if (r8Var.Y0) {
                float f13 = r8Var.V0;
                pow = com.google.android.gms.internal.vision.e2.C(f13, 2.0f, 3.0f, f13 * f13);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - r8Var.V0, 4.0d));
            }
            float f14 = pow;
            boolean z10 = r8Var.Y0;
            if (!z10 && f14 < 1.0f) {
                f10 = r8Var.Z0 * 1.2f * f14;
            } else {
                f10 = -1.0f;
            }
            float f15 = f10;
            q8 q8Var = r8Var.T0;
            if (q8Var != null && f14 < 1.0f) {
                if (z10) {
                    f12 = 1.0f - f14;
                } else {
                    f12 = 1.0f;
                }
                canvas2 = canvas;
                r8Var.s(canvas2, q8Var, f12, f15, true);
            } else {
                canvas2 = canvas;
            }
            q8 q8Var2 = r8Var.U0;
            if (q8Var2 != null) {
                if (r8Var.Y0) {
                    f11 = f14;
                } else {
                    f11 = 1.0f;
                }
                r8Var.s(canvas2, q8Var2, f11, f15, false);
            }
        }
    }
}
