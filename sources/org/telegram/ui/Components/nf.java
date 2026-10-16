package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nf extends org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f27347o;

    public nf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f27347o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f27347o.J0.invalidate();
    }
}
