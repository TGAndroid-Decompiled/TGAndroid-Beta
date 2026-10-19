package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf implements View.OnClickListener {
    public final int f39222a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39223b;

    public mf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f39222a = i10;
        this.f39223b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39222a) {
            case 0:
                this.f39223b.getSwipeBack().b(true);
                return;
            case 1:
                this.f39223b.getSwipeBack().b(true);
                return;
            default:
                this.f39223b.getSwipeBack().b(true);
                return;
        }
    }
}
