package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class of implements View.OnClickListener {
    public final int f39774a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39775b;

    public of(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39774a = i10;
        this.f39775b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39774a) {
            case 0:
                this.f39775b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39775b.getSwipeBack().b(true);
                return;
            default:
                this.f39775b.getSwipeBack().b(true);
                return;
        }
    }
}
