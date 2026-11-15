package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class v7 extends View {
    public final c8 f44607a;

    public v7(c8 c8Var, Context context) {
        super(context);
        this.f44607a = c8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f10;
        Canvas canvas2;
        float f11;
        float f12;
        c8 c8Var = this.f44607a;
        if (c8Var.Z0 > 0.0f) {
            if (c8Var.Y0) {
                float f13 = c8Var.V0;
                pow = com.google.android.gms.internal.vision.e2.C(f13, 2.0f, 3.0f, f13 * f13);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - c8Var.V0, 4.0d));
            }
            float f14 = pow;
            boolean z10 = c8Var.Y0;
            if (!z10 && f14 < 1.0f) {
                f10 = c8Var.Z0 * 1.2f * f14;
            } else {
                f10 = -1.0f;
            }
            float f15 = f10;
            b8 b8Var = c8Var.T0;
            if (b8Var != null && f14 < 1.0f) {
                if (z10) {
                    f12 = 1.0f - f14;
                } else {
                    f12 = 1.0f;
                }
                canvas2 = canvas;
                c8Var.s(canvas2, b8Var, f12, f15, true);
            } else {
                canvas2 = canvas;
            }
            b8 b8Var2 = c8Var.U0;
            if (b8Var2 != null) {
                if (c8Var.Y0) {
                    f11 = f14;
                } else {
                    f11 = 1.0f;
                }
                c8Var.s(canvas2, b8Var2, f11, f15, false);
            }
        }
    }
}
