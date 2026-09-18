package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mt extends org.telegram.ui.ActionBar.n1 {
    public final ot f35738o;

    public mt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35738o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f35738o.f36238a;
        stVar.f37481k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
