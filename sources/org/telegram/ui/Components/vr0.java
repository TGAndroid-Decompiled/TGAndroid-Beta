package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vr0 implements Runnable {
    public final int f32427a;
    public final bw0 f32428b;

    public vr0(bw0 bw0Var, int i10) {
        this.f32427a = i10;
        this.f32428b = bw0Var;
    }

    @Override
    public final void run() {
        switch (this.f32427a) {
            case 0:
                bw0 bw0Var = this.f32428b;
                at atVar = bw0Var.P0;
                bw0Var.f25121b2 = (int) atVar.c(AndroidUtilities.dp(14.0f));
                rs0 rs0Var = bw0Var.V;
                if (rs0Var != null) {
                    rs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) atVar.c(AndroidUtilities.dp(7.0f))));
                }
                uu0[] uu0VarArr = bw0Var.f25142k0;
                if (uu0VarArr != null) {
                    for (uu0 uu0Var : uu0VarArr) {
                        if (uu0Var != null) {
                            int paddingTop = uu0Var.h.getPaddingTop();
                            at0 at0Var = uu0Var.h;
                            int paddingLeft = at0Var.getPaddingLeft();
                            int Z = bw0Var.Z(uu0Var.F);
                            int paddingRight = uu0Var.h.getPaddingRight();
                            at0 at0Var2 = uu0Var.h;
                            int Y = bw0Var.Y(bw0Var.v0());
                            at0Var2.f31280c3 = Y;
                            at0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(uu0Var.h, new nd(uu0Var, paddingTop - uu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    return;
                }
                return;
            case 1:
                bw0 bw0Var2 = this.f32428b;
                bw0Var2.b1(false);
                bw0Var2.G.h(true);
                bw0Var2.f25117a1 = 0;
                return;
            default:
                this.f32428b.k0();
                return;
        }
    }
}
