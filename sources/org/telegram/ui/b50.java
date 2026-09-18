package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final i60 f32241a;

    public b50(i60 i60Var) {
        this.f32241a = i60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.f32241a;
        i60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(i60Var.f34377m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
