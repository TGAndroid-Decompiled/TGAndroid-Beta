package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hc0 extends org.telegram.ui.ActionBar.m1 {
    public final pc0 f37514o;

    public hc0(pc0 pc0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37514o = pc0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f37514o.I0 = null;
    }
}
