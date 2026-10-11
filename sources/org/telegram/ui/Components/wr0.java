package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wr0 implements Runnable {
    public final int f32761a;
    public final cw0 f32762b;

    public wr0(cw0 cw0Var, int i10) {
        this.f32761a = i10;
        this.f32762b = cw0Var;
    }

    @Override
    public final void run() {
        switch (this.f32761a) {
            case 0:
                cw0 cw0Var = this.f32762b;
                bt btVar = cw0Var.P0;
                cw0Var.f25491b2 = (int) btVar.c(AndroidUtilities.dp(14.0f));
                ss0 ss0Var = cw0Var.V;
                if (ss0Var != null) {
                    ss0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) btVar.c(AndroidUtilities.dp(7.0f))));
                }
                vu0[] vu0VarArr = cw0Var.f25512k0;
                if (vu0VarArr != null) {
                    for (vu0 vu0Var : vu0VarArr) {
                        if (vu0Var != null) {
                            int paddingTop = vu0Var.h.getPaddingTop();
                            bt0 bt0Var = vu0Var.h;
                            int paddingLeft = bt0Var.getPaddingLeft();
                            int Z = cw0Var.Z(vu0Var.F);
                            int paddingRight = vu0Var.h.getPaddingRight();
                            bt0 bt0Var2 = vu0Var.h;
                            int Y = cw0Var.Y(cw0Var.v0());
                            bt0Var2.f31721c3 = Y;
                            bt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(vu0Var.h, new nd(vu0Var, paddingTop - vu0Var.h.getPaddingTop(), 9));
                        }
                    }
                    return;
                }
                return;
            case 1:
                cw0 cw0Var2 = this.f32762b;
                cw0Var2.b1(false);
                cw0Var2.G.h(true);
                cw0Var2.f25487a1 = 0;
                return;
            default:
                this.f32762b.k0();
                return;
        }
    }
}
