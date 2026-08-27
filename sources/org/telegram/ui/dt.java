package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class dt extends org.telegram.ui.ActionBar.n1 {

    public final ft f37544o;

    public dt(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37544o = ftVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        kt ktVar = this.f37544o.f38203a;
        ktVar.f39867k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.n();
        }
    }
}
