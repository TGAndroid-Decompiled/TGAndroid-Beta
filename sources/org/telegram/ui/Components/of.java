package org.telegram.ui.Components;

import android.content.Context;
public final class of extends y21 {
    public final pf f36713m1;

    public of(pf pfVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, n31 n31Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, n31Var, f6Var);
        this.f36713m1 = pfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f36713m1.f36995a;
        if (chatActivityEnterView.f31012a3 == this) {
            chatActivityEnterView.f31012a3 = null;
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.B(false);
        }
    }
}
