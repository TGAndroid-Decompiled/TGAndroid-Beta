package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nf implements View.OnClickListener {
    public final int f36614a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36615b;

    public nf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f36614a = i10;
        this.f36615b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36614a) {
            case 0:
                this.f36615b.getSwipeBack().b(true);
                return;
            case 1:
                this.f36615b.getSwipeBack().b(true);
                return;
            default:
                this.f36615b.getSwipeBack().b(true);
                return;
        }
    }
}
