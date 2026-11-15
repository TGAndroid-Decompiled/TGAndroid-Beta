package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ka0 extends org.telegram.ui.ActionBar.g1 {
    public final pa0 f48612o;

    public ka0(pa0 pa0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48612o = pa0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f48612o.K0 = null;
    }
}
