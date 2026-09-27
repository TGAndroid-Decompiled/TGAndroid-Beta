package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class eo extends org.telegram.ui.ActionBar.o1 {
    public final go f24095o;

    public eo(go goVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f24095o = goVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.xn xnVar = this.f24095o.G;
        if (xnVar != null) {
            xnVar.getClass();
            xnVar.g8(false, true, 0.0f);
        }
    }
}
