package org.telegram.ui.Components;

import android.content.Context;
public final class gg extends f51 {
    public final hg h;

    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, t51 t51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, t51Var, d6Var);
        this.h = hgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24814a;
        if (chatActivityEnterView.f21956a3 == this) {
            chatActivityEnterView.f21956a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.B(false);
        }
    }
}
