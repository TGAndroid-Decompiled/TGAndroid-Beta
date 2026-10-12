package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class eh implements Utilities.Callback0Return {
    public final int f35571a;
    public final fo f35572b;

    public eh(fo foVar, int i10) {
        this.f35571a = i10;
        this.f35572b = foVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f35571a) {
            case 0:
                this.f35572b.getClass();
                if (org.telegram.ui.Components.y11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.y11.c()) {
                    fo foVar = this.f35572b;
                    org.telegram.ui.Components.y11 y11Var = foVar.f36133v0;
                    if (y11Var == null || y11Var.e) {
                        if (foVar.getParentActivity() != null && org.telegram.ui.Components.y11.c() && foVar.f36160x0 != null && foVar.X0 != null) {
                            org.telegram.ui.Components.y11 y11Var2 = foVar.f36133v0;
                            if (y11Var2 != null) {
                                AndroidUtilities.removeFromParent(y11Var2);
                            }
                            org.telegram.ui.Components.y11 y11Var3 = new org.telegram.ui.Components.y11(foVar.getParentActivity(), new fc(8, foVar, r2));
                            foVar.f36133v0 = y11Var3;
                            org.telegram.ui.Components.y11[] y11VarArr = {y11Var3};
                            xm xmVar = foVar.X0;
                            xmVar.addView(y11Var3, xmVar.indexOfChild(foVar.f36160x0) + 1, w7.a6.d(-1.0f, -1));
                        }
                    }
                    return foVar.f36133v0;
                }
                return null;
        }
    }
}
