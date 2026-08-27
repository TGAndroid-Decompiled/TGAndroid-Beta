package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class t2 extends TextView {

    public final e3 f23781a;

    public t2(e3 e3Var, Context context) {
        super(context);
        this.f23781a = e3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e3 e3Var = this.f23781a;
        if (e3Var.multipleLinesTitle) {
            int measuredHeight = getMeasuredHeight();
            if (e3Var.customView != null) {
                ((ViewGroup.MarginLayoutParams) e3Var.customView.getLayoutParams()).topMargin = measuredHeight;
                return;
            }
            if (e3Var.containerView != null) {
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
