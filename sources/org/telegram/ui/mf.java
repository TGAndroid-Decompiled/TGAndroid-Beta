package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf implements View.OnClickListener {
    public final int f41546a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f41547b;

    public mf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f41546a = i10;
        this.f41547b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41546a) {
            case 0:
                this.f41547b.getSwipeBack().b(true);
                return;
            case 1:
                this.f41547b.getSwipeBack().b(true);
                return;
            default:
                this.f41547b.getSwipeBack().b(true);
                return;
        }
    }
}
