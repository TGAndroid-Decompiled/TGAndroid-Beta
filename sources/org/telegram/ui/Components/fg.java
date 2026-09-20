package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends e51 {
    public final gg h;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, s51 s51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, s51Var, f6Var);
        this.h = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24351a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        ng ngVar = chatActivityEnterView.Y2;
        if (ngVar != null) {
            ngVar.B(false);
        }
    }
}
