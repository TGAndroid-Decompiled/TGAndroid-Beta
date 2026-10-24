package org.telegram.ui.Components;

import android.content.Context;
public final class dg extends t51 {
    public final eg f25726f;

    public dg(eg egVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, h61 h61Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, o2Var, h61Var, g6Var);
        this.f25726f = egVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f25726f.f26031a;
        if (chatActivityEnterView.f24055a3 == this) {
            chatActivityEnterView.f24055a3 = null;
        }
        mg mgVar = chatActivityEnterView.Z2;
        if (mgVar != null) {
            mgVar.C(false);
        }
    }
}
