package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

public final class td0 extends NestedScrollView {
    public View S;
    public final be0 T;

    public td0(be0 be0Var, Activity activity) {
        super(activity, null);
        this.T = be0Var;
    }

    @Override
    public final int f(Rect rect) {
        if (this.S == null || this.T.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int iF = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.S.getTop() - getScrollY()) + rect.top) + iF);
        return currentActionBarHeight > 0 ? org.telegram.messenger.rl.u(10.0f, currentActionBarHeight, iF) : iF;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.S = view2;
        super.requestChildFocus(view, view2);
    }
}
