package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hn extends org.telegram.ui.ActionBar.f1 {
    public final jn f34457o;

    public hn(jn jnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34457o = jnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.wm wmVar = this.f34457o.H;
        if (wmVar != null) {
            wmVar.getClass();
            wmVar.v8(false, true, 0.0f);
        }
    }
}
