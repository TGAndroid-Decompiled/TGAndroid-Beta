package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nf implements View.OnClickListener {
    public final int f39420a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39421b;

    public nf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39420a = i10;
        this.f39421b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39420a) {
            case 0:
                this.f39421b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39421b.getSwipeBack().b(true);
                return;
            default:
                this.f39421b.getSwipeBack().b(true);
                return;
        }
    }
}
