package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n40 extends LinearLayout {
    public boolean f39174a;
    public final org.telegram.ui.Components.yc0 f39175b;
    public final j40 f39176c;
    public final k40 d;

    public n40(LaunchActivity launchActivity, org.telegram.ui.Components.yc0 yc0Var, j40 j40Var, k40 k40Var) {
        super(launchActivity);
        this.f39175b = yc0Var;
        this.f39176c = j40Var;
        this.d = k40Var;
        this.f39174a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39174a = true;
        org.telegram.ui.Components.yc0 yc0Var = this.f39175b;
        yc0Var.setItemCount(5);
        j40 j40Var = this.f39176c;
        j40Var.setItemCount(5);
        k40 k40Var = this.d;
        k40Var.setItemCount(5);
        yc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        j40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        k40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f39174a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f39174a) {
            return;
        }
        super.requestLayout();
    }
}
