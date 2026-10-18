package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class of implements View.OnClickListener {
    public final int f39782a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39783b;

    public of(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39782a = i10;
        this.f39783b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39782a) {
            case 0:
                this.f39783b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39783b.getSwipeBack().b(true);
                return;
            default:
                this.f39783b.getSwipeBack().b(true);
                return;
        }
    }
}
