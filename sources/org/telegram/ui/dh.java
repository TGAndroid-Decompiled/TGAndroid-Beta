package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class dh implements Utilities.Callback0Return {
    public final int f36827a;
    public final eo f36828b;

    public dh(eo eoVar, int i10) {
        this.f36827a = i10;
        this.f36828b = eoVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f36827a) {
            case 0:
                this.f36828b.getClass();
                if (org.telegram.ui.Components.i21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.i21.c()) {
                    eo eoVar = this.f36828b;
                    org.telegram.ui.Components.i21 i21Var = eoVar.f37456v0;
                    if (i21Var == null || i21Var.f27009e) {
                        if (eoVar.getParentActivity() != null && org.telegram.ui.Components.i21.c() && eoVar.f37483x0 != null && eoVar.X0 != null) {
                            org.telegram.ui.Components.i21 i21Var2 = eoVar.f37456v0;
                            if (i21Var2 != null) {
                                AndroidUtilities.removeFromParent(i21Var2);
                            }
                            org.telegram.ui.Components.i21 i21Var3 = new org.telegram.ui.Components.i21(eoVar.getParentActivity(), new org.telegram.ui.ActionBar.f6(24, eoVar, r2));
                            eoVar.f37456v0 = i21Var3;
                            org.telegram.ui.Components.i21[] i21VarArr = {i21Var3};
                            wm wmVar = eoVar.X0;
                            wmVar.addView(i21Var3, wmVar.indexOfChild(eoVar.f37483x0) + 1, w7.w5.d(-1.0f, -1));
                        }
                    }
                    return eoVar.f37456v0;
                }
                return null;
        }
    }
}
