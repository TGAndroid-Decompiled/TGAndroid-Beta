package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class qq0 implements Runnable {
    public final int f27421a;
    public final yu0 f27422b;

    public qq0(yu0 yu0Var, int i10) {
        this.f27421a = i10;
        this.f27422b = yu0Var;
    }

    @Override
    public final void run() {
        switch (this.f27421a) {
            case 0:
                yu0 yu0Var = this.f27422b;
                ks ksVar = yu0Var.P0;
                yu0Var.f30348b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                nr0 nr0Var = yu0Var.V;
                if (nr0Var != null) {
                    nr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                rt0[] rt0VarArr = yu0Var.f30368k0;
                if (rt0VarArr != null) {
                    for (rt0 rt0Var : rt0VarArr) {
                        if (rt0Var != null) {
                            int paddingTop = rt0Var.h.getPaddingTop();
                            xr0 xr0Var = rt0Var.h;
                            int paddingLeft = xr0Var.getPaddingLeft();
                            int Z = yu0Var.Z(rt0Var.F);
                            int paddingRight = rt0Var.h.getPaddingRight();
                            xr0 xr0Var2 = rt0Var.h;
                            int Y = yu0Var.Y(yu0Var.v0());
                            xr0Var2.f27445e3 = Y;
                            xr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(rt0Var.h, new id(rt0Var, paddingTop - rt0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                yu0 yu0Var2 = this.f27422b;
                yu0Var2.b1(false);
                yu0Var2.G.h(true);
                yu0Var2.f30344a1 = 0;
                return;
            default:
                this.f27422b.k0();
                return;
        }
    }
}
