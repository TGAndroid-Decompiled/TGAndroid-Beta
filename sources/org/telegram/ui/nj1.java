package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class nj1 extends org.telegram.ui.ActionBar.j {
    public final qj1 f38970a;

    public nj1(qj1 qj1Var) {
        this.f38970a = qj1Var;
    }

    @Override
    public final void b(int i10) {
        qj1 qj1Var = this.f38970a;
        MessageObject messageObject = qj1Var.f39892n;
        if (i10 == -1) {
            qj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                qj1Var.showDialog(org.telegram.ui.Components.hq0.N0(qj1Var.getParentActivity(), messageObject, null, false, qj1Var.h));
            }
        } else if (i10 == 2) {
            qj1.V(qj1Var.d, messageObject, qj1Var.getParentActivity(), qj1Var.f39893r, qj1Var.f39890e);
        }
    }
}
