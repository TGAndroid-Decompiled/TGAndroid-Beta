package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lf extends org.telegram.ui.ActionBar.o1 {
    public final ChatActivityEnterView f30242o;

    public lf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f30242o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f30242o.J0.invalidate();
    }
}
