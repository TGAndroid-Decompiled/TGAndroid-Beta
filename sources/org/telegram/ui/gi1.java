package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class gi1 extends org.telegram.ui.ActionBar.j {
    public final ii1 f38554a;

    public gi1(ii1 ii1Var) {
        this.f38554a = ii1Var;
    }

    @Override
    public final void b(int i9) {
        ii1 ii1Var = this.f38554a;
        MessageObject messageObject = ii1Var.f39172n;
        if (i9 == -1) {
            ii1Var.finishFragment();
        } else if (i9 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ii1Var.showDialog(org.telegram.ui.Components.rp0.N0(ii1Var.getParentActivity(), messageObject, null, false, ii1Var.h));
            }
        } else if (i9 == 2) {
            ii1.U(ii1Var.d, messageObject, ii1Var.getParentActivity(), ii1Var.f39173r, ii1Var.f39170e);
        }
    }
}
