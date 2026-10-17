package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bt extends org.telegram.ui.ActionBar.m1 {
    public final ct f35738o;

    public bt(ct ctVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35738o = ctVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        gt gtVar = this.f35738o.f35984a;
        gtVar.f37321k = null;
        gtVar.K = false;
        if (gtVar.R) {
            gtVar.n();
        }
    }
}
