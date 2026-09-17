package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class d50 implements ViewTreeObserver.OnPreDrawListener {
    public final k60 f33008a;

    public d50(k60 k60Var) {
        this.f33008a = k60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.f33008a;
        k60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(k60Var.f35060m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
