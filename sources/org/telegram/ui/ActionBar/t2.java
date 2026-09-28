package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends TextView {
    public final e3 f19758a;

    public t2(e3 e3Var, Context context) {
        super(context);
        this.f19758a = e3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        e3 e3Var = this.f19758a;
        z10 = e3Var.multipleLinesTitle;
        if (z10) {
            int measuredHeight = getMeasuredHeight();
            view = e3Var.customView;
            if (view != null) {
                view2 = e3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (e3Var.containerView != null) {
                for (int i12 = 1; i12 < e3Var.containerView.getChildCount(); i12++) {
                    View childAt = e3Var.containerView.getChildAt(i12);
                    if (childAt instanceof x2) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
