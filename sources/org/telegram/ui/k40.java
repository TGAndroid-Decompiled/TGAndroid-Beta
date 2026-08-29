package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class k40 implements ViewTreeObserver.OnPreDrawListener {
    public final r50 f39749a;

    public k40(r50 r50Var) {
        this.f39749a = r50Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        r50 r50Var = this.f39749a;
        r50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        r50Var.W1.j(null);
        AndroidUtilities.updateVisibleRows(r50Var.f41904i2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
