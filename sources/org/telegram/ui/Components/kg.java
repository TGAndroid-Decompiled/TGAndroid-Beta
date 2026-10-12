package org.telegram.ui.Components;

import android.content.Context;
public final class kg extends c61 {
    public final lg h;

    public kg(lg lgVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, q61 q61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m2Var, q61Var, c6Var);
        this.h = lgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f28173a;
        if (chatActivityEnterView.f23620a3 == this) {
            chatActivityEnterView.f23620a3 = null;
        }
        sg sgVar = chatActivityEnterView.Z2;
        if (sgVar != null) {
            sgVar.C(false);
        }
    }
}
