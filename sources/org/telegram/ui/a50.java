package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final j60 f34335a;

    public a50(j60 j60Var) {
        this.f34335a = j60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f34335a;
        j60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(j60Var.f37562m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
