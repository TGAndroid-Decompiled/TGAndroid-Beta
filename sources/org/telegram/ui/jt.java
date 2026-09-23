package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jt extends org.telegram.ui.ActionBar.n1 {
    public final lt f34505o;

    public jt(lt ltVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34505o = ltVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pt ptVar = this.f34505o.f35086a;
        ptVar.f36192k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
    }
}
