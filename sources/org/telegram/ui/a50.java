package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final h60 f34686a;

    public a50(h60 h60Var) {
        this.f34686a = h60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        h60 h60Var = this.f34686a;
        h60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        h60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(h60Var.f36955m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
