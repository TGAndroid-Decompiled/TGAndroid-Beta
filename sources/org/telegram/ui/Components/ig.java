package org.telegram.ui.Components;

import android.content.Context;
public final class ig extends d51 {
    public final jg h;

    public ig(jg jgVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, r51 r51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, r51Var, f6Var);
        this.h = jgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24397a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        qg qgVar = chatActivityEnterView.Y2;
        if (qgVar != null) {
            qgVar.B(false);
        }
    }
}
