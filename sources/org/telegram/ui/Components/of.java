package org.telegram.ui.Components;

import android.content.Context;
public final class of extends f31 {
    public final pf f36713m1;

    public of(pf pfVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, u31 u31Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, f2Var, u31Var, g6Var);
        this.f36713m1 = pfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f36713m1.f37005a;
        if (chatActivityEnterView.f31022a3 == this) {
            chatActivityEnterView.f31022a3 = null;
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.B(false);
        }
    }
}
