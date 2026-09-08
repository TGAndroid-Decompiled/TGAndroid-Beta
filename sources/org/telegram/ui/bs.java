package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bs {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f34942a;
    public org.telegram.ui.ActionBar.b1 f34943b;
    public org.telegram.ui.ActionBar.f1[] f34944c;

    public final void a(float f7, boolean z10) {
        org.telegram.ui.ActionBar.f1[] f1VarArr = this.f34944c;
        for (int i10 = 0; i10 < f1VarArr.length; i10++) {
            if (z10 && ((i10 == 0 && Math.abs(f7 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f7 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f7 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f7 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f7 - 2.0f) < 0.1f)))))) {
                f1VarArr[i10].c(-9718023, -9718023);
            } else {
                f1VarArr[i10].c(-328966, -328966);
            }
        }
        this.f34943b.d(f7, true);
    }
}
