package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bf extends org.telegram.ui.ActionBar.p1 {
    public final ChatActivityEnterView f23664o;

    public bf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f23664o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f23664o.G0.invalidate();
    }
}
