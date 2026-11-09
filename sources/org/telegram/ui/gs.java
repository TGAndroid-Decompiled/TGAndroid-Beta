package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gs extends org.telegram.ui.ActionBar.g1 {
    public final is f46061o;

    public gs(is isVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46061o = isVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ms msVar = this.f46061o.f46750a;
        msVar.f47969k = null;
        msVar.K = false;
        if (msVar.R) {
            msVar.m();
        }
    }
}
