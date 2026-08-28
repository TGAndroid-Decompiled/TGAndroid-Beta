package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class k8 extends org.telegram.ui.ActionBar.f3 {
    public final w8 f30029b;

    public k8(w8 w8Var, Activity activity) {
        super(activity, true);
        this.f30029b = w8Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        w8 w8Var = this.f30029b;
        w8Var.F.w1(w8Var.U);
        w8Var.f34142f = true;
        w8Var.fragmentView.invalidate();
        w8Var.f34141e.animate().setListener(new org.telegram.ui.xp(this, 6)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        w8 w8Var = this.f30029b;
        AndroidUtilities.requestAdjustResize(w8Var.getParentActivity(), w8Var.getClassGuid());
        w8Var.O = null;
    }
}
