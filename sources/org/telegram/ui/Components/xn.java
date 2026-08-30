package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xn extends org.telegram.ui.ActionBar.p1 {
    public final zn f30703o;

    public xn(zn znVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f30703o = znVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.xn xnVar = this.f30703o.D;
        if (xnVar != null) {
            xnVar.getClass();
            xnVar.g8(false, true, 0.0f);
        }
    }
}
