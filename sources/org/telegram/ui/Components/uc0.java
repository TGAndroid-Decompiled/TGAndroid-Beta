package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
public final class uc0 extends NestedScrollView {
    public View W;
    public final bd0 f38700a0;

    public uc0(bd0 bd0Var, Activity activity) {
        super(activity);
        this.f38700a0 = bd0Var;
    }

    @Override
    public final int c(Rect rect) {
        if (this.W != null && this.f38700a0.f32222k1.getTop() == getPaddingTop()) {
            int c10 = super.c(rect);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + c10);
            if (currentActionBarHeight > 0) {
                return org.telegram.messenger.camera.q.w(10.0f, currentActionBarHeight, c10);
            }
            return c10;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
