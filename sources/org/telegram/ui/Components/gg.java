package org.telegram.ui.Components;

import android.content.Context;
public final class gg extends e51 {
    public final hg h;

    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, s51 s51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, s51Var, d6Var);
        this.h = hgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24789a;
        if (chatActivityEnterView.f21956a3 == this) {
            chatActivityEnterView.f21956a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.B(false);
        }
    }
}
