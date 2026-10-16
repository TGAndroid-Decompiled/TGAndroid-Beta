package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rr0 implements Runnable {
    public final int f28630a;
    public final xv0 f28631b;

    public rr0(xv0 xv0Var, int i10) {
        this.f28630a = i10;
        this.f28631b = xv0Var;
    }

    @Override
    public final void run() {
        switch (this.f28630a) {
            case 0:
                xv0 xv0Var = this.f28631b;
                xs xsVar = xv0Var.P0;
                xv0Var.f31025b2 = (int) xsVar.c(AndroidUtilities.dp(14.0f));
                ns0 ns0Var = xv0Var.V;
                if (ns0Var != null) {
                    ns0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) xsVar.c(AndroidUtilities.dp(7.0f))));
                }
                qu0[] qu0VarArr = xv0Var.f31045k0;
                if (qu0VarArr != null) {
                    for (qu0 qu0Var : qu0VarArr) {
                        if (qu0Var != null) {
                            int paddingTop = qu0Var.h.getPaddingTop();
                            ws0 ws0Var = qu0Var.h;
                            int paddingLeft = ws0Var.getPaddingLeft();
                            int Z = xv0Var.Z(qu0Var.F);
                            int paddingRight = qu0Var.h.getPaddingRight();
                            ws0 ws0Var2 = qu0Var.h;
                            int Y = xv0Var.Y(xv0Var.w0());
                            ws0Var2.f28109c3 = Y;
                            ws0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(qu0Var.h, new o8(qu0Var, paddingTop - qu0Var.h.getPaddingTop(), 10));
                        }
                    }
                    return;
                }
                return;
            case 1:
                xv0 xv0Var2 = this.f28631b;
                xv0Var2.c1(false);
                xv0Var2.G.h(true);
                xv0Var2.f31021a1 = 0;
                return;
            default:
                this.f28631b.k0();
                return;
        }
    }
}
