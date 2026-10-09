package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class of extends org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f29475o;

    public of(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f29475o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f29475o.J0.invalidate();
    }
}
