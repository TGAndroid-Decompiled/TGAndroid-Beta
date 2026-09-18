package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bo extends org.telegram.ui.ActionBar.o1 {
    public final eo f22781o;

    public bo(eo eoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f22781o = eoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.bo boVar = this.f22781o.G;
        if (boVar != null) {
            boVar.getClass();
            boVar.g8(false, true, 0.0f);
        }
    }
}
