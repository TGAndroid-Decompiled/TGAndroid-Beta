package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class hi1 extends org.telegram.ui.ActionBar.j {
    public final ji1 f37876a;

    public hi1(ji1 ji1Var) {
        this.f37876a = ji1Var;
    }

    @Override
    public final void b(int i10) {
        ji1 ji1Var = this.f37876a;
        MessageObject messageObject = ji1Var.f38576n;
        if (i10 == -1) {
            ji1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ji1Var.showDialog(org.telegram.ui.Components.hr0.S0(ji1Var.getParentActivity(), messageObject, null, false, ji1Var.h));
            }
        } else if (i10 == 2) {
            ji1.V(ji1Var.d, messageObject, ji1Var.getParentActivity(), ji1Var.f38577r, ji1Var.e);
        }
    }
}
