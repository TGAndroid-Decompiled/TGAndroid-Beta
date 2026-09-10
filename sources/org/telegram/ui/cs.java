package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cs {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f31762a;
    public org.telegram.ui.ActionBar.c1 f31763b;
    public org.telegram.ui.ActionBar.g1[] f31764c;

    public final void a(float f7, boolean z10) {
        org.telegram.ui.ActionBar.g1[] g1VarArr = this.f31764c;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z10 && ((i10 == 0 && Math.abs(f7 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f7 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f7 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f7 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f7 - 2.0f) < 0.1f)))))) {
                g1VarArr[i10].c(-9718023, -9718023);
            } else {
                g1VarArr[i10].c(-328966, -328966);
            }
        }
        this.f31763b.d(f7, true);
    }
}
