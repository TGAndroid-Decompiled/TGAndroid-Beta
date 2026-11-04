package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class oc0 extends NestedScrollView {
    public View f36801a0;
    public final vc0 f36802b0;

    public oc0(vc0 vc0Var, Activity activity) {
        super(activity);
        this.f36802b0 = vc0Var;
    }

    @Override
    public final int c(Rect rect) {
        if (this.f36801a0 != null && this.f36802b0.f39067l1.getTop() == getPaddingTop()) {
            int c2 = super.c(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.f36801a0.getTop() - getScrollY()) + rect.top) + c2);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.camera.q.w(10.0f, currentActionBarHeight, c2);
            }
            return c2;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.f36801a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
