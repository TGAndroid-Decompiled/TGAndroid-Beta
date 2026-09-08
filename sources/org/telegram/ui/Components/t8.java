package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class t8 extends org.telegram.ui.ActionBar.f3 {
    public final f9 f30580b;

    public t8(f9 f9Var, Activity activity) {
        super(activity, true);
        this.f30580b = f9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f9 f9Var = this.f30580b;
        f9Var.J.v1(f9Var.Y);
        f9Var.f25997f = true;
        f9Var.fragmentView.invalidate();
        f9Var.f25996e.animate().setListener(new j6(this, 3)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f9 f9Var = this.f30580b;
        AndroidUtilities.requestAdjustResize(f9Var.getParentActivity(), f9Var.getClassGuid());
        f9Var.S = null;
    }
}
