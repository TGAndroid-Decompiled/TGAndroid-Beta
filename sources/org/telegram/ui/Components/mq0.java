package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class mq0 implements Runnable {
    public final int f30753a;
    public final qu0 f30754b;

    public mq0(qu0 qu0Var, int i10) {
        this.f30753a = i10;
        this.f30754b = qu0Var;
    }

    @Override
    public final void run() {
        switch (this.f30753a) {
            case 0:
                qu0 qu0Var = this.f30754b;
                fs fsVar = qu0Var.L0;
                qu0Var.X1 = (int) fsVar.c(AndroidUtilities.dp(14.0f));
                gr0 gr0Var = qu0Var.R;
                if (gr0Var != null) {
                    gr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) fsVar.c(AndroidUtilities.dp(7.0f))));
                }
                it0[] it0VarArr = qu0Var.f32070g0;
                if (it0VarArr != null) {
                    for (it0 it0Var : it0VarArr) {
                        if (it0Var != null) {
                            int paddingTop = it0Var.h.getPaddingTop();
                            or0 or0Var = it0Var.h;
                            int paddingLeft = or0Var.getPaddingLeft();
                            int Z = qu0Var.Z(it0Var.B);
                            int paddingRight = it0Var.h.getPaddingRight();
                            or0 or0Var2 = it0Var.h;
                            int Y = qu0Var.Y(qu0Var.v0());
                            or0Var2.f29229a3 = Y;
                            or0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(it0Var.h, new i8(it0Var, paddingTop - it0Var.h.getPaddingTop(), 9));
                        }
                    }
                    return;
                }
                return;
            case 1:
                qu0 qu0Var2 = this.f30754b;
                qu0Var2.b1(false);
                qu0Var2.C.h(true);
                qu0Var2.W0 = 0;
                return;
            default:
                this.f30754b.k0();
                return;
        }
    }
}
