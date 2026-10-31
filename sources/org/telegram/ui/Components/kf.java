package org.telegram.ui.Components;

import android.content.Context;
public final class kf extends h41 {
    public final lf f27740m1;

    public kf(lf lfVar, Context context, org.telegram.ui.ActionBar.k2 k2Var, w41 w41Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, w41Var, p6Var);
        this.f27740m1 = lfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f27740m1.f28100a;
        if (chatActivityEnterView.f23676a3 == this) {
            chatActivityEnterView.f23676a3 = null;
        }
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.B(false);
        }
    }
}
