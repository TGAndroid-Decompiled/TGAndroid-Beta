package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class t7 extends View {
    public final a8 f43121a;

    public t7(a8 a8Var, Context context) {
        super(context);
        this.f43121a = a8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f10;
        Canvas canvas2;
        float f11;
        float f12;
        a8 a8Var = this.f43121a;
        if (a8Var.Y0 > 0.0f) {
            if (a8Var.X0) {
                float f13 = a8Var.U0;
                pow = com.google.android.recaptcha.internal.a.C(f13, 2.0f, 3.0f, f13 * f13);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - a8Var.U0, 4.0d));
            }
            float f14 = pow;
            boolean z9 = a8Var.X0;
            if (!z9 && f14 < 1.0f) {
                f10 = a8Var.Y0 * 1.2f * f14;
            } else {
                f10 = -1.0f;
            }
            float f15 = f10;
            z7 z7Var = a8Var.S0;
            if (z7Var != null && f14 < 1.0f) {
                if (z9) {
                    f12 = 1.0f - f14;
                } else {
                    f12 = 1.0f;
                }
                canvas2 = canvas;
                a8Var.s(canvas2, z7Var, f12, f15, true);
            } else {
                canvas2 = canvas;
            }
            z7 z7Var2 = a8Var.T0;
            if (z7Var2 != null) {
                if (a8Var.X0) {
                    f11 = f14;
                } else {
                    f11 = 1.0f;
                }
                a8Var.s(canvas2, z7Var2, f11, f15, false);
            }
        }
    }
}
