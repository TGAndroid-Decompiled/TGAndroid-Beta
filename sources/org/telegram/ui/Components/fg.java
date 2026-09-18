package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends f51 {
    public final gg h;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, t51 t51Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, t51Var, e6Var);
        this.h = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24382a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        ng ngVar = chatActivityEnterView.Y2;
        if (ngVar != null) {
            ngVar.B(false);
        }
    }
}
