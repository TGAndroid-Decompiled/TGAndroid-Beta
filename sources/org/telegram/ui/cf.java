package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf implements View.OnClickListener {
    public final int f44297a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44298b;

    public cf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f44297a = i7;
        this.f44298b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44297a) {
            case 0:
                this.f44298b.getSwipeBack().b(true);
                return;
            case 1:
                this.f44298b.getSwipeBack().b(true);
                return;
            default:
                this.f44298b.getSwipeBack().b(true);
                return;
        }
    }
}
