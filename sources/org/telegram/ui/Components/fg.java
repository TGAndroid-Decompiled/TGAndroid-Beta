package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends p41 {
    public final gg h;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, d51 d51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, d51Var, d6Var);
        this.h = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24280a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        ng ngVar = chatActivityEnterView.Y2;
        if (ngVar != null) {
            ngVar.B(false);
        }
    }
}
