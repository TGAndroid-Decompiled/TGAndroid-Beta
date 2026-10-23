package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class h40 implements ViewTreeObserver.OnPreDrawListener {
    public final q50 f37482a;

    public h40(q50 q50Var) {
        this.f37482a = q50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        q50 q50Var = this.f37482a;
        q50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        q50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(q50Var.f40429m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
