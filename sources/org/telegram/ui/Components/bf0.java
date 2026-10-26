package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class bf0 extends NestedScrollView {
    public View W;
    public final jf0 f26845a0;

    public bf0(jf0 jf0Var, Activity activity) {
        super(activity);
        this.f26845a0 = jf0Var;
    }

    @Override
    public final int e(Rect rect) {
        if (this.W != null && this.f26845a0.d.getTop() == getPaddingTop()) {
            int e = super.e(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.vh.z(10.0f, currentActionBarHeight, e);
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
