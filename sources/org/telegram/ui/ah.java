package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ah implements Utilities.Callback0Return {
    public final int f36089a;
    public final zn f36090b;

    public ah(zn znVar, int i10) {
        this.f36089a = i10;
        this.f36090b = znVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f36089a) {
            case 0:
                this.f36090b.getClass();
                if (org.telegram.ui.Components.e21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.e21.c()) {
                    zn znVar = this.f36090b;
                    org.telegram.ui.Components.e21 e21Var = znVar.f44962v0;
                    if (e21Var == null || e21Var.f25809e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.e21.c() && znVar.f44989x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.e21 e21Var2 = znVar.f44962v0;
                            if (e21Var2 != null) {
                                AndroidUtilities.removeFromParent(e21Var2);
                            }
                            org.telegram.ui.Components.e21 e21Var3 = new org.telegram.ui.Components.e21(znVar.getParentActivity(), new org.telegram.ui.ActionBar.a6(26, znVar, r2));
                            znVar.f44962v0 = e21Var3;
                            org.telegram.ui.Components.e21[] e21VarArr = {e21Var3};
                            sm smVar = znVar.X0;
                            smVar.addView(e21Var3, smVar.indexOfChild(znVar.f44989x0) + 1, w7.x5.d(-1.0f, -1));
                        }
                    }
                    return znVar.f44962v0;
                }
                return null;
        }
    }
}
