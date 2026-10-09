package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class pj1 extends org.telegram.ui.ActionBar.j {
    public final rj1 f40821a;

    public pj1(rj1 rj1Var) {
        this.f40821a = rj1Var;
    }

    @Override
    public final void b(int i10) {
        rj1 rj1Var = this.f40821a;
        MessageObject messageObject = rj1Var.f41443n;
        if (i10 == -1) {
            rj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                rj1Var.showDialog(org.telegram.ui.Components.mr0.O0(rj1Var.getParentActivity(), messageObject, null, false, rj1Var.h));
            }
        } else if (i10 == 2) {
            rj1.V(rj1Var.d, messageObject, rj1Var.getParentActivity(), rj1Var.f41444r, rj1Var.f41441e);
        }
    }
}
