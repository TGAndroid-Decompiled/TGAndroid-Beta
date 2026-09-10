package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class br0 implements Runnable {
    public final int f21891a;
    public final iv0 f21892b;

    public br0(iv0 iv0Var, int i10) {
        this.f21891a = i10;
        this.f21892b = iv0Var;
    }

    @Override
    public final void run() {
        switch (this.f21891a) {
            case 0:
                iv0 iv0Var = this.f21892b;
                qs qsVar = iv0Var.P0;
                iv0Var.f24087b2 = (int) qsVar.c(AndroidUtilities.dp(14.0f));
                wr0 wr0Var = iv0Var.V;
                if (wr0Var != null) {
                    wr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) qsVar.c(AndroidUtilities.dp(7.0f))));
                }
                au0[] au0VarArr = iv0Var.f24107k0;
                if (au0VarArr != null) {
                    for (au0 au0Var : au0VarArr) {
                        if (au0Var != null) {
                            int paddingTop = au0Var.h.getPaddingTop();
                            gs0 gs0Var = au0Var.h;
                            int paddingLeft = gs0Var.getPaddingLeft();
                            int Z = iv0Var.Z(au0Var.F);
                            int paddingRight = au0Var.h.getPaddingRight();
                            gs0 gs0Var2 = au0Var.h;
                            int Y = iv0Var.Y(iv0Var.v0());
                            gs0Var2.f29809e3 = Y;
                            gs0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(au0Var.h, new zd(au0Var, paddingTop - au0Var.h.getPaddingTop(), 7));
                        }
                    }
                    return;
                }
                return;
            case 1:
                iv0 iv0Var2 = this.f21892b;
                iv0Var2.b1(false);
                iv0Var2.G.h(true);
                iv0Var2.f24083a1 = 0;
                return;
            default:
                this.f21892b.k0();
                return;
        }
    }
}
