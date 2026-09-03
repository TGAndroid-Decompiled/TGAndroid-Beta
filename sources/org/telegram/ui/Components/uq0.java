package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uq0 implements Runnable {
    public final int f31672a;
    public final yu0 f31673b;

    public uq0(yu0 yu0Var, int i10) {
        this.f31672a = i10;
        this.f31673b = yu0Var;
    }

    @Override
    public final void run() {
        switch (this.f31672a) {
            case 0:
                yu0 yu0Var = this.f31673b;
                ls lsVar = yu0Var.M0;
                yu0Var.Y1 = (int) lsVar.c(AndroidUtilities.dp(14.0f));
                or0 or0Var = yu0Var.S;
                if (or0Var != null) {
                    or0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) lsVar.c(AndroidUtilities.dp(7.0f))));
                }
                qt0[] qt0VarArr = yu0Var.f33625h0;
                if (qt0VarArr != null) {
                    for (qt0 qt0Var : qt0VarArr) {
                        if (qt0Var != null) {
                            int paddingTop = qt0Var.h.getPaddingTop();
                            wr0 wr0Var = qt0Var.h;
                            int paddingLeft = wr0Var.getPaddingLeft();
                            int Z = yu0Var.Z(qt0Var.C);
                            int paddingRight = qt0Var.h.getPaddingRight();
                            wr0 wr0Var2 = qt0Var.h;
                            int Y = yu0Var.Y(yu0Var.v0());
                            wr0Var2.f30187b3 = Y;
                            wr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(qt0Var.h, new im(qt0Var, paddingTop - qt0Var.h.getPaddingTop(), 6));
                        }
                    }
                    return;
                }
                return;
            case 1:
                yu0 yu0Var2 = this.f31673b;
                yu0Var2.b1(false);
                yu0Var2.D.h(true);
                yu0Var2.X0 = 0;
                return;
            default:
                this.f31673b.k0();
                return;
        }
    }
}
