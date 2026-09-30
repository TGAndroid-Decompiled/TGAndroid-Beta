package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gt extends org.telegram.ui.ActionBar.m1 {
    public final jt f34140o;

    public gt(jt jtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34140o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f34140o.f34957a;
        ntVar.f36122k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
