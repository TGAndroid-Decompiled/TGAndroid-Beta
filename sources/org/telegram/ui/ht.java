package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ht extends org.telegram.ui.ActionBar.m1 {
    public final jt f34377o;

    public ht(jt jtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34377o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f34377o.f34957a;
        ntVar.f36122k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
