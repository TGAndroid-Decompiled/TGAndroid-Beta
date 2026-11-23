package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf implements View.OnClickListener {
    public final int f46549a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f46550b;

    public cf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f46549a = i7;
        this.f46550b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46549a) {
            case 0:
                this.f46550b.getSwipeBack().b(true);
                return;
            case 1:
                this.f46550b.getSwipeBack().b(true);
                return;
            default:
                this.f46550b.getSwipeBack().b(true);
                return;
        }
    }
}
