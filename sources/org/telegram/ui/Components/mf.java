package org.telegram.ui.Components;

import android.content.Context;
public final class mf extends z21 {
    public final nf f36145n1;

    public mf(nf nfVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, n31 n31Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, d2Var, n31Var, e6Var);
        this.f36145n1 = nfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f36145n1.f36497a;
        if (chatActivityEnterView.f31094b3 == this) {
            chatActivityEnterView.f31094b3 = null;
        }
        uf ufVar = chatActivityEnterView.f31087a3;
        if (ufVar != null) {
            ufVar.A(false);
        }
    }
}
