package org.telegram.ui.Components;

import android.content.Context;
public final class vf extends j31 {
    public final wf f40392q1;

    public vf(wf wfVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, x31 x31Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e2Var, x31Var, e6Var);
        this.f40392q1 = wfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f40392q1.f41334a;
        if (chatActivityEnterView.I3 == this) {
            chatActivityEnterView.I3 = null;
        }
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.C(false);
        }
    }
}
