package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mt extends org.telegram.ui.ActionBar.n1 {
    public final ot f38785o;

    public mt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38785o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f38785o.f39336a;
        stVar.f40564k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
