package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class m7 extends View {
    public final t7 f34542a;

    public m7(t7 t7Var, Context context) {
        super(context);
        this.f34542a = t7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f7;
        Canvas canvas2;
        float f10;
        float f11;
        t7 t7Var = this.f34542a;
        if (t7Var.Y0 > 0.0f) {
            if (t7Var.X0) {
                float f12 = t7Var.U0;
                pow = com.google.android.gms.internal.play_billing.k3.B(f12, 2.0f, 3.0f, f12 * f12);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - t7Var.U0, 4.0d));
            }
            float f13 = pow;
            boolean z10 = t7Var.X0;
            if (!z10 && f13 < 1.0f) {
                f7 = t7Var.Y0 * 1.2f * f13;
            } else {
                f7 = -1.0f;
            }
            float f14 = f7;
            s7 s7Var = t7Var.S0;
            if (s7Var != null && f13 < 1.0f) {
                if (z10) {
                    f11 = 1.0f - f13;
                } else {
                    f11 = 1.0f;
                }
                canvas2 = canvas;
                t7Var.s(canvas2, s7Var, f11, f14, true);
            } else {
                canvas2 = canvas;
            }
            s7 s7Var2 = t7Var.T0;
            if (s7Var2 != null) {
                if (t7Var.X0) {
                    f10 = f13;
                } else {
                    f10 = 1.0f;
                }
                t7Var.s(canvas2, s7Var2, f10, f14, false);
            }
        }
    }
}
