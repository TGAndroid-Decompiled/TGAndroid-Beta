package org.telegram.ui.Components;

import android.content.Context;
public final class zf extends e41 {
    public final ag h;

    public zf(ag agVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, s41 s41Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, o2Var, s41Var, c6Var);
        this.h = agVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f26766a;
        if (chatActivityEnterView.V2 == this) {
            chatActivityEnterView.V2 = null;
        }
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.x(false);
        }
    }
}
