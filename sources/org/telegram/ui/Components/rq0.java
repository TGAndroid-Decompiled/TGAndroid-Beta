package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rq0 implements Runnable {
    public final int f27674a;
    public final zu0 f27675b;

    public rq0(zu0 zu0Var, int i10) {
        this.f27674a = i10;
        this.f27675b = zu0Var;
    }

    @Override
    public final void run() {
        switch (this.f27674a) {
            case 0:
                zu0 zu0Var = this.f27675b;
                ks ksVar = zu0Var.P0;
                zu0Var.f30615b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                or0 or0Var = zu0Var.V;
                if (or0Var != null) {
                    or0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                st0[] st0VarArr = zu0Var.f30635k0;
                if (st0VarArr != null) {
                    for (st0 st0Var : st0VarArr) {
                        if (st0Var != null) {
                            int paddingTop = st0Var.h.getPaddingTop();
                            yr0 yr0Var = st0Var.h;
                            int paddingLeft = yr0Var.getPaddingLeft();
                            int Z = zu0Var.Z(st0Var.F);
                            int paddingRight = st0Var.h.getPaddingRight();
                            yr0 yr0Var2 = st0Var.h;
                            int Y = zu0Var.Y(zu0Var.v0());
                            yr0Var2.f27693e3 = Y;
                            yr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(st0Var.h, new id(st0Var, paddingTop - st0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                zu0 zu0Var2 = this.f27675b;
                zu0Var2.b1(false);
                zu0Var2.G.h(true);
                zu0Var2.f30611a1 = 0;
                return;
            default:
                this.f27675b.k0();
                return;
        }
    }
}
