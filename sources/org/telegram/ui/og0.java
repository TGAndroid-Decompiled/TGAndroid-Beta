package org.telegram.ui;

import android.content.Context;
public final class og0 extends hi.d {
    public final int f49957l0;
    public final org.telegram.ui.Components.ja m0;

    public og0(org.telegram.ui.Components.ja jaVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var, true);
        this.f49957l0 = i7;
        this.m0 = jaVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z10;
        boolean z11;
        switch (this.f49957l0) {
            case 0:
                qg0 qg0Var = (qg0) this.m0;
                if (qg0Var.f50615j2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qg0Var.f50615j2 = f10;
                if (z10) {
                    qg0Var.f50616k2 = new org.telegram.ui.Components.hp(qg0Var, 2);
                    qg0Var.e1(false);
                }
                return f10;
            default:
                wg.c1 c1Var = (wg.c1) this.m0;
                if (c1Var.f59158p2 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c1Var.f59158p2 = f10;
                if (z11) {
                    c1Var.f59159q2 = new org.telegram.ui.Components.hp(c1Var, 3);
                    c1Var.n1(false);
                }
                return f10;
        }
    }
}
