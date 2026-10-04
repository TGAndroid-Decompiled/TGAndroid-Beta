package org.telegram.ui.Components;

import android.content.Context;
public final class hg extends o51 {
    public final ig h;

    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, c61 c61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, c61Var, d6Var);
        this.h = igVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f27406a;
        if (chatActivityEnterView.f23855a3 == this) {
            chatActivityEnterView.f23855a3 = null;
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.B(false);
        }
    }
}
