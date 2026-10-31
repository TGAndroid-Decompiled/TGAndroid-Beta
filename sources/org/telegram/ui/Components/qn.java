package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qn extends org.telegram.ui.ActionBar.k1 {
    public final sn f29687o;

    public qn(sn snVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f29687o = snVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.un unVar = this.f29687o.G;
        if (unVar != null) {
            unVar.getClass();
            unVar.o8(false, true, 0.0f);
        }
    }
}
