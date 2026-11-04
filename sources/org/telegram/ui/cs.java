package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cs extends org.telegram.ui.ActionBar.f1 {
    public final es f44427o;

    public cs(es esVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f44427o = esVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        is isVar = this.f44427o.f45025a;
        isVar.f46395k = null;
        isVar.K = false;
        if (isVar.R) {
            isVar.m();
        }
    }
}
