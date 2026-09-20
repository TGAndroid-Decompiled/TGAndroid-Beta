package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback0Return {
    public final int f32460a;
    public final zn f32461b;

    public bh(zn znVar, int i10) {
        this.f32460a = i10;
        this.f32461b = znVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f32460a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.l11.c()) {
                    zn znVar = this.f32461b;
                    org.telegram.ui.Components.l11 l11Var = znVar.f40504v0;
                    if (l11Var == null || l11Var.e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.l11.c() && znVar.f40530x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.l11 l11Var2 = znVar.f40504v0;
                            if (l11Var2 != null) {
                                AndroidUtilities.removeFromParent(l11Var2);
                            }
                            org.telegram.ui.Components.l11 l11Var3 = new org.telegram.ui.Components.l11(znVar.getParentActivity(), new org.telegram.ui.ActionBar.c6(26, znVar, r2));
                            znVar.f40504v0 = l11Var3;
                            org.telegram.ui.Components.l11[] l11VarArr = {l11Var3};
                            rm rmVar = znVar.X0;
                            rmVar.addView(l11Var3, rmVar.indexOfChild(znVar.f40530x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return znVar.f40504v0;
                }
                return null;
            default:
                this.f32461b.getClass();
                if (org.telegram.ui.Components.l11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
