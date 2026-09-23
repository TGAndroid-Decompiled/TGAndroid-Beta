package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kt extends org.telegram.ui.ActionBar.n1 {
    public final lt f34796o;

    public kt(lt ltVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34796o = ltVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pt ptVar = this.f34796o.f35086a;
        ptVar.f36192k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
    }
}
