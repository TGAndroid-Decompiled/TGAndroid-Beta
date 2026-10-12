package org.telegram.ui.Components;

import android.content.Context;
public final class hg extends t51 {
    public final ig h;

    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, h61 h61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m2Var, h61Var, c6Var);
        this.h = igVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f25942a;
        if (chatActivityEnterView.f22853a3 == this) {
            chatActivityEnterView.f22853a3 = null;
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.C(false);
        }
    }
}
