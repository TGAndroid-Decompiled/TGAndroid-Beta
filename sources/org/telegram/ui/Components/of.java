package org.telegram.ui.Components;

import android.content.Context;
public final class of extends d31 {
    public final pf f36591m1;

    public of(pf pfVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, s31 s31Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, s31Var, f6Var);
        this.f36591m1 = pfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f36591m1.f36874a;
        if (chatActivityEnterView.f31012a3 == this) {
            chatActivityEnterView.f31012a3 = null;
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.B(false);
        }
    }
}
