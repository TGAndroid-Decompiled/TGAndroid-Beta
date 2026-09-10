package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class qe0 extends NestedScrollView {
    public View W;
    public final ye0 f26399a0;

    public qe0(ye0 ye0Var, Activity activity) {
        super(activity);
        this.f26399a0 = ye0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.W != null && this.f26399a0.d.getTop() == getPaddingTop()) {
            int f7 = super.f(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.em.v(10.0f, currentActionBarHeight, f7);
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
