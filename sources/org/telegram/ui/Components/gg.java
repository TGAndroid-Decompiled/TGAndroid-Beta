package org.telegram.ui.Components;

import android.content.Context;
public final class gg extends d51 {
    public final hg h;

    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, r51 r51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, r51Var, d6Var);
        this.h = hgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24738a;
        if (chatActivityEnterView.f21942a3 == this) {
            chatActivityEnterView.f21942a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.B(false);
        }
    }
}
