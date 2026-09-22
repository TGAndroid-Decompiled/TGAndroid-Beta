package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nt extends org.telegram.ui.ActionBar.n1 {
    public final ot f36044o;

    public nt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36044o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f36044o.f36339a;
        stVar.f37472k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
