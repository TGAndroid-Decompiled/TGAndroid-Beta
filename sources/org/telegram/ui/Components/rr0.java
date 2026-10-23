package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rr0 implements Runnable {
    public final int f30254a;
    public final xv0 f30255b;

    public rr0(xv0 xv0Var, int i10) {
        this.f30254a = i10;
        this.f30255b = xv0Var;
    }

    @Override
    public final void run() {
        switch (this.f30254a) {
            case 0:
                xv0 xv0Var = this.f30255b;
                us usVar = xv0Var.P0;
                xv0Var.f32668c2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                ns0 ns0Var = xv0Var.V;
                if (ns0Var != null) {
                    ns0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                qu0[] qu0VarArr = xv0Var.f32687k0;
                if (qu0VarArr != null) {
                    for (qu0 qu0Var : qu0VarArr) {
                        if (qu0Var != null) {
                            int paddingTop = qu0Var.h.getPaddingTop();
                            ws0 ws0Var = qu0Var.h;
                            int paddingLeft = ws0Var.getPaddingLeft();
                            int a02 = xv0Var.a0(qu0Var.F);
                            int paddingRight = qu0Var.h.getPaddingRight();
                            ws0 ws0Var2 = qu0Var.h;
                            int Z = xv0Var.Z(xv0Var.y0());
                            ws0Var2.f29672f3 = Z;
                            ws0Var.setPadding(paddingLeft, a02, paddingRight, Z);
                            AndroidUtilities.doOnLayout(qu0Var.h, new zr0(qu0Var, paddingTop - qu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                xv0 xv0Var2 = this.f30255b;
                xv0Var2.e1(false);
                xv0Var2.G.g(true);
                xv0Var2.f32660a1 = 0;
                return;
            default:
                this.f30255b.m0();
                return;
        }
    }
}
