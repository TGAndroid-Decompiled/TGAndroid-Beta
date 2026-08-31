package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zn extends org.telegram.ui.ActionBar.p1 {
    public final bo f33929o;

    public zn(bo boVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33929o = boVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.xn xnVar = this.f33929o.D;
        if (xnVar != null) {
            xnVar.getClass();
            xnVar.g8(false, true, 0.0f);
        }
    }
}
