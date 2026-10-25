package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class n40 implements ViewTreeObserver.OnPreDrawListener {
    public final v50 f41752a;

    public n40(v50 v50Var) {
        this.f41752a = v50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        v50 v50Var = this.f41752a;
        v50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        v50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(v50Var.f44656m2);
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
