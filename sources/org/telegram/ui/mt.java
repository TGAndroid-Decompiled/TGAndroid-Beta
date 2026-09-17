package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mt extends org.telegram.ui.ActionBar.n1 {
    public final ot f38759o;

    public mt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38759o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f38759o.f39310a;
        stVar.f40538k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
