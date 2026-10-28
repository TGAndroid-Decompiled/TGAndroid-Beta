package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ct extends org.telegram.ui.ActionBar.o1 {
    public final dt f38454o;

    public ct(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38454o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f38454o.f38675a;
        htVar.f39973k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
