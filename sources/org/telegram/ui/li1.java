package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class li1 extends org.telegram.ui.ActionBar.j {
    public final ni1 f41286a;

    public li1(ni1 ni1Var) {
        this.f41286a = ni1Var;
    }

    @Override
    public final void b(int i10) {
        ni1 ni1Var = this.f41286a;
        MessageObject messageObject = ni1Var.f41939n;
        if (i10 == -1) {
            ni1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ni1Var.showDialog(org.telegram.ui.Components.mr0.P0(ni1Var.getParentActivity(), messageObject, null, false, ni1Var.h));
            }
        } else if (i10 == 2) {
            ni1.W(ni1Var.d, messageObject, ni1Var.getParentActivity(), ni1Var.f41940r, ni1Var.e);
        }
    }
}
