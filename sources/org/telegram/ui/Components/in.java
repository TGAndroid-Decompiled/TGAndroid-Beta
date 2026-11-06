package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class in extends org.telegram.ui.ActionBar.g1 {
    public final kn f34737o;

    public in(kn knVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34737o = knVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.an anVar = this.f34737o.G;
        if (anVar != null) {
            anVar.getClass();
            anVar.v8(false, true, 0.0f);
        }
    }
}
