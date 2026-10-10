package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class kf0 extends NestedScrollView {
    public View W;
    public final sf0 f28011a0;

    public kf0(sf0 sf0Var, Activity activity) {
        super(activity);
        this.f28011a0 = sf0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.W != null && this.f28011a0.d.getTop() == getPaddingTop()) {
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
