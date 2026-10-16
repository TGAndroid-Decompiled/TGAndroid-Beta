package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class dd0 extends org.telegram.ui.ActionBar.m1 {
    public final ld0 f34962o;

    public dd0(ld0 ld0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34962o = ld0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f34962o.I0 = null;
    }
}
