package org.telegram.ui.Components;

import android.content.Context;
public final class ig extends x51 {
    public final jg h;

    public ig(jg jgVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, l61 l61Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, l61Var, e6Var);
        this.h = jgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f27710a;
        if (chatActivityEnterView.f23854a3 == this) {
            chatActivityEnterView.f23854a3 = null;
        }
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.C(false);
        }
    }
}
