package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class u8 extends org.telegram.ui.ActionBar.e3 {
    public final g9 f31476b;

    public u8(g9 g9Var, Activity activity) {
        super(activity, true);
        this.f31476b = g9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        g9 g9Var = this.f31476b;
        g9Var.J.x1(g9Var.Y);
        g9Var.f26693f = true;
        g9Var.fragmentView.invalidate();
        g9Var.f26692e.animate().setListener(new t8(this, 0)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        g9 g9Var = this.f31476b;
        AndroidUtilities.requestAdjustResize(g9Var.getParentActivity(), g9Var.getClassGuid());
        g9Var.S = null;
    }
}
