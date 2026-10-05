package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lt extends org.telegram.ui.ActionBar.n1 {
    public final nt f38392o;

    public lt(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38392o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f38392o.f39031a;
        rtVar.f40251k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
