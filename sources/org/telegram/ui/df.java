package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class df implements View.OnClickListener {
    public final int f44971a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44972b;

    public df(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f44971a = i7;
        this.f44972b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44971a) {
            case 0:
                this.f44972b.getSwipeBack().b(true);
                return;
            case 1:
                this.f44972b.getSwipeBack().b(true);
                return;
            default:
                this.f44972b.getSwipeBack().b(true);
                return;
        }
    }
}
