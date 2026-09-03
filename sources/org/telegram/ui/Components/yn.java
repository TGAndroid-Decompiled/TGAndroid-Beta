package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yn extends org.telegram.ui.ActionBar.p1 {
    public final ao f33573o;

    public yn(ao aoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33573o = aoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.xn xnVar = this.f33573o.D;
        if (xnVar != null) {
            xnVar.getClass();
            xnVar.g8(false, true, 0.0f);
        }
    }
}
