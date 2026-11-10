package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class na0 extends org.telegram.ui.ActionBar.g1 {
    public final sa0 f48167o;

    public na0(sa0 sa0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48167o = sa0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f48167o.J0 = null;
    }
}
