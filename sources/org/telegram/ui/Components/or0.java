package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class or0 implements Runnable {
    public final int f29130a;
    public final uv0 f29131b;

    public or0(uv0 uv0Var, int i10) {
        this.f29130a = i10;
        this.f29131b = uv0Var;
    }

    @Override
    public final void run() {
        switch (this.f29130a) {
            case 0:
                uv0 uv0Var = this.f29131b;
                us usVar = uv0Var.P0;
                uv0Var.f31031b2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                ks0 ks0Var = uv0Var.V;
                if (ks0Var != null) {
                    ks0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                nu0[] nu0VarArr = uv0Var.f31051k0;
                if (nu0VarArr != null) {
                    for (nu0 nu0Var : nu0VarArr) {
                        if (nu0Var != null) {
                            int paddingTop = nu0Var.h.getPaddingTop();
                            ts0 ts0Var = nu0Var.h;
                            int paddingLeft = ts0Var.getPaddingLeft();
                            int Z = uv0Var.Z(nu0Var.F);
                            int paddingRight = nu0Var.h.getPaddingRight();
                            ts0 ts0Var2 = nu0Var.h;
                            int Y = uv0Var.Y(uv0Var.x0());
                            ts0Var2.f28605c3 = Y;
                            ts0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(nu0Var.h, new wr0(nu0Var, paddingTop - nu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                uv0 uv0Var2 = this.f29131b;
                uv0Var2.d1(false);
                uv0Var2.G.h(true);
                uv0Var2.f31027a1 = 0;
                return;
            default:
                this.f29131b.l0();
                return;
        }
    }
}
