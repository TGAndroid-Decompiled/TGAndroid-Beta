package org.telegram.ui.Components;

import android.content.Context;
public final class eg extends q41 {
    public final fg h;

    public eg(fg fgVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, e51 e51Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, e51Var, e6Var);
        this.h = fgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f23929a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.B(false);
        }
    }
}
