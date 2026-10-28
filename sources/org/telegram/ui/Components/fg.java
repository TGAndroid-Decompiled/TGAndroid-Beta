package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends c61 {
    public final gg f28120f;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.r2 r2Var, q61 q61Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, r2Var, q61Var, u6Var);
        this.f28120f = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f28120f.f28576a;
        if (chatActivityEnterView.f25849a3 == this) {
            chatActivityEnterView.f25849a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.w(false);
        }
    }
}
