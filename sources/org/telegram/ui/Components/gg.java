package org.telegram.ui.Components;

import android.content.Context;
public final class gg extends w31 {
    public final hg f35526q1;

    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, k41 k41Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, g2Var, k41Var, h6Var);
        this.f35526q1 = hgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f35526q1.f35830a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.A(false);
        }
    }
}
