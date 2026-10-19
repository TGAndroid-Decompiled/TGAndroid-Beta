package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf implements View.OnClickListener {
    public final int f39257a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39258b;

    public mf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39257a = i10;
        this.f39258b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39257a) {
            case 0:
                this.f39258b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39258b.getSwipeBack().b(true);
                return;
            default:
                this.f39258b.getSwipeBack().b(true);
                return;
        }
    }
}
