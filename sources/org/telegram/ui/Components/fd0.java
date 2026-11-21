package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class fd0 extends NestedScrollView {
    public View f35206a0;
    public final md0 f35207b0;

    public fd0(md0 md0Var, Activity activity) {
        super(activity);
        this.f35207b0 = md0Var;
    }

    @Override
    public final int c(Rect rect) {
        if (this.f35206a0 != null && this.f35207b0.f37489o1.getTop() == getPaddingTop()) {
            int c10 = super.c(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.f35206a0.getTop() - getScrollY()) + rect.top) + c10);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.n10.x(10.0f, currentActionBarHeight, c10);
            }
            return c10;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.f35206a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
