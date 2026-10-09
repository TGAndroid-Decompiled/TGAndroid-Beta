package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class if0 extends NestedScrollView {
    public View W;
    public final qf0 f27371a0;

    public if0(qf0 qf0Var, Activity activity) {
        super(activity);
        this.f27371a0 = qf0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.W != null && this.f27371a0.d.getTop() == getPaddingTop()) {
            int f7 = super.f(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.bi.z(10.0f, currentActionBarHeight, f7);
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
