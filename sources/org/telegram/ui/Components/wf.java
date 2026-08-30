package org.telegram.ui.Components;

import android.content.Context;
public final class wf extends q41 {
    public final xf h;

    public wf(xf xfVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, e51 e51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, e51Var, f6Var);
        this.h = xfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f30668a;
        if (chatActivityEnterView.W2 == this) {
            chatActivityEnterView.W2 = null;
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.z(false);
        }
    }
}
