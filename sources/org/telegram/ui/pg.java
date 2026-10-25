package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class pg implements Utilities.Callback0Return {
    public final int f42493a;
    public final org.telegram.ui.ActionBar.r2 f42494b;

    public pg(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f42493a = i10;
        this.f42494b = r2Var;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f42493a) {
            case 0:
                un unVar = (un) this.f42494b;
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.g21.c()) {
                    org.telegram.ui.Components.g21 g21Var = unVar.f44441v0;
                    if (g21Var == null || g21Var.e) {
                        if (unVar.getParentActivity() != null && org.telegram.ui.Components.g21.c() && unVar.f44468x0 != null && unVar.f44292j1 != null) {
                            org.telegram.ui.Components.g21 g21Var2 = unVar.f44441v0;
                            if (g21Var2 != null) {
                                AndroidUtilities.removeFromParent(g21Var2);
                            }
                            org.telegram.ui.Components.g21 g21Var3 = new org.telegram.ui.Components.g21(unVar.getParentActivity(), new ed(3, unVar, r2));
                            unVar.f44441v0 = g21Var3;
                            org.telegram.ui.Components.g21[] g21VarArr = {g21Var3};
                            mm mmVar = unVar.f44292j1;
                            mmVar.addView(g21Var3, mmVar.indexOfChild(unVar.f44468x0) + 1, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                        }
                    }
                    return unVar.f44441v0;
                }
                return null;
            case 1:
                ((un) this.f42494b).getClass();
                if (org.telegram.ui.Components.g21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((ProfileActivity) this.f42494b).getSimpleMenuOverlay();
        }
    }
}
