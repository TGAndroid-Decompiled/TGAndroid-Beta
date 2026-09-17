package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf extends org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f28468o;

    public mf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28468o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f28468o.J0.invalidate();
    }
}
