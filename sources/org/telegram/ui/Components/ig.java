package org.telegram.ui.Components;

import android.content.Context;
public final class ig extends z51 {
    public final jg h;

    public ig(jg jgVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, n61 n61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, n61Var, d6Var);
        this.h = jgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f27679a;
        if (chatActivityEnterView.f23846a3 == this) {
            chatActivityEnterView.f23846a3 = null;
        }
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.C(false);
        }
    }
}
