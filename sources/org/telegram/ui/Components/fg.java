package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends o51 {
    public final gg h;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, c61 c61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, c61Var, d6Var);
        this.h = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f26590a;
        if (chatActivityEnterView.f23911a3 == this) {
            chatActivityEnterView.f23911a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.C(false);
        }
    }
}
