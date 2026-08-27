package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class et extends org.telegram.ui.ActionBar.n1 {

    public final ft f37833o;

    public et(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37833o = ftVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        kt ktVar = this.f37833o.f38203a;
        ktVar.f39867k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.n();
        }
    }
}
