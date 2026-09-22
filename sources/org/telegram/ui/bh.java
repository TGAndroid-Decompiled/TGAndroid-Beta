package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback0Return {
    public final int f32478a;
    public final zn f32479b;

    public bh(zn znVar, int i10) {
        this.f32478a = i10;
        this.f32479b = znVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f32478a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.n11.c()) {
                    zn znVar = this.f32479b;
                    org.telegram.ui.Components.n11 n11Var = znVar.f40525v0;
                    if (n11Var == null || n11Var.e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.n11.c() && znVar.f40551x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.n11 n11Var2 = znVar.f40525v0;
                            if (n11Var2 != null) {
                                AndroidUtilities.removeFromParent(n11Var2);
                            }
                            org.telegram.ui.Components.n11 n11Var3 = new org.telegram.ui.Components.n11(znVar.getParentActivity(), new org.telegram.ui.ActionBar.c6(26, znVar, r2));
                            znVar.f40525v0 = n11Var3;
                            org.telegram.ui.Components.n11[] n11VarArr = {n11Var3};
                            rm rmVar = znVar.X0;
                            rmVar.addView(n11Var3, rmVar.indexOfChild(znVar.f40551x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return znVar.f40525v0;
                }
                return null;
            default:
                this.f32479b.getClass();
                if (org.telegram.ui.Components.n11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
