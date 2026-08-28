package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bt extends org.telegram.ui.ActionBar.o1 {
    public final dt f36972o;

    public bt(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36972o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f36972o.f37593a;
        htVar.f38922k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.n();
        }
    }
}
