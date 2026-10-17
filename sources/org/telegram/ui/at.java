package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class at extends org.telegram.ui.ActionBar.m1 {
    public final ct f35491o;

    public at(ct ctVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35491o = ctVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        gt gtVar = this.f35491o.f35984a;
        gtVar.f37321k = null;
        gtVar.K = false;
        if (gtVar.R) {
            gtVar.n();
        }
    }
}
