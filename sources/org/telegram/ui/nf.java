package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nf implements View.OnClickListener {
    public final int f39335a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39336b;

    public nf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39335a = i10;
        this.f39336b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39335a) {
            case 0:
                this.f39336b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39336b.getSwipeBack().b(true);
                return;
            default:
                this.f39336b.getSwipeBack().b(true);
                return;
        }
    }
}
