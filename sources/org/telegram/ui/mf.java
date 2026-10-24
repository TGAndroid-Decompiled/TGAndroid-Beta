package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf implements View.OnClickListener {
    public final int f39579a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39580b;

    public mf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39579a = i10;
        this.f39580b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39579a) {
            case 0:
                this.f39580b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39580b.getSwipeBack().b(true);
                return;
            default:
                this.f39580b.getSwipeBack().b(true);
                return;
        }
    }
}
