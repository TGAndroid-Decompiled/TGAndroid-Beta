package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class ed0 extends NestedScrollView {
    public View f34676a0;
    public final ld0 f34677b0;

    public ed0(ld0 ld0Var, Activity activity) {
        super(activity);
        this.f34677b0 = ld0Var;
    }

    @Override
    public final int c(Rect rect) {
        if (this.f34676a0 != null && this.f34677b0.f37097o1.getTop() == getPaddingTop()) {
            int c10 = super.c(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.f34676a0.getTop() - getScrollY()) + rect.top) + c10);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.n10.x(10.0f, currentActionBarHeight, c10);
            }
            return c10;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.f34676a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
