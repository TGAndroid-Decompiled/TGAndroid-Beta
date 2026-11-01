package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oe extends org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f29096o;

    public oe(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f29096o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f29096o.J0.invalidate();
    }
}
