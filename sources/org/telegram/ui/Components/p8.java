package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class p8 extends org.telegram.ui.ActionBar.f3 {
    public final b9 f31614b;

    public p8(b9 b9Var, Activity activity) {
        super(activity, true);
        this.f31614b = b9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        b9 b9Var = this.f31614b;
        b9Var.F.w1(b9Var.U);
        b9Var.f27007f = true;
        b9Var.fragmentView.invalidate();
        b9Var.f27006e.animate().setListener(new org.telegram.ui.bm(this, 8)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        b9 b9Var = this.f31614b;
        AndroidUtilities.requestAdjustResize(b9Var.getParentActivity(), b9Var.getClassGuid());
        b9Var.O = null;
    }
}
