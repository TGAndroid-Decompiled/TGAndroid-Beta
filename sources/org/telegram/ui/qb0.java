package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qb0 extends org.telegram.ui.ActionBar.k1 {
    public final xb0 f40740o;

    public qb0(xb0 xb0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40740o = xb0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f40740o.Q0 = null;
    }
}
