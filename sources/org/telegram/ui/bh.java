package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback0Return {
    public final int f34804a;
    public final co f34805b;

    public bh(co coVar, int i10) {
        this.f34804a = i10;
        this.f34805b = coVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f34804a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.w01.c()) {
                    co coVar = this.f34805b;
                    org.telegram.ui.Components.w01 w01Var = coVar.f35448v0;
                    if (w01Var == null || w01Var.f32056e) {
                        if (coVar.getParentActivity() != null && org.telegram.ui.Components.w01.c() && coVar.f35474x0 != null && coVar.X0 != null) {
                            org.telegram.ui.Components.w01 w01Var2 = coVar.f35448v0;
                            if (w01Var2 != null) {
                                AndroidUtilities.removeFromParent(w01Var2);
                            }
                            org.telegram.ui.Components.w01 w01Var3 = new org.telegram.ui.Components.w01(coVar.getParentActivity(), new org.telegram.ui.ActionBar.c6(26, coVar, r2));
                            coVar.f35448v0 = w01Var3;
                            org.telegram.ui.Components.w01[] w01VarArr = {w01Var3};
                            um umVar = coVar.X0;
                            umVar.addView(w01Var3, umVar.indexOfChild(coVar.f35474x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return coVar.f35448v0;
                }
                return null;
            default:
                this.f34805b.getClass();
                if (org.telegram.ui.Components.w01.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
