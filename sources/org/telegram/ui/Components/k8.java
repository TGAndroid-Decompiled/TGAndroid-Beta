package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class k8 extends org.telegram.ui.ActionBar.h3 {
    public final w8 f28318b;

    public k8(w8 w8Var, Activity activity) {
        super(activity, true);
        this.f28318b = w8Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        w8 w8Var = this.f28318b;
        w8Var.G.v1(w8Var.V);
        w8Var.f32679f = true;
        w8Var.fragmentView.invalidate();
        w8Var.f32678e.animate().setListener(new org.telegram.ui.s5(this, 29)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        w8 w8Var = this.f28318b;
        AndroidUtilities.requestAdjustResize(w8Var.getParentActivity(), w8Var.getClassGuid());
        w8Var.P = null;
    }
}
