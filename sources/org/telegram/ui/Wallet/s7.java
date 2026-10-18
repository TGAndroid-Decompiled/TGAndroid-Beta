package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class s7 extends View {
    public final z7 f34919a;

    public s7(z7 z7Var, Context context) {
        super(context);
        this.f34919a = z7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f7;
        Canvas canvas2;
        float f10;
        float f11;
        z7 z7Var = this.f34919a;
        if (z7Var.T0 > 0.0f) {
            if (z7Var.S0) {
                float f12 = z7Var.P0;
                pow = com.google.android.gms.internal.play_billing.k3.B(f12, 2.0f, 3.0f, f12 * f12);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - z7Var.P0, 4.0d));
            }
            float f13 = pow;
            boolean z10 = z7Var.S0;
            if (!z10 && f13 < 1.0f) {
                f7 = z7Var.T0 * 1.2f * f13;
            } else {
                f7 = -1.0f;
            }
            float f14 = f7;
            y7 y7Var = z7Var.N0;
            if (y7Var != null && f13 < 1.0f) {
                if (z10) {
                    f11 = 1.0f - f13;
                } else {
                    f11 = 1.0f;
                }
                canvas2 = canvas;
                z7Var.s(canvas2, y7Var, f11, f14, true);
            } else {
                canvas2 = canvas;
            }
            y7 y7Var2 = z7Var.O0;
            if (y7Var2 != null) {
                if (z7Var.S0) {
                    f10 = f13;
                } else {
                    f10 = 1.0f;
                }
                z7Var.s(canvas2, y7Var2, f10, f14, false);
            }
        }
    }
}
