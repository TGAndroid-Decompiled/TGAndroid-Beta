package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jr0 implements Runnable {
    public final int f27957a;
    public final qv0 f27958b;

    public jr0(qv0 qv0Var, int i10) {
        this.f27957a = i10;
        this.f27958b = qv0Var;
    }

    @Override
    public final void run() {
        switch (this.f27957a) {
            case 0:
                qv0 qv0Var = this.f27958b;
                ns nsVar = qv0Var.P0;
                qv0Var.f30218b2 = (int) nsVar.c(AndroidUtilities.dp(14.0f));
                gs0 gs0Var = qv0Var.V;
                if (gs0Var != null) {
                    gs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) nsVar.c(AndroidUtilities.dp(7.0f))));
                }
                ju0[] ju0VarArr = qv0Var.f30239k0;
                if (ju0VarArr != null) {
                    for (ju0 ju0Var : ju0VarArr) {
                        if (ju0Var != null) {
                            int paddingTop = ju0Var.h.getPaddingTop();
                            ps0 ps0Var = ju0Var.h;
                            int paddingLeft = ps0Var.getPaddingLeft();
                            int Z = qv0Var.Z(ju0Var.F);
                            int paddingRight = ju0Var.h.getPaddingRight();
                            ps0 ps0Var2 = ju0Var.h;
                            int Y = qv0Var.Y(qv0Var.v0());
                            ps0Var2.f27599l3 = Y;
                            ps0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(ju0Var.h, new ld(ju0Var, paddingTop - ju0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                qv0 qv0Var2 = this.f27958b;
                qv0Var2.b1(false);
                qv0Var2.G.h(true);
                qv0Var2.f30214a1 = 0;
                return;
            default:
                this.f27958b.k0();
                return;
        }
    }
}
