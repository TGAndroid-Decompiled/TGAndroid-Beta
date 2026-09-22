package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class q8 extends org.telegram.ui.ActionBar.f3 {
    public final c9 f27278b;

    public q8(c9 c9Var, Activity activity) {
        super(activity, true);
        this.f27278b = c9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        c9 c9Var = this.f27278b;
        c9Var.J.w1(c9Var.Y);
        c9Var.f22984f = true;
        c9Var.fragmentView.invalidate();
        c9Var.e.animate().setListener(new p8(this, 0)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        c9 c9Var = this.f27278b;
        AndroidUtilities.requestAdjustResize(c9Var.getParentActivity(), c9Var.getClassGuid());
        c9Var.S = null;
    }
}
