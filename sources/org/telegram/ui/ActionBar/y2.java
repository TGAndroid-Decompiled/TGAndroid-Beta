package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y2 extends TextView {
    public final k3 f23288a;

    public y2(k3 k3Var, Context context) {
        super(context);
        this.f23288a = k3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        k3 k3Var = this.f23288a;
        z10 = k3Var.multipleLinesTitle;
        if (z10) {
            int measuredHeight = getMeasuredHeight();
            view = k3Var.customView;
            if (view != null) {
                view2 = k3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (k3Var.containerView != null) {
                for (int i12 = 1; i12 < k3Var.containerView.getChildCount(); i12++) {
                    View childAt = k3Var.containerView.getChildAt(i12);
                    if (childAt instanceof c3) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
