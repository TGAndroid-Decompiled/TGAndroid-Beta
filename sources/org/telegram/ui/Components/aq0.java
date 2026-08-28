package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class aq0 implements Runnable {
    public final int f26886a;
    public final eu0 f26887b;

    public aq0(eu0 eu0Var, int i9) {
        this.f26886a = i9;
        this.f26887b = eu0Var;
    }

    @Override
    public final void run() {
        switch (this.f26886a) {
            case 0:
                eu0 eu0Var = this.f26887b;
                bs bsVar = eu0Var.L0;
                eu0Var.X1 = (int) bsVar.c(AndroidUtilities.dp(14.0f));
                vq0 vq0Var = eu0Var.R;
                if (vq0Var != null) {
                    vq0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) bsVar.c(AndroidUtilities.dp(7.0f))));
                }
                xs0[] xs0VarArr = eu0Var.f28137g0;
                if (xs0VarArr != null) {
                    for (xs0 xs0Var : xs0VarArr) {
                        if (xs0Var != null) {
                            int paddingTop = xs0Var.h.getPaddingTop();
                            dr0 dr0Var = xs0Var.h;
                            int paddingLeft = dr0Var.getPaddingLeft();
                            int Z = eu0Var.Z(xs0Var.B);
                            int paddingRight = xs0Var.h.getPaddingRight();
                            dr0 dr0Var2 = xs0Var.h;
                            int Y = eu0Var.Y(eu0Var.v0());
                            dr0Var2.a3 = Y;
                            dr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(xs0Var.h, new qd(xs0Var, paddingTop - xs0Var.h.getPaddingTop(), 7));
                        }
                    }
                    return;
                }
                return;
            case 1:
                eu0 eu0Var2 = this.f26887b;
                eu0Var2.b1(false);
                eu0Var2.C.h(true);
                eu0Var2.W0 = 0;
                return;
            default:
                this.f26887b.k0();
                return;
        }
    }
}
