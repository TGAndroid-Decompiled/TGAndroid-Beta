package org.telegram.ui.Components;

import android.content.Context;
public final class eg extends t31 {
    public final fg f34697q1;

    public eg(fg fgVar, Context context, org.telegram.ui.ActionBar.h2 h2Var, h41 h41Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, h2Var, h41Var, i6Var);
        this.f34697q1 = fgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f34697q1.f35077a;
        if (chatActivityEnterView.O3 == this) {
            chatActivityEnterView.O3 = null;
        }
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.A(false);
        }
    }
}
