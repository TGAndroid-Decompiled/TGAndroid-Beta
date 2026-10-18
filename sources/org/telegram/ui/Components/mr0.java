package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class mr0 implements Runnable {
    public final int f28579a;
    public final sv0 f28580b;

    public mr0(sv0 sv0Var, int i10) {
        this.f28579a = i10;
        this.f28580b = sv0Var;
    }

    @Override
    public final void run() {
        switch (this.f28579a) {
            case 0:
                sv0 sv0Var = this.f28580b;
                us usVar = sv0Var.P0;
                sv0Var.f30344b2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                is0 is0Var = sv0Var.V;
                if (is0Var != null) {
                    is0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                lu0[] lu0VarArr = sv0Var.f30364k0;
                if (lu0VarArr != null) {
                    for (lu0 lu0Var : lu0VarArr) {
                        if (lu0Var != null) {
                            int paddingTop = lu0Var.h.getPaddingTop();
                            rs0 rs0Var = lu0Var.h;
                            int paddingLeft = rs0Var.getPaddingLeft();
                            int Z = sv0Var.Z(lu0Var.F);
                            int paddingRight = lu0Var.h.getPaddingRight();
                            rs0 rs0Var2 = lu0Var.h;
                            int Y = sv0Var.Y(sv0Var.x0());
                            rs0Var2.f27987c3 = Y;
                            rs0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(lu0Var.h, new ur0(lu0Var, paddingTop - lu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                sv0 sv0Var2 = this.f28580b;
                sv0Var2.d1(false);
                sv0Var2.G.h(true);
                sv0Var2.f30340a1 = 0;
                return;
            default:
                this.f28580b.l0();
                return;
        }
    }
}
