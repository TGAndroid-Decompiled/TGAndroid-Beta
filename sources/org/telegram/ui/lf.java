package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lf implements View.OnClickListener {
    public final int f41105a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f41106b;

    public lf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f41105a = i10;
        this.f41106b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41105a) {
            case 0:
                this.f41106b.getSwipeBack().b(true);
                return;
            case 1:
                this.f41106b.getSwipeBack().b(true);
                return;
            default:
                this.f41106b.getSwipeBack().b(true);
                return;
        }
    }
}
