package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ah implements Utilities.Callback0Return {
    public final int f35973a;
    public final zn f35974b;

    public ah(zn znVar, int i10) {
        this.f35973a = i10;
        this.f35974b = znVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f35973a) {
            case 0:
                this.f35974b.getClass();
                if (org.telegram.ui.Components.d21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.d21.c()) {
                    zn znVar = this.f35974b;
                    org.telegram.ui.Components.d21 d21Var = znVar.f45007v0;
                    if (d21Var == null || d21Var.f25531e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.d21.c() && znVar.f45034x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.d21 d21Var2 = znVar.f45007v0;
                            if (d21Var2 != null) {
                                AndroidUtilities.removeFromParent(d21Var2);
                            }
                            org.telegram.ui.Components.d21 d21Var3 = new org.telegram.ui.Components.d21(znVar.getParentActivity(), new org.telegram.ui.ActionBar.p(27, znVar, r2));
                            znVar.f45007v0 = d21Var3;
                            org.telegram.ui.Components.d21[] d21VarArr = {d21Var3};
                            sm smVar = znVar.X0;
                            smVar.addView(d21Var3, smVar.indexOfChild(znVar.f45034x0) + 1, w7.x5.d(-1.0f, -1));
                        }
                    }
                    return znVar.f45007v0;
                }
                return null;
        }
    }
}
