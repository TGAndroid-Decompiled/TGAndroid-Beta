package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ho extends org.telegram.ui.ActionBar.p1 {
    public final jo f23711o;

    public ho(jo joVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f23711o = joVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.eo eoVar = this.f23711o.G;
        if (eoVar != null) {
            eoVar.getClass();
            eoVar.g8(false, true, 0.0f);
        }
    }
}
