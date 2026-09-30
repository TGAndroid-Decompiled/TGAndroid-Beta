package org.telegram.ui.Components;

import android.content.Context;
public final class hg extends g51 {
    public final ig h;

    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, u51 u51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, u51Var, d6Var);
        this.h = igVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f25111a;
        if (chatActivityEnterView.f21978a3 == this) {
            chatActivityEnterView.f21978a3 = null;
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.B(false);
        }
    }
}
