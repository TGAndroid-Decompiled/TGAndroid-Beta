package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pf implements View.OnClickListener {
    public final int f40659a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40660b;

    public pf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f40659a = i10;
        this.f40660b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40659a) {
            case 0:
                this.f40660b.getSwipeBack().b(true);
                return;
            case 1:
                this.f40660b.getSwipeBack().b(true);
                return;
            default:
                this.f40660b.getSwipeBack().b(true);
                return;
        }
    }
}
