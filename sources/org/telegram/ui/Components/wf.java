package org.telegram.ui.Components;

import android.content.Context;
public final class wf extends p41 {
    public final xf h;

    public wf(xf xfVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, d51 d51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, p2Var, d51Var, g6Var);
        this.h = xfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f33052a;
        if (chatActivityEnterView.W2 == this) {
            chatActivityEnterView.W2 = null;
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.A(false);
        }
    }
}
