package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qn extends org.telegram.ui.ActionBar.g1 {
    public final sn f38726o;

    public qn(sn snVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38726o = snVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.an anVar = this.f38726o.H;
        if (anVar != null) {
            anVar.getClass();
            anVar.x8(false, true, 0.0f);
        }
    }
}
