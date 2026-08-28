package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class h40 implements ViewTreeObserver.OnPreDrawListener {
    public final o50 f38677a;

    public h40(o50 o50Var) {
        this.f38677a = o50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        o50 o50Var = this.f38677a;
        o50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        o50Var.W1.j(null);
        AndroidUtilities.updateVisibleRows(o50Var.f40917i2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
