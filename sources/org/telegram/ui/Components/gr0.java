package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gr0 implements Runnable {
    public final int f24665a;
    public final mv0 f24666b;

    public gr0(mv0 mv0Var, int i10) {
        this.f24665a = i10;
        this.f24666b = mv0Var;
    }

    @Override
    public final void run() {
        switch (this.f24665a) {
            case 0:
                mv0 mv0Var = this.f24666b;
                ns nsVar = mv0Var.P0;
                mv0Var.f26405b2 = (int) nsVar.c(AndroidUtilities.dp(14.0f));
                cs0 cs0Var = mv0Var.V;
                if (cs0Var != null) {
                    cs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) nsVar.c(AndroidUtilities.dp(7.0f))));
                }
                fu0[] fu0VarArr = mv0Var.f26425k0;
                if (fu0VarArr != null) {
                    for (fu0 fu0Var : fu0VarArr) {
                        if (fu0Var != null) {
                            int paddingTop = fu0Var.h.getPaddingTop();
                            ls0 ls0Var = fu0Var.h;
                            int paddingLeft = ls0Var.getPaddingLeft();
                            int Z = mv0Var.Z(fu0Var.F);
                            int paddingRight = fu0Var.h.getPaddingRight();
                            ls0 ls0Var2 = fu0Var.h;
                            int Y = mv0Var.Y(mv0Var.v0());
                            ls0Var2.f24049l3 = Y;
                            ls0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(fu0Var.h, new md(fu0Var, paddingTop - fu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                mv0 mv0Var2 = this.f24666b;
                mv0Var2.b1(false);
                mv0Var2.G.h(true);
                mv0Var2.f26401a1 = 0;
                return;
            default:
                this.f24666b.k0();
                return;
        }
    }
}
