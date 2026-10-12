package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uo extends org.telegram.ui.ActionBar.m1 {
    public final wo f31228o;

    public uo(wo woVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f31228o = woVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.eo eoVar = this.f31228o.G;
        if (eoVar != null) {
            eoVar.getClass();
            eoVar.j8(false, true, 0.0f);
        }
    }
}
