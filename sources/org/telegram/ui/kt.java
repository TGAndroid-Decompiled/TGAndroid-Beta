package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kt extends org.telegram.ui.ActionBar.o1 {
    public final mt f35151o;

    public kt(mt mtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35151o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f35151o.f35750a;
        qtVar.f36895k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
