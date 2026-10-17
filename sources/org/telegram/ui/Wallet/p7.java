package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class p7 extends View {
    public final w7 f34749a;

    public p7(w7 w7Var, Context context) {
        super(context);
        this.f34749a = w7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f7;
        Canvas canvas2;
        float f10;
        float f11;
        w7 w7Var = this.f34749a;
        if (w7Var.T0 > 0.0f) {
            if (w7Var.S0) {
                float f12 = w7Var.P0;
                pow = com.google.android.gms.internal.cast.a6.B(f12, 2.0f, 3.0f, f12 * f12);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - w7Var.P0, 4.0d));
            }
            float f13 = pow;
            boolean z10 = w7Var.S0;
            if (!z10 && f13 < 1.0f) {
                f7 = w7Var.T0 * 1.2f * f13;
            } else {
                f7 = -1.0f;
            }
            float f14 = f7;
            v7 v7Var = w7Var.N0;
            if (v7Var != null && f13 < 1.0f) {
                if (z10) {
                    f11 = 1.0f - f13;
                } else {
                    f11 = 1.0f;
                }
                canvas2 = canvas;
                w7Var.s(canvas2, v7Var, f11, f14, true);
            } else {
                canvas2 = canvas;
            }
            v7 v7Var2 = w7Var.O0;
            if (v7Var2 != null) {
                if (w7Var.S0) {
                    f10 = f13;
                } else {
                    f10 = 1.0f;
                }
                w7Var.s(canvas2, v7Var2, f10, f14, false);
            }
        }
    }
}
