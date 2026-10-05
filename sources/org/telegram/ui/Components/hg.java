package org.telegram.ui.Components;

import android.content.Context;
public final class hg extends p51 {
    public final ig h;

    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, d61 d61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, d61Var, d6Var);
        this.h = igVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f27501a;
        if (chatActivityEnterView.f23858a3 == this) {
            chatActivityEnterView.f23858a3 = null;
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.B(false);
        }
    }
}
