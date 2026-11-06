package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf implements View.OnClickListener {
    public final int f44791a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44792b;

    public cf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f44791a = i7;
        this.f44792b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44791a) {
            case 0:
                this.f44792b.getSwipeBack().b(true);
                return;
            case 1:
                this.f44792b.getSwipeBack().b(true);
                return;
            default:
                this.f44792b.getSwipeBack().b(true);
                return;
        }
    }
}
