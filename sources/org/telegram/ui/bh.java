package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback0Return {
    public final int f32164a;
    public final bo f32165b;

    public bh(bo boVar, int i10) {
        this.f32164a = i10;
        this.f32165b = boVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f32164a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.x01.c()) {
                    bo boVar = this.f32165b;
                    org.telegram.ui.Components.x01 x01Var = boVar.f32498v0;
                    if (x01Var == null || x01Var.e) {
                        if (boVar.getParentActivity() != null && org.telegram.ui.Components.x01.c() && boVar.f32524x0 != null && boVar.X0 != null) {
                            org.telegram.ui.Components.x01 x01Var2 = boVar.f32498v0;
                            if (x01Var2 != null) {
                                AndroidUtilities.removeFromParent(x01Var2);
                            }
                            org.telegram.ui.Components.x01 x01Var3 = new org.telegram.ui.Components.x01(boVar.getParentActivity(), new l4(20, boVar, r2));
                            boVar.f32498v0 = x01Var3;
                            org.telegram.ui.Components.x01[] x01VarArr = {x01Var3};
                            tm tmVar = boVar.X0;
                            tmVar.addView(x01Var3, tmVar.indexOfChild(boVar.f32524x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return boVar.f32498v0;
                }
                return null;
            default:
                this.f32165b.getClass();
                if (org.telegram.ui.Components.x01.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
