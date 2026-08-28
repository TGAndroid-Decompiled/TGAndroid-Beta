package org.telegram.ui.Components;

import android.content.Context;
public final class wf extends t31 {
    public final xf h;

    public wf(xf xfVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, h41 h41Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, o2Var, h41Var, b6Var);
        this.h = xfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f34670a;
        if (chatActivityEnterView.V2 == this) {
            chatActivityEnterView.V2 = null;
        }
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.p(false);
        }
    }
}
