package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class ce0 extends NestedScrollView {
    public View S;
    public final ke0 T;

    public ce0(ke0 ke0Var, Activity activity) {
        super(activity);
        this.T = ke0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.S != null && this.T.d.getTop() == getPaddingTop()) {
            int f9 = super.f(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - (((this.S.getTop() - getScrollY()) + rect.top) + f9);
            if (currentActionBarHeight > 0) {
                return org.telegram.ui.b.u(10.0f, currentActionBarHeight, f9);
            }
            return f9;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.S = view2;
        super.requestChildFocus(view, view2);
    }
}
