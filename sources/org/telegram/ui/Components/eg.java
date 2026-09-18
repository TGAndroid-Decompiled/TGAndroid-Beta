package org.telegram.ui.Components;

import android.content.Context;
public final class eg extends r41 {
    public final fg h;

    public eg(fg fgVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, f51 f51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, o2Var, f51Var, f6Var);
        this.h = fgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.f23911a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.B(false);
        }
    }
}
