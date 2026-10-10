package org.telegram.ui.Components;

import android.content.Context;
public final class ig extends y51 {
    public final jg h;

    public ig(jg jgVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, m61 m61Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, m61Var, e6Var);
        this.h = jgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f27672a;
        if (chatActivityEnterView.f23858a3 == this) {
            chatActivityEnterView.f23858a3 = null;
        }
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.C(false);
        }
    }
}
