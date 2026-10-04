package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ir0 implements Runnable {
    public final int f27469a;
    public final pv0 f27470b;

    public ir0(pv0 pv0Var, int i10) {
        this.f27469a = i10;
        this.f27470b = pv0Var;
    }

    @Override
    public final void run() {
        switch (this.f27469a) {
            case 0:
                pv0 pv0Var = this.f27470b;
                ns nsVar = pv0Var.P0;
                pv0Var.f29761b2 = (int) nsVar.c(AndroidUtilities.dp(14.0f));
                fs0 fs0Var = pv0Var.V;
                if (fs0Var != null) {
                    fs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) nsVar.c(AndroidUtilities.dp(7.0f))));
                }
                iu0[] iu0VarArr = pv0Var.f29782k0;
                if (iu0VarArr != null) {
                    for (iu0 iu0Var : iu0VarArr) {
                        if (iu0Var != null) {
                            int paddingTop = iu0Var.h.getPaddingTop();
                            os0 os0Var = iu0Var.h;
                            int paddingLeft = os0Var.getPaddingLeft();
                            int Z = pv0Var.Z(iu0Var.F);
                            int paddingRight = iu0Var.h.getPaddingRight();
                            os0 os0Var2 = iu0Var.h;
                            int Y = pv0Var.Y(pv0Var.v0());
                            os0Var2.f27243l3 = Y;
                            os0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(iu0Var.h, new ld(iu0Var, paddingTop - iu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                pv0 pv0Var2 = this.f27470b;
                pv0Var2.b1(false);
                pv0Var2.G.h(true);
                pv0Var2.f29757a1 = 0;
                return;
            default:
                this.f27470b.k0();
                return;
        }
    }
}
