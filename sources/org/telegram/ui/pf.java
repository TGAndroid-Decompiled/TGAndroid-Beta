package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pf implements View.OnClickListener {
    public final int f37114a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37115b;

    public pf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37114a = i10;
        this.f37115b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37114a) {
            case 0:
                this.f37115b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37115b.getSwipeBack().b(true);
                return;
            default:
                this.f37115b.getSwipeBack().b(true);
                return;
        }
    }
}
