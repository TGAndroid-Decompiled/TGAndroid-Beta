package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

public final class j40 implements ViewTreeObserver.OnPreDrawListener {

    public final s50 f39247a;

    public j40(s50 s50Var) {
        this.f39247a = s50Var;
    }

    @Override
    public final boolean onPreDraw() {
        s50 s50Var = this.f39247a;
        s50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.W1.j(null);
        AndroidUtilities.updateVisibleRows(s50Var.f42446i2);
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.requestLayout();
        return false;
    }
}
