package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends p51 {
    public final gg h;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, d61 d61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, d61Var, d6Var);
        this.h = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f26586a;
        if (chatActivityEnterView.f23916a3 == this) {
            chatActivityEnterView.f23916a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.C(false);
        }
    }
}
