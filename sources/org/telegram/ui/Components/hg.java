package org.telegram.ui.Components;

import android.content.Context;
public final class hg extends w31 {
    public final ig f35878q1;

    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, k41 k41Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, g2Var, k41Var, h6Var);
        this.f35878q1 = igVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f35878q1.f36246a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.A(false);
        }
    }
}
