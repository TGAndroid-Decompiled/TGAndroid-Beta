package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class le0 extends NestedScrollView {
    public View T;
    public final te0 U;

    public le0(te0 te0Var, Activity activity) {
        super(activity);
        this.U = te0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.T != null && this.U.d.getTop() == getPaddingTop()) {
            int f10 = super.f(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.T.getTop() - getScrollY()) + rect.top) + f10);
            if (currentActionBarHeight > 0) {
                return org.telegram.ui.b.t(10.0f, currentActionBarHeight, f10);
            }
            return f10;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.T = view2;
        super.requestChildFocus(view, view2);
    }
}
