package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends u51 {
    public final gg f26312f;

    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, i61 i61Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, o2Var, i61Var, g6Var);
        this.f26312f = ggVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f26312f.f26605a;
        if (chatActivityEnterView.f24054a3 == this) {
            chatActivityEnterView.f24054a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.C(false);
        }
    }
}
