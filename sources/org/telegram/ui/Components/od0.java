package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class od0 extends NestedScrollView {
    public View W;
    public final vd0 f29095a0;

    public od0(vd0 vd0Var, Activity activity) {
        super(activity);
        this.f29095a0 = vd0Var;
    }

    @Override
    public final int e(Rect rect) {
        if (this.W != null && this.f29095a0.f31253k1.getTop() == getPaddingTop()) {
            int e = super.e(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.a30.w(10.0f, currentActionBarHeight, e);
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
