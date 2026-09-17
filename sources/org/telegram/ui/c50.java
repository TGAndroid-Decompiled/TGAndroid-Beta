package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class c50 implements ViewTreeObserver.OnPreDrawListener {
    public final k60 f32677a;

    public c50(k60 k60Var) {
        this.f32677a = k60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.f32677a;
        k60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(k60Var.f35060m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
