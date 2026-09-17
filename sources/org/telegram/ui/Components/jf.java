package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jf extends org.telegram.ui.ActionBar.o1 {
    public final ChatActivityEnterView f25231o;

    public jf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f25231o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f25231o.J0.invalidate();
    }
}
