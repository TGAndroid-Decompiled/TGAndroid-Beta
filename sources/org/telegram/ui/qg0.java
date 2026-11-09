package org.telegram.ui;

import android.content.Context;
public final class qg0 extends fi.d {
    public final int f49045k0;
    public final org.telegram.ui.Components.na f49046l0;

    public qg0(org.telegram.ui.Components.na naVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var, true);
        this.f49045k0 = i7;
        this.f49046l0 = naVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z9;
        boolean z10;
        switch (this.f49045k0) {
            case 0:
                sg0 sg0Var = (sg0) this.f49046l0;
                if (sg0Var.f49906f2 == 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                sg0Var.f49906f2 = f10;
                if (z9) {
                    sg0Var.f49907g2 = new org.telegram.ui.Components.yo(sg0Var, 2);
                    sg0Var.e1(false);
                }
                return f10;
            default:
                wg.f1 f1Var = (wg.f1) this.f49046l0;
                if (f1Var.f57736l2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f1Var.f57736l2 = f10;
                if (z10) {
                    f1Var.f57737m2 = new org.telegram.ui.Components.yo(f1Var, 3);
                    f1Var.n1(false);
                }
                return f10;
        }
    }
}
