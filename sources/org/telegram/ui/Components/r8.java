package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class r8 extends org.telegram.ui.ActionBar.f3 {
    public final d9 f27845b;

    public r8(d9 d9Var, Activity activity) {
        super(activity, true);
        this.f27845b = d9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        d9 d9Var = this.f27845b;
        d9Var.J.x1(d9Var.Y);
        d9Var.f23609f = true;
        d9Var.fragmentView.invalidate();
        d9Var.e.animate().setListener(new q8(this, 0)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        d9 d9Var = this.f27845b;
        AndroidUtilities.requestAdjustResize(d9Var.getParentActivity(), d9Var.getClassGuid());
        d9Var.S = null;
    }
}
