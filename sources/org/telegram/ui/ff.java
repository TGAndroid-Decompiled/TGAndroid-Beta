package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ff implements View.OnClickListener {
    public final int f38140a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38141b;

    public ff(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f38140a = i10;
        this.f38141b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38140a) {
            case 0:
                this.f38141b.getSwipeBack().b(true);
                return;
            case 1:
                this.f38141b.getSwipeBack().b(true);
                return;
            default:
                this.f38141b.getSwipeBack().b(true);
                return;
        }
    }
}
