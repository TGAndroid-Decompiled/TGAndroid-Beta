package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dr0 implements Runnable {
    public final int f23720a;
    public final jv0 f23721b;

    public dr0(jv0 jv0Var, int i10) {
        this.f23720a = i10;
        this.f23721b = jv0Var;
    }

    @Override
    public final void run() {
        switch (this.f23720a) {
            case 0:
                jv0 jv0Var = this.f23721b;
                ls lsVar = jv0Var.P0;
                jv0Var.f25516b2 = (int) lsVar.c(AndroidUtilities.dp(14.0f));
                zr0 zr0Var = jv0Var.V;
                if (zr0Var != null) {
                    zr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) lsVar.c(AndroidUtilities.dp(7.0f))));
                }
                cu0[] cu0VarArr = jv0Var.f25536k0;
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
                            is0Var2.f23093e3 = Y;
                            is0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(cu0Var.h, new ld(cu0Var, paddingTop - cu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                jv0 jv0Var2 = this.f23721b;
                jv0Var2.b1(false);
                jv0Var2.G.h(true);
                jv0Var2.f25512a1 = 0;
                return;
            default:
                this.f23721b.k0();
                return;
        }
    }
}
