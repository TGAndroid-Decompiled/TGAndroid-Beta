package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ct extends org.telegram.ui.ActionBar.m1 {
    public final dt f36396o;

    public ct(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36396o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f36396o.f36721a;
        htVar.f37995k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
