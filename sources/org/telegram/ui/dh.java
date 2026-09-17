package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class dh implements Utilities.Callback0Return {
    public final int f33123a;
    public final bo f33124b;

    public dh(bo boVar, int i10) {
        this.f33123a = i10;
        this.f33124b = boVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f33123a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.y01.c()) {
                    bo boVar = this.f33124b;
                    org.telegram.ui.Components.y01 y01Var = boVar.f32476v0;
                    if (y01Var == null || y01Var.e) {
                        if (boVar.getParentActivity() != null && org.telegram.ui.Components.y01.c() && boVar.f32502x0 != null && boVar.X0 != null) {
                            org.telegram.ui.Components.y01 y01Var2 = boVar.f32476v0;
                            if (y01Var2 != null) {
                                AndroidUtilities.removeFromParent(y01Var2);
                            }
                            org.telegram.ui.Components.y01 y01Var3 = new org.telegram.ui.Components.y01(boVar.getParentActivity(), new l4(20, boVar, r2));
                            boVar.f32476v0 = y01Var3;
                            org.telegram.ui.Components.y01[] y01VarArr = {y01Var3};
                            tm tmVar = boVar.X0;
                            tmVar.addView(y01Var3, tmVar.indexOfChild(boVar.f32502x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return boVar.f32476v0;
                }
                return null;
            default:
                this.f33124b.getClass();
                if (org.telegram.ui.Components.y01.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
