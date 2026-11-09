package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class in extends org.telegram.ui.ActionBar.g1 {
    public final kn f34819o;

    public in(kn knVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34819o = knVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.cn cnVar = this.f34819o.G;
        if (cnVar != null) {
            cnVar.getClass();
            cnVar.w8(false, true, 0.0f);
        }
    }
}
