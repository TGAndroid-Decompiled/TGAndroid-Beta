package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jf extends org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f25309o;

    public jf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f25309o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f25309o.J0.invalidate();
    }
}
