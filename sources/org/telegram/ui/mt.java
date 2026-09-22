package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mt extends org.telegram.ui.ActionBar.n1 {
    public final ot f35834o;

    public mt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35834o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f35834o.f36393a;
        stVar.f37560k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
