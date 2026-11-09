package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ma0 extends org.telegram.ui.ActionBar.g1 {
    public final ra0 f47803o;

    public ma0(ra0 ra0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f47803o = ra0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f47803o.J0 = null;
    }
}
