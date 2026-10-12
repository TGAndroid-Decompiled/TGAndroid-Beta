package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ad0 extends org.telegram.ui.ActionBar.m1 {
    public final id0 f35764o;

    public ad0(id0 id0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35764o = id0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f35764o.I0 = null;
    }
}
