package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nt extends org.telegram.ui.ActionBar.n1 {
    public final ot f39017o;

    public nt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f39017o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f39017o.f39309a;
        stVar.f40537k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
