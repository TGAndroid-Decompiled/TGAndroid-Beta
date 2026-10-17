package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends n51 {
    public final gg h;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, b61 b61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, b61Var, d6Var);
        this.h = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f26561a;
        if (chatActivityEnterView.f23908a3 == this) {
            chatActivityEnterView.f23908a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.C(false);
        }
    }
}
