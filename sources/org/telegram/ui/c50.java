package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class c50 implements ViewTreeObserver.OnPreDrawListener {
    public final k60 f32681a;

    public c50(k60 k60Var) {
        this.f32681a = k60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.f32681a;
        k60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(k60Var.f35065m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
