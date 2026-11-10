package org.telegram.ui.Components;

import android.content.Context;
public final class nf extends e31 {
    public final of f36303p1;

    public nf(of ofVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, t31 t31Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, f2Var, t31Var, h6Var);
        this.f36303p1 = ofVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f36303p1.f36599a;
        if (chatActivityEnterView.f31033a3 == this) {
            chatActivityEnterView.f31033a3 = null;
        }
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar != null) {
            vfVar.B(false);
        }
    }
}
