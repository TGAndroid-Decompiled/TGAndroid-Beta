package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf implements View.OnClickListener {
    public final int f46788a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f46789b;

    public cf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f46788a = i7;
        this.f46789b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46788a) {
            case 0:
                this.f46789b.getSwipeBack().b(true);
                return;
            case 1:
                this.f46789b.getSwipeBack().b(true);
                return;
            default:
                this.f46789b.getSwipeBack().b(true);
                return;
        }
    }
}
