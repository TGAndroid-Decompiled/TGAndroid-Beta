package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mt extends org.telegram.ui.ActionBar.n1 {
    public final nt f38758o;

    public mt(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38758o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f38758o.f39042a;
        rtVar.f40276k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
