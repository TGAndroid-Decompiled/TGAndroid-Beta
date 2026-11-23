package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ao extends org.telegram.ui.ActionBar.g1 {
    public final co f33555o;

    public ao(co coVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33555o = coVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.bn bnVar = this.f33555o.H;
        if (bnVar != null) {
            bnVar.getClass();
            bnVar.x8(false, true, 0.0f);
        }
    }
}
