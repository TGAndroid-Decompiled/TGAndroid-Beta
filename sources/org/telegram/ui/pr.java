package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pr {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f41452a;
    public org.telegram.ui.ActionBar.c1 f41453b;
    public org.telegram.ui.ActionBar.g1[] f41454c;

    public final void a(float f9, boolean z10) {
        org.telegram.ui.ActionBar.g1[] g1VarArr = this.f41454c;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z10 && ((i10 == 0 && Math.abs(f9 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f9 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f9 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f9 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f9 - 2.0f) < 0.1f)))))) {
                g1VarArr[i10].c(-9718023, -9718023);
            } else {
                g1VarArr[i10].c(-328966, -328966);
            }
        }
        this.f41453b.d(f9, true);
    }
}
