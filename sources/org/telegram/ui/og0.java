package org.telegram.ui;

import android.content.Context;
public final class og0 extends fi.d {
    public final int f48398k0;
    public final org.telegram.ui.Components.na f48399l0;

    public og0(org.telegram.ui.Components.na naVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var, true);
        this.f48398k0 = i7;
        this.f48399l0 = naVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z9;
        boolean z10;
        switch (this.f48398k0) {
            case 0:
                qg0 qg0Var = (qg0) this.f48399l0;
                if (qg0Var.f49225f2 == 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                qg0Var.f49225f2 = f10;
                if (z9) {
                    qg0Var.f49226g2 = new org.telegram.ui.Components.yo(qg0Var, 2);
                    qg0Var.e1(false);
                }
                return f10;
            default:
                wg.f1 f1Var = (wg.f1) this.f48399l0;
                if (f1Var.f57645l2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f1Var.f57645l2 = f10;
                if (z10) {
                    f1Var.f57646m2 = new org.telegram.ui.Components.yo(f1Var, 3);
                    f1Var.n1(false);
                }
                return f10;
        }
    }
}
