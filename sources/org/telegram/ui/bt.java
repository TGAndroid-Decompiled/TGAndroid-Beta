package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bt extends org.telegram.ui.ActionBar.m1 {
    public final ct f35710o;

    public bt(ct ctVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35710o = ctVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        gt gtVar = this.f35710o.f35970a;
        gtVar.f37302k = null;
        gtVar.K = false;
        if (gtVar.R) {
            gtVar.n();
        }
    }
}
