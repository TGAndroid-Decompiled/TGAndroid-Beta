package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni1 extends org.telegram.ui.ActionBar.j {
    public final pi1 f41812a;

    public ni1(pi1 pi1Var) {
        this.f41812a = pi1Var;
    }

    @Override
    public final void b(int i10) {
        pi1 pi1Var = this.f41812a;
        MessageObject messageObject = pi1Var.f42445n;
        if (i10 == -1) {
            pi1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                pi1Var.showDialog(org.telegram.ui.Components.nr0.P0(pi1Var.getParentActivity(), messageObject, null, false, pi1Var.h));
            }
        } else if (i10 == 2) {
            pi1.W(pi1Var.d, messageObject, pi1Var.getParentActivity(), pi1Var.f42446r, pi1Var.e);
        }
    }
}
