package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
public final class os0 extends org.telegram.ui.e11 {
    public final tv0 H;

    public os0(tv0 tv0Var, Context context, kw0 kw0Var, ci.w6 w6Var, ns0 ns0Var) {
        super(context, kw0Var, w6Var, ns0Var);
        this.H = tv0Var;
    }

    @Override
    public final void b() {
        ss0 ss0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        tv0 tv0Var = this.H;
        mu0[] mu0VarArr = tv0Var.f30708k0;
        if (mu0VarArr != null) {
            for (mu0 mu0Var : mu0VarArr) {
                if (mu0Var != null && (ss0Var = mu0Var.h) != null) {
                    int paddingTop = ss0Var.getPaddingTop();
                    ss0 ss0Var2 = mu0Var.h;
                    int paddingLeft = ss0Var2.getPaddingLeft();
                    int Z = tv0Var.Z(mu0Var.F);
                    int paddingRight = mu0Var.h.getPaddingRight();
                    ss0 ss0Var3 = mu0Var.h;
                    int Y = tv0Var.Y(tv0Var.x0());
                    ss0Var3.f28308c3 = Y;
                    ss0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
                    int paddingTop2 = paddingTop - mu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(mu0Var.h, new vr0(mu0Var, paddingTop2, 1));
                    }
                }
                if (mu0Var != null && mu0Var.v != null) {
                    tv0Var.t1(mu0Var);
                }
            }
        }
        tv0Var.K();
    }
}
