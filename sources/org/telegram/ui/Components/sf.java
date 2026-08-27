package org.telegram.ui.Components;

import android.content.Context;

public final class sf extends v31 {
    public final tf h;

    public sf(tf tfVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, j41 j41Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, n2Var, j41Var, c6Var);
        this.h = tfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f32761a;
        if (chatActivityEnterView.V2 == this) {
            chatActivityEnterView.V2 = null;
        }
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.r(false);
        }
    }
}
