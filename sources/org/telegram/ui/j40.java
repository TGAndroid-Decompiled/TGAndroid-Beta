package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class j40 implements ViewTreeObserver.OnPreDrawListener {
    public final s50 f38054a;

    public j40(s50 s50Var) {
        this.f38054a = s50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.f38054a;
        s50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(s50Var.f40983m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
