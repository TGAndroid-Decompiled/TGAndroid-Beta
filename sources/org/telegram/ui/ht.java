package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ht extends org.telegram.ui.ActionBar.m1 {
    public final jt f34285o;

    public ht(jt jtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34285o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f34285o.f34870a;
        ntVar.f35978k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
