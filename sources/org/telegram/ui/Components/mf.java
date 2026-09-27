package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf extends org.telegram.ui.ActionBar.o1 {
    public final ChatActivityEnterView f26437o;

    public mf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f26437o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f26437o.J0.invalidate();
    }
}
