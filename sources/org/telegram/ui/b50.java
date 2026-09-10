package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final j60 f31161a;

    public b50(j60 j60Var) {
        this.f31161a = j60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f31161a;
        j60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(j60Var.f33984m2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
