package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fc0 extends org.telegram.ui.ActionBar.m1 {
    public final nc0 f36972o;

    public fc0(nc0 nc0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36972o = nc0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f36972o.I0 = null;
    }
}
