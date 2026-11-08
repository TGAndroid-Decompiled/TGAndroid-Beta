package org.telegram.ui.Components;

import android.content.Context;
public final class of extends e31 {
    public final pf f36629m1;

    public of(pf pfVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, t31 t31Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, t31Var, f6Var);
        this.f36629m1 = pfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f36629m1.f36916a;
        if (chatActivityEnterView.f31017a3 == this) {
            chatActivityEnterView.f31017a3 = null;
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.B(false);
        }
    }
}
