package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class jf implements View.OnClickListener {

    public final int f39361a;

    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39362b;

    public jf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39361a = i10;
        this.f39362b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39361a) {
            case 0:
                this.f39362b.getSwipeBack().b(true);
                break;
            case 1:
                this.f39362b.getSwipeBack().b(true);
                break;
            default:
                this.f39362b.getSwipeBack().b(true);
                break;
        }
    }
}
