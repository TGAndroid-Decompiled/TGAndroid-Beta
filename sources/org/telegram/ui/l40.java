package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class l40 implements ViewTreeObserver.OnPreDrawListener {
    public final u50 f39114a;

    public l40(u50 u50Var) {
        this.f39114a = u50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        u50 u50Var = this.f39114a;
        u50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        u50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(u50Var.f42266m2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
