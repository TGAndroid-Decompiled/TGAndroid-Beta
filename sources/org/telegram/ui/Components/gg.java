package org.telegram.ui.Components;

import android.content.Context;
public final class gg extends f51 {
    public final hg h;

    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, t51 t51Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, o2Var, t51Var, e6Var);
        this.h = hgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f24834a;
        if (chatActivityEnterView.f21959a3 == this) {
            chatActivityEnterView.f21959a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.B(false);
        }
    }
}
