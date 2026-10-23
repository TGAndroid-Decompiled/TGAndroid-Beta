package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ii1 extends org.telegram.ui.ActionBar.j {
    public final ki1 f38241a;

    public ii1(ki1 ki1Var) {
        this.f38241a = ki1Var;
    }

    @Override
    public final void b(int i10) {
        ki1 ki1Var = this.f38241a;
        MessageObject messageObject = ki1Var.f38960n;
        if (i10 == -1) {
            ki1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ki1Var.showDialog(org.telegram.ui.Components.ir0.S0(ki1Var.getParentActivity(), messageObject, null, false, ki1Var.h));
            }
        } else if (i10 == 2) {
            ki1.V(ki1Var.d, messageObject, ki1Var.getParentActivity(), ki1Var.f38961r, ki1Var.e);
        }
    }
}
