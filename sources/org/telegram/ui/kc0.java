package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kc0 extends org.telegram.ui.ActionBar.m1 {
    public final sc0 f38929o;

    public kc0(sc0 sc0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38929o = sc0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f38929o.I0 = null;
    }
}
