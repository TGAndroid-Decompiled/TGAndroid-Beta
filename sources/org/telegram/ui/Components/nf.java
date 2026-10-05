package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nf extends org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f29051o;

    public nf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f29051o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f29051o.J0.invalidate();
    }
}
