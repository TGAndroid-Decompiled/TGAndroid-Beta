package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class v8 extends org.telegram.ui.ActionBar.e3 {
    public final h9 f29595b;

    public v8(h9 h9Var, Activity activity) {
        super(activity, true);
        this.f29595b = h9Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        h9 h9Var = this.f29595b;
        h9Var.J.x1(h9Var.Y);
        h9Var.f25214f = true;
        h9Var.fragmentView.invalidate();
        h9Var.e.animate().setListener(new l6(this, 3)).alpha(0.0f).setDuration(200L).start();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        h9 h9Var = this.f29595b;
        AndroidUtilities.requestAdjustResize(h9Var.getParentActivity(), h9Var.getClassGuid());
        h9Var.S = null;
    }
}
