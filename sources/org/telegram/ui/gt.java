package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gt extends org.telegram.ui.ActionBar.m1 {
    public final jt f34046o;

    public gt(jt jtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34046o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f34046o.f34866a;
        ntVar.f35983k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
