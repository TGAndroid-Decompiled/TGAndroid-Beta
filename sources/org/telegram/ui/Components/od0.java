package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class od0 extends NestedScrollView {
    public View S;
    public final wd0 T;

    public od0(wd0 wd0Var, Activity activity) {
        super(activity);
        this.T = wd0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.S != null && this.T.d.getTop() == getPaddingTop()) {
            int f10 = super.f(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.S.getTop() - getScrollY()) + rect.top) + f10);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.ll.w(10.0f, currentActionBarHeight, f10);
            }
            return f10;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.S = view2;
        super.requestChildFocus(view, view2);
    }
}
