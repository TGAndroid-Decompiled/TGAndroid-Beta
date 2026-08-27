package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class bq0 implements Runnable {

    public final int f27192a;

    public final hu0 f27193b;

    public bq0(hu0 hu0Var, int i10) {
        this.f27192a = i10;
        this.f27193b = hu0Var;
    }

    @Override
    public final void run() {
        switch (this.f27192a) {
            case 0:
                hu0 hu0Var = this.f27193b;
                zr zrVar = hu0Var.L0;
                hu0Var.X1 = (int) zrVar.c(AndroidUtilities.dp(14.0f));
                wq0 wq0Var = hu0Var.R;
                if (wq0Var != null) {
                    wq0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) zrVar.c(AndroidUtilities.dp(7.0f))));
                }
                zs0[] zs0VarArr = hu0Var.f29122g0;
                if (zs0VarArr != null) {
                    for (zs0 zs0Var : zs0VarArr) {
                        if (zs0Var != null) {
                            int paddingTop = zs0Var.h.getPaddingTop();
                            er0 er0Var = zs0Var.h;
                            int paddingLeft = er0Var.getPaddingLeft();
                            int iZ = hu0Var.Z(zs0Var.B);
                            int paddingRight = zs0Var.h.getPaddingRight();
                            er0 er0Var2 = zs0Var.h;
                            int iY = hu0Var.Y(hu0Var.v0());
                            er0Var2.a3 = iY;
                            er0Var.setPadding(paddingLeft, iZ, paddingRight, iY);
                            AndroidUtilities.doOnLayout(zs0Var.h, new xl(zs0Var, paddingTop - zs0Var.h.getPaddingTop(), 6));
                        }
                    }
                }
                break;
            case 1:
                hu0 hu0Var2 = this.f27193b;
                hu0Var2.b1(false);
                hu0Var2.C.h(true);
                hu0Var2.W0 = 0;
                break;
            default:
                this.f27193b.k0();
                break;
        }
    }
}
