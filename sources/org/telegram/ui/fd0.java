package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fd0 extends org.telegram.ui.ActionBar.m1 {
    public final nd0 f35802o;

    public fd0(nd0 nd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35802o = nd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f35802o.I0 = null;
    }
}
