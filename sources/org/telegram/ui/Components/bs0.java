package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class bs0 implements Runnable {
    public final int f24724a;
    public final hw0 f24725b;

    public bs0(hw0 hw0Var, int i10) {
        this.f24724a = i10;
        this.f24725b = hw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24724a) {
            case 0:
                hw0 hw0Var = this.f24725b;
                ct ctVar = hw0Var.P0;
                hw0Var.f26912b2 = (int) ctVar.c(AndroidUtilities.dp(14.0f));
                xs0 xs0Var = hw0Var.V;
                if (xs0Var != null) {
                    xs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ctVar.c(AndroidUtilities.dp(7.0f))));
                }
                av0[] av0VarArr = hw0Var.f26933k0;
                if (av0VarArr != null) {
                    for (av0 av0Var : av0VarArr) {
                        if (av0Var != null) {
                            int paddingTop = av0Var.h.getPaddingTop();
                            gt0 gt0Var = av0Var.h;
                            int paddingLeft = gt0Var.getPaddingLeft();
                            int Z = hw0Var.Z(av0Var.F);
                            int paddingRight = av0Var.h.getPaddingRight();
                            gt0 gt0Var2 = av0Var.h;
                            int Y = hw0Var.Y(hw0Var.v0());
                            gt0Var2.f33496c3 = Y;
                            gt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(av0Var.h, new nd(av0Var, paddingTop - av0Var.h.getPaddingTop(), 9));
                        }
                    }
                    return;
                }
                return;
            case 1:
                hw0 hw0Var2 = this.f24725b;
                hw0Var2.b1(false);
                hw0Var2.G.i(true);
                hw0Var2.f26908a1 = 0;
                return;
            default:
                this.f24725b.k0();
                return;
        }
    }
}
