package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v2 extends TextView {
    public final g3 f20615a;

    public v2(g3 g3Var, Context context) {
        super(context);
        this.f20615a = g3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        g3 g3Var = this.f20615a;
        z4 = g3Var.multipleLinesTitle;
        if (z4) {
            int measuredHeight = getMeasuredHeight();
            view = g3Var.customView;
            if (view != null) {
                view2 = g3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (g3Var.containerView != null) {
                for (int i12 = 1; i12 < g3Var.containerView.getChildCount(); i12++) {
                    View childAt = g3Var.containerView.getChildAt(i12);
                    if (childAt instanceof z2) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
