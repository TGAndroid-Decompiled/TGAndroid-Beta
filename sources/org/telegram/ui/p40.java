package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class p40 implements ViewTreeObserver.OnPreDrawListener {
    public final x50 f42298a;

    public p40(x50 x50Var) {
        this.f42298a = x50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        x50 x50Var = this.f42298a;
        x50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        x50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(x50Var.f45540m2);
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
