package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class no extends org.telegram.ui.ActionBar.o1 {
    public final po f31016o;

    public no(po poVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f31016o = poVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.wn wnVar = this.f31016o.G;
        if (wnVar != null) {
            wnVar.getClass();
            wnVar.p8(false, true, 0.0f);
        }
    }
}
