package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class af implements View.OnClickListener {
    public final int f45038a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f45039b;

    public af(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f45038a = i7;
        this.f45039b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45038a) {
            case 0:
                this.f45039b.getSwipeBack().b(true);
                return;
            case 1:
                this.f45039b.getSwipeBack().b(true);
                return;
            default:
                this.f45039b.getSwipeBack().b(true);
                return;
        }
    }
}
