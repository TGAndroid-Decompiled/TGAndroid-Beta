package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class e50 implements ViewTreeObserver.OnPreDrawListener {
    public final n60 f35465a;

    public e50(n60 n60Var) {
        this.f35465a = n60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        n60 n60Var = this.f35465a;
        n60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        n60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(n60Var.f38491m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
