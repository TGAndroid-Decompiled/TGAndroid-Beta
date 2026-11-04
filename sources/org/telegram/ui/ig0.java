package org.telegram.ui;

import android.content.Context;
public final class ig0 extends gi.d {
    public final int f46264l0;
    public final org.telegram.ui.Components.ma m0;

    public ig0(org.telegram.ui.Components.ma maVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var, true);
        this.f46264l0 = i3;
        this.m0 = maVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z10;
        boolean z11;
        switch (this.f46264l0) {
            case 0:
                kg0 kg0Var = (kg0) this.m0;
                if (kg0Var.f46929g2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kg0Var.f46929g2 = f10;
                if (z10) {
                    kg0Var.f46930h2 = new org.telegram.ui.Components.yo(kg0Var, 2);
                    kg0Var.e1(false);
                }
                return f10;
            default:
                xg.e1 e1Var = (xg.e1) this.m0;
                if (e1Var.f58684m2 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e1Var.f58684m2 = f10;
                if (z11) {
                    e1Var.f58685n2 = new org.telegram.ui.Components.yo(e1Var, 3);
                    e1Var.n1(false);
                }
                return f10;
        }
    }
}
