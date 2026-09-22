package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fr0 implements Runnable {
    public final int f24327a;
    public final lv0 f24328b;

    public fr0(lv0 lv0Var, int i10) {
        this.f24327a = i10;
        this.f24328b = lv0Var;
    }

    @Override
    public final void run() {
        switch (this.f24327a) {
            case 0:
                lv0 lv0Var = this.f24328b;
                ks ksVar = lv0Var.P0;
                lv0Var.f26190b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                bs0 bs0Var = lv0Var.V;
                if (bs0Var != null) {
                    bs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                eu0[] eu0VarArr = lv0Var.f26210k0;
                if (eu0VarArr != null) {
                    for (eu0 eu0Var : eu0VarArr) {
                        if (eu0Var != null) {
                            int paddingTop = eu0Var.h.getPaddingTop();
                            ks0 ks0Var = eu0Var.h;
                            int paddingLeft = ks0Var.getPaddingLeft();
                            int Z = lv0Var.Z(eu0Var.F);
                            int paddingRight = eu0Var.h.getPaddingRight();
                            ks0 ks0Var2 = eu0Var.h;
                            int Y = lv0Var.Y(lv0Var.v0());
                            ks0Var2.f23747e3 = Y;
                            ks0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(eu0Var.h, new kd(eu0Var, paddingTop - eu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                lv0 lv0Var2 = this.f24328b;
                lv0Var2.b1(false);
                lv0Var2.G.h(true);
                lv0Var2.f26186a1 = 0;
                return;
            default:
                this.f24328b.k0();
                return;
        }
    }
}
