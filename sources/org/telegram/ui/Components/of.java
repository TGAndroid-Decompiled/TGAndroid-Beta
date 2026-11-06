package org.telegram.ui.Components;

import android.content.Context;
public final class of extends e31 {
    public final pf f36609m1;

    public of(pf pfVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, t31 t31Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, t31Var, f6Var);
        this.f36609m1 = pfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f36609m1.f36890a;
        if (chatActivityEnterView.f31013a3 == this) {
            chatActivityEnterView.f31013a3 = null;
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.B(false);
        }
    }
}
