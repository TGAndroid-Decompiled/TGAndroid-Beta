package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class dd0 extends NestedScrollView {
    public View f34276a0;
    public final kd0 f34277b0;

    public dd0(kd0 kd0Var, Activity activity) {
        super(activity);
        this.f34277b0 = kd0Var;
    }

    @Override
    public final int c(Rect rect) {
        if (this.f34276a0 != null && this.f34277b0.f36706o1.getTop() == getPaddingTop()) {
            int c10 = super.c(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.f34276a0.getTop() - getScrollY()) + rect.top) + c10);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.m10.x(10.0f, currentActionBarHeight, c10);
            }
            return c10;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.f34276a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
