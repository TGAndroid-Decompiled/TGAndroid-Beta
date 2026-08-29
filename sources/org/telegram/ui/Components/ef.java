package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ef extends org.telegram.ui.ActionBar.o1 {
    public final ChatActivityEnterView f28021o;

    public ef(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28021o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f28021o.F0.invalidate();
    }
}
