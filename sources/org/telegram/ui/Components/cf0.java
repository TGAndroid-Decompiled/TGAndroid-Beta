package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class cf0 extends NestedScrollView {
    public View W;
    public final kf0 f27150a0;

    public cf0(kf0 kf0Var, Activity activity) {
        super(activity);
        this.f27150a0 = kf0Var;
    }

    @Override
    public final int e(Rect rect) {
        if (this.W != null && this.f27150a0.d.getTop() == getPaddingTop()) {
            int e = super.e(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.wh.z(10.0f, currentActionBarHeight, e);
            }
            return e;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
