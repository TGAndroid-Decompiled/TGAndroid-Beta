package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class fj1 extends org.telegram.ui.ActionBar.j {
    public final hj1 f33341a;

    public fj1(hj1 hj1Var) {
        this.f33341a = hj1Var;
    }

    @Override
    public final void b(int i10) {
        hj1 hj1Var = this.f33341a;
        MessageObject messageObject = hj1Var.f33872n;
        if (i10 == -1) {
            hj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                hj1Var.showDialog(org.telegram.ui.Components.hq0.N0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
            }
        } else if (i10 == 2) {
            hj1.V(hj1Var.d, messageObject, hj1Var.getParentActivity(), hj1Var.f33873r, hj1Var.e);
        }
    }
}
