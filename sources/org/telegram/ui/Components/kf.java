package org.telegram.ui.Components;

import android.content.Context;
public final class kf extends i41 {
    public final lf f27833m1;

    public kf(lf lfVar, Context context, org.telegram.ui.ActionBar.k2 k2Var, x41 x41Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, x41Var, p6Var);
        this.f27833m1 = lfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f27833m1.f28144a;
        if (chatActivityEnterView.f23677a3 == this) {
            chatActivityEnterView.f23677a3 = null;
        }
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.B(false);
        }
    }
}
