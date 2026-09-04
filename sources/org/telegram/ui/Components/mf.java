package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf extends org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f28440o;

    public mf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28440o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f28440o.J0.invalidate();
    }
}
