package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class er0 implements Runnable {
    public final int f24041a;
    public final kv0 f24042b;

    public er0(kv0 kv0Var, int i10) {
        this.f24041a = i10;
        this.f24042b = kv0Var;
    }

    @Override
    public final void run() {
        switch (this.f24041a) {
            case 0:
                kv0 kv0Var = this.f24042b;
                ms msVar = kv0Var.P0;
                kv0Var.f25822b2 = (int) msVar.c(AndroidUtilities.dp(14.0f));
                as0 as0Var = kv0Var.V;
                if (as0Var != null) {
                    as0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) msVar.c(AndroidUtilities.dp(7.0f))));
                }
                du0[] du0VarArr = kv0Var.f25842k0;
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
                            js0Var2.f23402e3 = Y;
                            js0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(du0Var.h, new ld(du0Var, paddingTop - du0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                kv0 kv0Var2 = this.f24042b;
                kv0Var2.b1(false);
                kv0Var2.G.h(true);
                kv0Var2.f25818a1 = 0;
                return;
            default:
                this.f24042b.k0();
                return;
        }
    }
}
