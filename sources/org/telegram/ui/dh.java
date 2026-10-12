package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class dh implements Utilities.Callback0Return {
    public final int f36824a;
    public final eo f36825b;

    public dh(eo eoVar, int i10) {
        this.f36824a = i10;
        this.f36825b = eoVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f36824a) {
            case 0:
                this.f36825b.getClass();
                if (org.telegram.ui.Components.i21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.i21.c()) {
                    eo eoVar = this.f36825b;
                    org.telegram.ui.Components.i21 i21Var = eoVar.f37451v0;
                    if (i21Var == null || i21Var.f27024e) {
                        if (eoVar.getParentActivity() != null && org.telegram.ui.Components.i21.c() && eoVar.f37478x0 != null && eoVar.X0 != null) {
                            org.telegram.ui.Components.i21 i21Var2 = eoVar.f37451v0;
                            if (i21Var2 != null) {
                                AndroidUtilities.removeFromParent(i21Var2);
                            }
                            org.telegram.ui.Components.i21 i21Var3 = new org.telegram.ui.Components.i21(eoVar.getParentActivity(), new org.telegram.ui.ActionBar.f6(24, eoVar, r2));
                            eoVar.f37451v0 = i21Var3;
                            org.telegram.ui.Components.i21[] i21VarArr = {i21Var3};
                            wm wmVar = eoVar.X0;
                            wmVar.addView(i21Var3, wmVar.indexOfChild(eoVar.f37478x0) + 1, w7.w5.d(-1.0f, -1));
                        }
                    }
                    return eoVar.f37451v0;
                }
                return null;
        }
    }
}
