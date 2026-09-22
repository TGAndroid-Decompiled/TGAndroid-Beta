package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class nj1 extends org.telegram.ui.ActionBar.j {
    public final pj1 f35999a;

    public nj1(pj1 pj1Var) {
        this.f35999a = pj1Var;
    }

    @Override
    public final void b(int i10) {
        pj1 pj1Var = this.f35999a;
        MessageObject messageObject = pj1Var.f36595n;
        if (i10 == -1) {
            pj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                pj1Var.showDialog(org.telegram.ui.Components.hq0.N0(pj1Var.getParentActivity(), messageObject, null, false, pj1Var.h));
            }
        } else if (i10 == 2) {
            pj1.V(pj1Var.d, messageObject, pj1Var.getParentActivity(), pj1Var.f36596r, pj1Var.e);
        }
    }
}
