package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class hi1 extends org.telegram.ui.ActionBar.k {
    public final ji1 f38942a;

    public hi1(ji1 ji1Var) {
        this.f38942a = ji1Var;
    }

    @Override
    public final void b(int i10) {
        ji1 ji1Var = this.f38942a;
        MessageObject messageObject = ji1Var.f39566n;
        if (i10 == -1) {
            ji1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ji1Var.showDialog(org.telegram.ui.Components.dq0.N0(ji1Var.getParentActivity(), messageObject, null, false, ji1Var.h));
            }
        } else if (i10 == 2) {
            ji1.V(ji1Var.d, messageObject, ji1Var.getParentActivity(), ji1Var.f39567r, ji1Var.f39564e);
        }
    }
}
