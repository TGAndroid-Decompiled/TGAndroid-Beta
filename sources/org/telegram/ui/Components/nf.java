package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nf extends org.telegram.ui.ActionBar.p1 {
    public final ChatActivityEnterView f25504o;

    public nf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f25504o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f25504o.J0.invalidate();
    }
}
