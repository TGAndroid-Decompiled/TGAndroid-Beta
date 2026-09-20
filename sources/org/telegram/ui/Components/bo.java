package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bo extends org.telegram.ui.ActionBar.n1 {
    public final eo f23027o;

    public bo(eo eoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f23027o = eoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.zn znVar = this.f23027o.G;
        if (znVar != null) {
            znVar.getClass();
            znVar.g8(false, true, 0.0f);
        }
    }
}
