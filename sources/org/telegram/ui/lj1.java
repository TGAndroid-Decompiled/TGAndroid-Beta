package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class lj1 extends org.telegram.ui.ActionBar.j {
    public final nj1 f35392a;

    public lj1(nj1 nj1Var) {
        this.f35392a = nj1Var;
    }

    @Override
    public final void b(int i10) {
        nj1 nj1Var = this.f35392a;
        MessageObject messageObject = nj1Var.f35971n;
        if (i10 == -1) {
            nj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                nj1Var.showDialog(org.telegram.ui.Components.vq0.N0(nj1Var.getParentActivity(), messageObject, null, false, nj1Var.h));
            }
        } else if (i10 == 2) {
            nj1.V(nj1Var.d, messageObject, nj1Var.getParentActivity(), nj1Var.f35972r, nj1Var.e);
        }
    }
}
