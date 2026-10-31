package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class et extends org.telegram.ui.ActionBar.k1 {
    public final gt f37107o;

    public et(gt gtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37107o = gtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        lt ltVar = this.f37107o.f37643a;
        ltVar.f39395k = null;
        ltVar.K = false;
        if (ltVar.R) {
            ltVar.m();
        }
    }
}
