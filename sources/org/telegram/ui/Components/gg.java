package org.telegram.ui.Components;

import android.content.Context;
public final class gg extends v31 {
    public final hg f35412q1;

    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, j41 j41Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, g2Var, j41Var, i6Var);
        this.f35412q1 = hgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f35412q1.f35730a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.w(false);
        }
    }
}
