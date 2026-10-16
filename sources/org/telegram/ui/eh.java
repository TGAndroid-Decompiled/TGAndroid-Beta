package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class eh implements Utilities.Callback0Return {
    public final int f35300a;
    public final fo f35301b;

    public eh(fo foVar, int i10) {
        this.f35300a = i10;
        this.f35301b = foVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f35300a) {
            case 0:
                this.f35301b.getClass();
                if (org.telegram.ui.Components.z11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.z11.c()) {
                    fo foVar = this.f35301b;
                    org.telegram.ui.Components.z11 z11Var = foVar.f35834v0;
                    if (z11Var == null || z11Var.e) {
                        if (foVar.getParentActivity() != null && org.telegram.ui.Components.z11.c() && foVar.f35861x0 != null && foVar.X0 != null) {
                            org.telegram.ui.Components.z11 z11Var2 = foVar.f35834v0;
                            if (z11Var2 != null) {
                                AndroidUtilities.removeFromParent(z11Var2);
                            }
                            org.telegram.ui.Components.z11 z11Var3 = new org.telegram.ui.Components.z11(foVar.getParentActivity(), new jd(3, foVar, r2));
                            foVar.f35834v0 = z11Var3;
                            org.telegram.ui.Components.z11[] z11VarArr = {z11Var3};
                            xm xmVar = foVar.X0;
                            xmVar.addView(z11Var3, xmVar.indexOfChild(foVar.f35861x0) + 1, w7.z5.d(-1.0f, -1));
                        }
                    }
                    return foVar.f35834v0;
                }
                return null;
        }
    }
}
