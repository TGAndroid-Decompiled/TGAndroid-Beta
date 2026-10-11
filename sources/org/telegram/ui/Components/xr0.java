package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xr0 implements Runnable {
    public final int f33017a;
    public final dw0 f33018b;

    public xr0(dw0 dw0Var, int i10) {
        this.f33017a = i10;
        this.f33018b = dw0Var;
    }

    @Override
    public final void run() {
        switch (this.f33017a) {
            case 0:
                dw0 dw0Var = this.f33018b;
                bt btVar = dw0Var.P0;
                dw0Var.f25690b2 = (int) btVar.c(AndroidUtilities.dp(14.0f));
                ts0 ts0Var = dw0Var.V;
                if (ts0Var != null) {
                    ts0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) btVar.c(AndroidUtilities.dp(7.0f))));
                }
                wu0[] wu0VarArr = dw0Var.f25711k0;
                if (wu0VarArr != null) {
                    for (wu0 wu0Var : wu0VarArr) {
                        if (wu0Var != null) {
                            int paddingTop = wu0Var.h.getPaddingTop();
                            ct0 ct0Var = wu0Var.h;
                            int paddingLeft = ct0Var.getPaddingLeft();
                            int Z = dw0Var.Z(wu0Var.F);
                            int paddingRight = wu0Var.h.getPaddingRight();
                            ct0 ct0Var2 = wu0Var.h;
                            int Y = dw0Var.Y(dw0Var.v0());
                            ct0Var2.f32485c3 = Y;
                            ct0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(wu0Var.h, new nd(wu0Var, paddingTop - wu0Var.h.getPaddingTop(), 9));
                        }
                    }
                    return;
                }
                return;
            case 1:
                dw0 dw0Var2 = this.f33018b;
                dw0Var2.b1(false);
                dw0Var2.G.h(true);
                dw0Var2.f25686a1 = 0;
                return;
            default:
                this.f33018b.k0();
                return;
        }
    }
}
