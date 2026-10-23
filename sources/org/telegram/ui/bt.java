package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bt extends org.telegram.ui.ActionBar.m1 {
    public final dt f36163o;

    public bt(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36163o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f36163o.f36729a;
        htVar.f37944k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
