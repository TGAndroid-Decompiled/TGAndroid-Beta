package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lt extends org.telegram.ui.ActionBar.o1 {
    public final mt f35445o;

    public lt(mt mtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35445o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f35445o.f35750a;
        qtVar.f36895k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
