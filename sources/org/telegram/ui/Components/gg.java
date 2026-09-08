package org.telegram.ui.Components;

import android.content.Context;
public final class gg extends p41 {
    public final hg h;

    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, d51 d51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, d51Var, f6Var);
        this.h = hgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f26757a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar != null) {
            ogVar.z(false);
        }
    }
}
