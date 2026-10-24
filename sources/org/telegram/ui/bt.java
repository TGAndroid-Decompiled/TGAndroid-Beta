package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bt extends org.telegram.ui.ActionBar.m1 {
    public final dt f36135o;

    public bt(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36135o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f36135o.f36721a;
        htVar.f37995k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
