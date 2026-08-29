package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bt extends org.telegram.ui.ActionBar.o1 {
    public final dt f36905o;

    public bt(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36905o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f36905o.f37629a;
        htVar.f39031k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.n();
        }
    }
}
