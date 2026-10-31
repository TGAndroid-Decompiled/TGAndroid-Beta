package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class a8 extends View {
    public final h8 f34214a;

    public a8(h8 h8Var, Context context) {
        super(context);
        this.f34214a = h8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f7;
        Canvas canvas2;
        float f10;
        float f11;
        h8 h8Var = this.f34214a;
        if (h8Var.Y0 > 0.0f) {
            if (h8Var.X0) {
                float f12 = h8Var.U0;
                pow = c3.i0.D(f12, 2.0f, 3.0f, f12 * f12);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - h8Var.U0, 4.0d));
            }
            float f13 = pow;
            boolean z10 = h8Var.X0;
            if (!z10 && f13 < 1.0f) {
                f7 = h8Var.Y0 * 1.2f * f13;
            } else {
                f7 = -1.0f;
            }
            float f14 = f7;
            g8 g8Var = h8Var.S0;
            if (g8Var != null && f13 < 1.0f) {
                if (z10) {
                    f11 = 1.0f - f13;
                } else {
                    f11 = 1.0f;
                }
                canvas2 = canvas;
                h8Var.s(canvas2, g8Var, f11, f14, true);
            } else {
                canvas2 = canvas;
            }
            g8 g8Var2 = h8Var.T0;
            if (g8Var2 != null) {
                if (h8Var.X0) {
                    f10 = f13;
                } else {
                    f10 = 1.0f;
                }
                h8Var.s(canvas2, g8Var2, f10, f14, false);
            }
        }
    }
}
