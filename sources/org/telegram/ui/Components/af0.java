package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class af0 extends NestedScrollView {
    public View W;
    public final if0 f24577a0;

    public af0(if0 if0Var, Activity activity) {
        super(activity);
        this.f24577a0 = if0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.W != null && this.f24577a0.d.getTop() == getPaddingTop()) {
            int f7 = super.f(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.wh.z(10.0f, currentActionBarHeight, f7);
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
