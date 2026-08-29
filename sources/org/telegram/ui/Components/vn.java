package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vn extends org.telegram.ui.ActionBar.o1 {
    public final xn f33593o;

    public vn(xn xnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33593o = xnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.tn tnVar = this.f33593o.C;
        if (tnVar != null) {
            tnVar.getClass();
            tnVar.g8(false, true, 0.0f);
        }
    }
}
