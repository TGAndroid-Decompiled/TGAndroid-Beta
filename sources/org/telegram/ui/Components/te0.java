package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class te0 extends NestedScrollView {
    public View W;
    public final bf0 f31120a0;

    public te0(bf0 bf0Var, Activity activity) {
        super(activity);
        this.f31120a0 = bf0Var;
    }

    @Override
    public final int e(Rect rect) {
        if (this.W != null && this.f31120a0.d.getTop() == getPaddingTop()) {
            int e7 = super.e(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e7);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.bi.y(10.0f, currentActionBarHeight, e7);
            }
            return e7;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
