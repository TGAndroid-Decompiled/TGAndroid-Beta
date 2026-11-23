package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class l8 extends View {
    public final s8 f44621a;

    public l8(s8 s8Var, Context context) {
        super(context);
        this.f44621a = s8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f10;
        Canvas canvas2;
        float f11;
        float f12;
        s8 s8Var = this.f44621a;
        if (s8Var.Z0 > 0.0f) {
            if (s8Var.Y0) {
                float f13 = s8Var.V0;
                pow = com.google.android.gms.internal.vision.e2.C(f13, 2.0f, 3.0f, f13 * f13);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - s8Var.V0, 4.0d));
            }
            float f14 = pow;
            boolean z10 = s8Var.Y0;
            if (!z10 && f14 < 1.0f) {
                f10 = s8Var.Z0 * 1.2f * f14;
            } else {
                f10 = -1.0f;
            }
            float f15 = f10;
            r8 r8Var = s8Var.T0;
            if (r8Var != null && f14 < 1.0f) {
                if (z10) {
                    f12 = 1.0f - f14;
                } else {
                    f12 = 1.0f;
                }
                canvas2 = canvas;
                s8Var.s(canvas2, r8Var, f12, f15, true);
            } else {
                canvas2 = canvas;
            }
            r8 r8Var2 = s8Var.U0;
            if (r8Var2 != null) {
                if (s8Var.Y0) {
                    f11 = f14;
                } else {
                    f11 = 1.0f;
                }
                s8Var.s(canvas2, r8Var2, f11, f15, false);
            }
        }
    }
}
