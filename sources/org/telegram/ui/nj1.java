package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class nj1 extends org.telegram.ui.ActionBar.j {
    public final pj1 f40301a;

    public nj1(pj1 pj1Var) {
        this.f40301a = pj1Var;
    }

    @Override
    public final void b(int i10) {
        pj1 pj1Var = this.f40301a;
        MessageObject messageObject = pj1Var.f40931n;
        if (i10 == -1) {
            pj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                pj1Var.showDialog(org.telegram.ui.Components.nr0.O0(pj1Var.getParentActivity(), messageObject, null, false, pj1Var.h));
            }
        } else if (i10 == 2) {
            pj1.V(pj1Var.d, messageObject, pj1Var.getParentActivity(), pj1Var.f40932r, pj1Var.f40929e);
        }
    }
}
