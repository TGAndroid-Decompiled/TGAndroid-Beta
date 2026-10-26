package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d40 extends LinearLayout {
    public boolean f38730a;
    public final org.telegram.ui.Components.md0 f38731b;
    public final z30 f38732c;
    public final a40 d;

    public d40(LaunchActivity launchActivity, org.telegram.ui.Components.md0 md0Var, z30 z30Var, a40 a40Var) {
        super(launchActivity);
        this.f38731b = md0Var;
        this.f38732c = z30Var;
        this.d = a40Var;
        this.f38730a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f38730a = true;
        org.telegram.ui.Components.md0 md0Var = this.f38731b;
        md0Var.setItemCount(5);
        z30 z30Var = this.f38732c;
        z30Var.setItemCount(5);
        a40 a40Var = this.d;
        a40Var.setItemCount(5);
        md0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        z30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        a40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f38730a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38730a) {
            return;
        }
        super.requestLayout();
    }
}
