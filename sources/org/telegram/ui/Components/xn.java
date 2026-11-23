package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xn extends org.telegram.ui.ActionBar.g1 {
    public final zn f42125o;

    public xn(zn znVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f42125o = znVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.bn bnVar = this.f42125o.H;
        if (bnVar != null) {
            bnVar.getClass();
            bnVar.x8(false, true, 0.0f);
        }
    }
}
