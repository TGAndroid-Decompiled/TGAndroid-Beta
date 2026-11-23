package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ao extends org.telegram.ui.ActionBar.g1 {
    public final co f33539o;

    public ao(co coVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33539o = coVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.bn bnVar = this.f33539o.H;
        if (bnVar != null) {
            bnVar.getClass();
            bnVar.x8(false, true, 0.0f);
        }
    }
}
