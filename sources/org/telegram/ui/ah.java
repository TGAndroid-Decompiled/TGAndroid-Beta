package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ah implements Utilities.Callback0Return {
    public final int f35929a;
    public final zn f35930b;

    public ah(zn znVar, int i10) {
        this.f35929a = i10;
        this.f35930b = znVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f35929a) {
            case 0:
                this.f35930b.getClass();
                if (org.telegram.ui.Components.c21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.c21.c()) {
                    zn znVar = this.f35930b;
                    org.telegram.ui.Components.c21 c21Var = znVar.f44963v0;
                    if (c21Var == null || c21Var.f25216e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.c21.c() && znVar.f44990x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.c21 c21Var2 = znVar.f44963v0;
                            if (c21Var2 != null) {
                                AndroidUtilities.removeFromParent(c21Var2);
                            }
                            org.telegram.ui.Components.c21 c21Var3 = new org.telegram.ui.Components.c21(znVar.getParentActivity(), new org.telegram.ui.ActionBar.p(27, znVar, r2));
                            znVar.f44963v0 = c21Var3;
                            org.telegram.ui.Components.c21[] c21VarArr = {c21Var3};
                            sm smVar = znVar.X0;
                            smVar.addView(c21Var3, smVar.indexOfChild(znVar.f44990x0) + 1, w7.x5.d(-1.0f, -1));
                        }
                    }
                    return znVar.f44963v0;
                }
                return null;
        }
    }
}
