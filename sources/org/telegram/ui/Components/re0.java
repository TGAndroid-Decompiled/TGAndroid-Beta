package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class re0 extends NestedScrollView {
    public View W;
    public final ze0 f27957a0;

    public re0(ze0 ze0Var, Activity activity) {
        super(activity);
        this.f27957a0 = ze0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.W != null && this.f27957a0.d.getTop() == getPaddingTop()) {
            int f7 = super.f(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.ok.y(10.0f, currentActionBarHeight, f7);
            }
            return f7;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
