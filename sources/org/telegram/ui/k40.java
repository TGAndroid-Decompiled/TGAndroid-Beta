package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class k40 implements ViewTreeObserver.OnPreDrawListener {
    public final s50 f38397a;

    public k40(s50 s50Var) {
        this.f38397a = s50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.f38397a;
        s50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(s50Var.f40962m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
