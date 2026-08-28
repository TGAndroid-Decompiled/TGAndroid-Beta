package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ct extends org.telegram.ui.ActionBar.o1 {
    public final dt f37320o;

    public ct(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37320o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f37320o.f37593a;
        htVar.f38922k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.n();
        }
    }
}
