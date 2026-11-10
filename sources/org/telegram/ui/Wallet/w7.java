package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class w7 extends View {
    public final d8 f43301a;

    public w7(d8 d8Var, Context context) {
        super(context);
        this.f43301a = d8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f10;
        Canvas canvas2;
        float f11;
        float f12;
        d8 d8Var = this.f43301a;
        if (d8Var.Y0 > 0.0f) {
            if (d8Var.X0) {
                float f13 = d8Var.U0;
                pow = com.google.android.recaptcha.internal.a.C(f13, 2.0f, 3.0f, f13 * f13);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - d8Var.U0, 4.0d));
            }
            float f14 = pow;
            boolean z9 = d8Var.X0;
            if (!z9 && f14 < 1.0f) {
                f10 = d8Var.Y0 * 1.2f * f14;
            } else {
                f10 = -1.0f;
            }
            float f15 = f10;
            c8 c8Var = d8Var.S0;
            if (c8Var != null && f14 < 1.0f) {
                if (z9) {
                    f12 = 1.0f - f14;
                } else {
                    f12 = 1.0f;
                }
                canvas2 = canvas;
                d8Var.s(canvas2, c8Var, f12, f15, true);
            } else {
                canvas2 = canvas;
            }
            c8 c8Var2 = d8Var.T0;
            if (c8Var2 != null) {
                if (d8Var.X0) {
                    f11 = f14;
                } else {
                    f11 = 1.0f;
                }
                d8Var.s(canvas2, c8Var2, f11, f15, false);
            }
        }
    }
}
