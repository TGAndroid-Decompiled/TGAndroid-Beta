package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class at extends org.telegram.ui.ActionBar.o1 {
    public final bt f37897o;

    public at(bt btVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37897o = btVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ft ftVar = this.f37897o.f38158a;
        ftVar.f39458k = null;
        ftVar.K = false;
        if (ftVar.R) {
            ftVar.l();
        }
    }
}
