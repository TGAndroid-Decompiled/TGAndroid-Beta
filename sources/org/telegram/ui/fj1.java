package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class fj1 extends org.telegram.ui.ActionBar.j {
    public final hj1 f36344a;

    public fj1(hj1 hj1Var) {
        this.f36344a = hj1Var;
    }

    @Override
    public final void b(int i10) {
        hj1 hj1Var = this.f36344a;
        MessageObject messageObject = hj1Var.f37114n;
        if (i10 == -1) {
            hj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                hj1Var.showDialog(org.telegram.ui.Components.zq0.K0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
            }
        } else if (i10 == 2) {
            hj1.T(hj1Var.d, messageObject, hj1Var.getParentActivity(), hj1Var.f37115r, hj1Var.f37112e);
        }
    }
}
