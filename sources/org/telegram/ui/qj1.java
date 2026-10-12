package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class qj1 extends org.telegram.ui.ActionBar.j {
    public final sj1 f41347a;

    public qj1(sj1 sj1Var) {
        this.f41347a = sj1Var;
    }

    @Override
    public final void b(int i10) {
        sj1 sj1Var = this.f41347a;
        MessageObject messageObject = sj1Var.f41947n;
        if (i10 == -1) {
            sj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                sj1Var.showDialog(org.telegram.ui.Components.sr0.O0(sj1Var.getParentActivity(), messageObject, null, false, sj1Var.h));
            }
        } else if (i10 == 2) {
            sj1.V(sj1Var.d, messageObject, sj1Var.getParentActivity(), sj1Var.f41948r, sj1Var.f41945e);
        }
    }
}
