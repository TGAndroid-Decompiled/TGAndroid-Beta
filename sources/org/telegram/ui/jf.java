package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jf implements View.OnClickListener {
    public final int f39466a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39467b;

    public jf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i9) {
        this.f39466a = i9;
        this.f39467b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39466a) {
            case 0:
                this.f39467b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39467b.getSwipeBack().b(true);
                return;
            default:
                this.f39467b.getSwipeBack().b(true);
                return;
        }
    }
}
