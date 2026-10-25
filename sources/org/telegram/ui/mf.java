package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf implements View.OnClickListener {
    public final int f41543a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f41544b;

    public mf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f41543a = i10;
        this.f41544b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41543a) {
            case 0:
                this.f41544b.getSwipeBack().b(true);
                return;
            case 1:
                this.f41544b.getSwipeBack().b(true);
                return;
            default:
                this.f41544b.getSwipeBack().b(true);
                return;
        }
    }
}
