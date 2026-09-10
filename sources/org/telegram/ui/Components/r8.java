package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class r8 extends org.telegram.ui.ActionBar.h3 {
    public final d9 f26626b;

    public r8(d9 d9Var, Activity activity) {
        super(activity, true);
        this.f26626b = d9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        d9 d9Var = this.f26626b;
        d9Var.J.v1(d9Var.Y);
        d9Var.f22330f = true;
        d9Var.fragmentView.invalidate();
        d9Var.e.animate().setListener(new org.telegram.ui.Cells.v5(this, 20)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        d9 d9Var = this.f26626b;
        AndroidUtilities.requestAdjustResize(d9Var.getParentActivity(), d9Var.getClassGuid());
        d9Var.S = null;
    }
}
