package org.telegram.ui.Components;

import android.content.Context;
public final class ig extends y51 {
    public final jg h;

    public ig(jg jgVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, m61 m61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, m61Var, d6Var);
        this.h = jgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f27725a;
        if (chatActivityEnterView.f23882a3 == this) {
            chatActivityEnterView.f23882a3 = null;
        }
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.C(false);
        }
    }
}
