package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class u8 extends org.telegram.ui.ActionBar.k3 {
    public final g9 f33281b;

    public u8(g9 g9Var, Activity activity) {
        super(activity, true);
        this.f33281b = g9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        g9 g9Var = this.f33281b;
        g9Var.J.C1(g9Var.Y);
        g9Var.f28476f = true;
        g9Var.fragmentView.invalidate();
        g9Var.e.animate().setListener(new org.telegram.ui.sp(this, 6)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        g9 g9Var = this.f33281b;
        AndroidUtilities.requestAdjustResize(g9Var.getParentActivity(), g9Var.getClassGuid());
        g9Var.S = null;
    }
}
