package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ah implements Utilities.Callback0Return {
    public final int f36123a;
    public final zn f36124b;

    public ah(zn znVar, int i10) {
        this.f36123a = i10;
        this.f36124b = znVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f36123a) {
            case 0:
                this.f36124b.getClass();
                if (org.telegram.ui.Components.d21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.d21.c()) {
                    zn znVar = this.f36124b;
                    org.telegram.ui.Components.d21 d21Var = znVar.f44996v0;
                    if (d21Var == null || d21Var.f25593e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.d21.c() && znVar.f45023x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.d21 d21Var2 = znVar.f44996v0;
                            if (d21Var2 != null) {
                                AndroidUtilities.removeFromParent(d21Var2);
                            }
                            org.telegram.ui.Components.d21 d21Var3 = new org.telegram.ui.Components.d21(znVar.getParentActivity(), new org.telegram.ui.ActionBar.a6(26, znVar, r2));
                            znVar.f44996v0 = d21Var3;
                            org.telegram.ui.Components.d21[] d21VarArr = {d21Var3};
                            sm smVar = znVar.X0;
                            smVar.addView(d21Var3, smVar.indexOfChild(znVar.f45023x0) + 1, w7.x5.d(-1.0f, -1));
                        }
                    }
                    return znVar.f44996v0;
                }
                return null;
        }
    }
}
