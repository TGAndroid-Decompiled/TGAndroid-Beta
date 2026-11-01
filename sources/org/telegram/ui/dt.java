package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class dt extends org.telegram.ui.ActionBar.k1 {
    public final ft f36676o;

    public dt(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36676o = ftVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        kt ktVar = this.f36676o.f37231a;
        ktVar.f38985k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.m();
        }
    }
}
