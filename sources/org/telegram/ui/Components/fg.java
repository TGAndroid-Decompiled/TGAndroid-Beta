package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends b61 {
    public final gg f28182f;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.r2 r2Var, p61 p61Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, r2Var, p61Var, u6Var);
        this.f28182f = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f28182f.f28566a;
        if (chatActivityEnterView.f25847a3 == this) {
            chatActivityEnterView.f25847a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.w(false);
        }
    }
}
