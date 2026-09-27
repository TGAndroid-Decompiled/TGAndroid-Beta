package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback0Return {
    public final int f32357a;
    public final xn f32358b;

    public bh(xn xnVar, int i10) {
        this.f32357a = i10;
        this.f32358b = xnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f32357a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.m11.c()) {
                    xn xnVar = this.f32358b;
                    org.telegram.ui.Components.m11 m11Var = xnVar.f39951v0;
                    if (m11Var == null || m11Var.e) {
                        if (xnVar.getParentActivity() != null && org.telegram.ui.Components.m11.c() && xnVar.f39977x0 != null && xnVar.X0 != null) {
                            org.telegram.ui.Components.m11 m11Var2 = xnVar.f39951v0;
                            if (m11Var2 != null) {
                                AndroidUtilities.removeFromParent(m11Var2);
                            }
                            org.telegram.ui.Components.m11 m11Var3 = new org.telegram.ui.Components.m11(xnVar.getParentActivity(), new n(23, xnVar, r2));
                            xnVar.f39951v0 = m11Var3;
                            org.telegram.ui.Components.m11[] m11VarArr = {m11Var3};
                            qm qmVar = xnVar.X0;
                            qmVar.addView(m11Var3, qmVar.indexOfChild(xnVar.f39977x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return xnVar.f39951v0;
                }
                return null;
            default:
                this.f32358b.getClass();
                if (org.telegram.ui.Components.m11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
