package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class nr0 implements Runnable {
    public final int f28831a;
    public final tv0 f28832b;

    public nr0(tv0 tv0Var, int i10) {
        this.f28831a = i10;
        this.f28832b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f28831a) {
            case 0:
                tv0 tv0Var = this.f28832b;
                us usVar = tv0Var.P0;
                tv0Var.f30688b2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                js0 js0Var = tv0Var.V;
                if (js0Var != null) {
                    js0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                mu0[] mu0VarArr = tv0Var.f30708k0;
                if (mu0VarArr != null) {
                    for (mu0 mu0Var : mu0VarArr) {
                        if (mu0Var != null) {
                            int paddingTop = mu0Var.h.getPaddingTop();
                            ss0 ss0Var = mu0Var.h;
                            int paddingLeft = ss0Var.getPaddingLeft();
                            int Z = tv0Var.Z(mu0Var.F);
                            int paddingRight = mu0Var.h.getPaddingRight();
                            ss0 ss0Var2 = mu0Var.h;
                            int Y = tv0Var.Y(tv0Var.x0());
                            ss0Var2.f28308c3 = Y;
                            ss0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(mu0Var.h, new vr0(mu0Var, paddingTop - mu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                tv0 tv0Var2 = this.f28832b;
                tv0Var2.d1(false);
                tv0Var2.G.h(true);
                tv0Var2.f30684a1 = 0;
                return;
            default:
                this.f28832b.l0();
                return;
        }
    }
}
