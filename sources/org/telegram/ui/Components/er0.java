package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class er0 implements Runnable {
    public final int f23954a;
    public final kv0 f23955b;

    public er0(kv0 kv0Var, int i10) {
        this.f23954a = i10;
        this.f23955b = kv0Var;
    }

    @Override
    public final void run() {
        switch (this.f23954a) {
            case 0:
                kv0 kv0Var = this.f23955b;
                ks ksVar = kv0Var.P0;
                kv0Var.f25804b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                zr0 zr0Var = kv0Var.V;
                if (zr0Var != null) {
                    zr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                du0[] du0VarArr = kv0Var.f25824k0;
                if (du0VarArr != null) {
                    for (du0 du0Var : du0VarArr) {
                        if (du0Var != null) {
                            int paddingTop = du0Var.h.getPaddingTop();
                            js0 js0Var = du0Var.h;
                            int paddingLeft = js0Var.getPaddingLeft();
                            int Z = kv0Var.Z(du0Var.F);
                            int paddingRight = du0Var.h.getPaddingRight();
                            js0 js0Var2 = du0Var.h;
                            int Y = kv0Var.Y(kv0Var.v0());
                            js0Var2.f23329e3 = Y;
                            js0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(du0Var.h, new x2(du0Var, paddingTop - du0Var.h.getPaddingTop(), 10));
                        }
                    }
                    return;
                }
                return;
            case 1:
                kv0 kv0Var2 = this.f23955b;
                kv0Var2.b1(false);
                kv0Var2.G.h(true);
                kv0Var2.f25800a1 = 0;
                return;
            default:
                this.f23955b.k0();
                return;
        }
    }
}
