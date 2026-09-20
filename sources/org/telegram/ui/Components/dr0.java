package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dr0 implements Runnable {
    public final int f23633a;
    public final jv0 f23634b;

    public dr0(jv0 jv0Var, int i10) {
        this.f23633a = i10;
        this.f23634b = jv0Var;
    }

    @Override
    public final void run() {
        switch (this.f23633a) {
            case 0:
                jv0 jv0Var = this.f23634b;
                ks ksVar = jv0Var.P0;
                jv0Var.f25484b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                yr0 yr0Var = jv0Var.V;
                if (yr0Var != null) {
                    yr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                cu0[] cu0VarArr = jv0Var.f25504k0;
                if (cu0VarArr != null) {
                    for (cu0 cu0Var : cu0VarArr) {
                        if (cu0Var != null) {
                            int paddingTop = cu0Var.h.getPaddingTop();
                            is0 is0Var = cu0Var.h;
                            int paddingLeft = is0Var.getPaddingLeft();
                            int Z = jv0Var.Z(cu0Var.F);
                            int paddingRight = cu0Var.h.getPaddingRight();
                            is0 is0Var2 = cu0Var.h;
                            int Y = jv0Var.Y(jv0Var.v0());
                            is0Var2.f23053e3 = Y;
                            is0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(cu0Var.h, new kd(cu0Var, paddingTop - cu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                jv0 jv0Var2 = this.f23634b;
                jv0Var2.b1(false);
                jv0Var2.G.h(true);
                jv0Var2.f25480a1 = 0;
                return;
            default:
                this.f23634b.k0();
                return;
        }
    }
}
