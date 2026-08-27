package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class pn extends org.telegram.ui.ActionBar.n1 {

    public final rn f31635o;

    public pn(rn rnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f31635o = rnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.rn rnVar = this.f31635o.C;
        if (rnVar != null) {
            rnVar.getClass();
            rnVar.g8(false, true, 0.0f);
        }
    }
}
