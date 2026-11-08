package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class u7 extends View {
    public final b8 f43203a;

    public u7(b8 b8Var, Context context) {
        super(context);
        this.f43203a = b8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f10;
        Canvas canvas2;
        float f11;
        float f12;
        b8 b8Var = this.f43203a;
        if (b8Var.Y0 > 0.0f) {
            if (b8Var.X0) {
                float f13 = b8Var.U0;
                pow = com.google.android.recaptcha.internal.a.C(f13, 2.0f, 3.0f, f13 * f13);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - b8Var.U0, 4.0d));
            }
            float f14 = pow;
            boolean z9 = b8Var.X0;
            if (!z9 && f14 < 1.0f) {
                f10 = b8Var.Y0 * 1.2f * f14;
            } else {
                f10 = -1.0f;
            }
            float f15 = f10;
            a8 a8Var = b8Var.S0;
            if (a8Var != null && f14 < 1.0f) {
                if (z9) {
                    f12 = 1.0f - f14;
                } else {
                    f12 = 1.0f;
                }
                canvas2 = canvas;
                b8Var.s(canvas2, a8Var, f12, f15, true);
            } else {
                canvas2 = canvas;
            }
            a8 a8Var2 = b8Var.T0;
            if (a8Var2 != null) {
                if (b8Var.X0) {
                    f11 = f14;
                } else {
                    f11 = 1.0f;
                }
                b8Var.s(canvas2, a8Var2, f11, f15, false);
            }
        }
    }
}
