package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class uc0 extends NestedScrollView {
    public View f39995a0;
    public final bd0 f39996b0;

    public uc0(bd0 bd0Var, Activity activity) {
        super(activity);
        this.f39996b0 = bd0Var;
    }

    @Override
    public final int c(Rect rect) {
        if (this.f39995a0 != null && this.f39996b0.f33251o1.getTop() == getPaddingTop()) {
            int c10 = super.c(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.f39995a0.getTop() - getScrollY()) + rect.top) + c10);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.i20.w(10.0f, currentActionBarHeight, c10);
            }
            return c10;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.f39995a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
