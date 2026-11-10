package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hn extends org.telegram.ui.ActionBar.g1 {
    public final jn f34419o;

    public hn(jn jnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34419o = jnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.cn cnVar = this.f34419o.G;
        if (cnVar != null) {
            cnVar.getClass();
            cnVar.w8(false, true, 0.0f);
        }
    }
}
