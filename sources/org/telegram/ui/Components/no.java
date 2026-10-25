package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class no extends org.telegram.ui.ActionBar.o1 {
    public final po f31046o;

    public no(po poVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f31046o = poVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.un unVar = this.f31046o.G;
        if (unVar != null) {
            unVar.getClass();
            unVar.n8(false, true, 0.0f);
        }
    }
}
