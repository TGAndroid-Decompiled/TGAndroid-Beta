package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ct extends org.telegram.ui.ActionBar.m1 {
    public final dt f36423o;

    public ct(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36423o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f36423o.f36729a;
        htVar.f37944k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
