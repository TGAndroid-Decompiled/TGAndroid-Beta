package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class so extends org.telegram.ui.ActionBar.n1 {
    public final uo f30860o;

    public so(uo uoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f30860o = uoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.zn znVar = this.f30860o.G;
        if (znVar != null) {
            znVar.getClass();
            znVar.j8(false, true, 0.0f);
        }
    }
}
