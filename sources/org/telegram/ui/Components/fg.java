package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends g51 {
    public final gg h;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, u51 u51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, u51Var, f6Var);
        this.h = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24517a;
        if (chatActivityEnterView.f21971a3 == this) {
            chatActivityEnterView.f21971a3 = null;
        }
        ng ngVar = chatActivityEnterView.Z2;
        if (ngVar != null) {
            ngVar.B(false);
        }
    }
}
