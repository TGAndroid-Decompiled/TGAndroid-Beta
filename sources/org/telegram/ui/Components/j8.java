package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

public final class j8 extends org.telegram.ui.ActionBar.e3 {

    public final v8 f29641b;

    public j8(v8 v8Var, Activity activity) {
        super(activity, true);
        this.f29641b = v8Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        v8 v8Var = this.f29641b;
        v8Var.F.w1(v8Var.U);
        v8Var.f33299f = true;
        v8Var.fragmentView.invalidate();
        v8Var.f33298e.animate().setListener(new org.telegram.ui.am(this, 8)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        v8 v8Var = this.f29641b;
        AndroidUtilities.requestAdjustResize(v8Var.getParentActivity(), v8Var.getClassGuid());
        v8Var.O = null;
    }
}
