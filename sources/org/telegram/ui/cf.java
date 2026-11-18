package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf implements View.OnClickListener {
    public final int f46502a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f46503b;

    public cf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f46502a = i7;
        this.f46503b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46502a) {
            case 0:
                this.f46503b.getSwipeBack().b(true);
                return;
            case 1:
                this.f46503b.getSwipeBack().b(true);
                return;
            default:
                this.f46503b.getSwipeBack().b(true);
                return;
        }
    }
}
