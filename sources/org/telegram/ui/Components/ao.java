package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ao extends org.telegram.ui.ActionBar.n1 {
    public final co f24458o;

    public ao(co coVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f24458o = coVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.co coVar = this.f24458o.G;
        if (coVar != null) {
            coVar.getClass();
            coVar.g8(false, true, 0.0f);
        }
    }
}
