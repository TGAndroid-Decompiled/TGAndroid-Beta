package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class lc0 extends org.telegram.ui.ActionBar.n1 {

    public final tc0 f40046o;

    public lc0(tc0 tc0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40046o = tc0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f40046o.E0 = null;
    }
}
