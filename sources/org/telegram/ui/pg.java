package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class pg implements Utilities.Callback0Return {
    public final int f41405a;
    public final tn f41406b;

    public pg(tn tnVar, int i10) {
        this.f41405a = i10;
        this.f41406b = tnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f41405a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.p01.c()) {
                    tn tnVar = this.f41406b;
                    org.telegram.ui.Components.p01 p01Var = tnVar.f42948r0;
                    if (p01Var == null || p01Var.f31536e) {
                        if (tnVar.getParentActivity() != null && org.telegram.ui.Components.p01.c() && tnVar.f42973t0 != null && tnVar.T0 != null) {
                            org.telegram.ui.Components.p01 p01Var2 = tnVar.f42948r0;
                            if (p01Var2 != null) {
                                AndroidUtilities.removeFromParent(p01Var2);
                            }
                            org.telegram.ui.Components.p01 p01Var3 = new org.telegram.ui.Components.p01(tnVar.getParentActivity(), new org.telegram.ui.ActionBar.c(29, tnVar, r2));
                            tnVar.f42948r0 = p01Var3;
                            org.telegram.ui.Components.p01[] p01VarArr = {p01Var3};
                            km kmVar = tnVar.T0;
                            kmVar.addView(p01Var3, kmVar.indexOfChild(tnVar.f42973t0) + 1, i7.f6.c(-1.0f, -1));
                        }
                    }
                    return tnVar.f42948r0;
                }
                return null;
            default:
                this.f41406b.getClass();
                if (org.telegram.ui.Components.p01.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
