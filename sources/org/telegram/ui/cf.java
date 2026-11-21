package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf implements View.OnClickListener {
    public final int f46546a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f46547b;

    public cf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f46546a = i7;
        this.f46547b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46546a) {
            case 0:
                this.f46547b.getSwipeBack().b(true);
                return;
            case 1:
                this.f46547b.getSwipeBack().b(true);
                return;
            default:
                this.f46547b.getSwipeBack().b(true);
                return;
        }
    }
}
