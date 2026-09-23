package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class co extends org.telegram.ui.ActionBar.n1 {
    public final fo f23079o;

    public co(fo foVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f23079o = foVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.xn xnVar = this.f23079o.G;
        if (xnVar != null) {
            xnVar.getClass();
            xnVar.g8(false, true, 0.0f);
        }
    }
}
