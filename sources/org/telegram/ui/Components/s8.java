package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class s8 extends org.telegram.ui.ActionBar.f3 {
    public final e9 f30653b;

    public s8(e9 e9Var, Activity activity) {
        super(activity, true);
        this.f30653b = e9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        e9 e9Var = this.f30653b;
        e9Var.J.y1(e9Var.Y);
        e9Var.f26014f = true;
        e9Var.fragmentView.invalidate();
        e9Var.f26013e.animate().setListener(new r8(this, 0)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        e9 e9Var = this.f30653b;
        AndroidUtilities.requestAdjustResize(e9Var.getParentActivity(), e9Var.getClassGuid());
        e9Var.S = null;
    }
}
