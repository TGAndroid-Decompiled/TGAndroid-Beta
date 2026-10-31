package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ft extends org.telegram.ui.ActionBar.k1 {
    public final gt f37342o;

    public ft(gt gtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37342o = gtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        lt ltVar = this.f37342o.f37643a;
        ltVar.f39395k = null;
        ltVar.K = false;
        if (ltVar.R) {
            ltVar.m();
        }
    }
}
