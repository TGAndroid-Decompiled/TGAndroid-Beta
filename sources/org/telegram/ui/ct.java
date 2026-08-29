package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ct extends org.telegram.ui.ActionBar.o1 {
    public final dt f37209o;

    public ct(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37209o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f37209o.f37629a;
        htVar.f39031k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.n();
        }
    }
}
