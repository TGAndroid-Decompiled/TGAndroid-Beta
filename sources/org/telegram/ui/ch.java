package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ch implements Utilities.Callback0Return {
    public final int f31667a;
    public final eo f31668b;

    public ch(eo eoVar, int i10) {
        this.f31667a = i10;
        this.f31668b = eoVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f31667a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.k11.c()) {
                    eo eoVar = this.f31668b;
                    org.telegram.ui.Components.k11 k11Var = eoVar.f32516v0;
                    if (k11Var == null || k11Var.e) {
                        if (eoVar.getParentActivity() != null && org.telegram.ui.Components.k11.c() && eoVar.f32542x0 != null && eoVar.X0 != null) {
                            org.telegram.ui.Components.k11 k11Var2 = eoVar.f32516v0;
                            if (k11Var2 != null) {
                                AndroidUtilities.removeFromParent(k11Var2);
                            }
                            org.telegram.ui.Components.k11 k11Var3 = new org.telegram.ui.Components.k11(eoVar.getParentActivity(), new n(23, eoVar, r2));
                            eoVar.f32516v0 = k11Var3;
                            org.telegram.ui.Components.k11[] k11VarArr = {k11Var3};
                            vm vmVar = eoVar.X0;
                            vmVar.addView(k11Var3, vmVar.indexOfChild(eoVar.f32542x0) + 1, w7.a6.c(-1.0f, -1));
                        }
                    }
                    return eoVar.f32516v0;
                }
                return null;
            default:
                this.f31668b.getClass();
                if (org.telegram.ui.Components.k11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
