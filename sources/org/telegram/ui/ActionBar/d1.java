package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
public final class d1 implements ViewTreeObserver.OnScrollChangedListener {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f28833a;

    public d1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f28833a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onScrollChanged() {
        this.f28833a.invalidate();
    }
}
