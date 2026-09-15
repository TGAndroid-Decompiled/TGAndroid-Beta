package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class mj1 extends org.telegram.ui.ActionBar.j {
    public final oj1 f35764a;

    public mj1(oj1 oj1Var) {
        this.f35764a = oj1Var;
    }

    @Override
    public final void b(int i10) {
        oj1 oj1Var = this.f35764a;
        MessageObject messageObject = oj1Var.f36239n;
        if (i10 == -1) {
            oj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                oj1Var.showDialog(org.telegram.ui.Components.hq0.N0(oj1Var.getParentActivity(), messageObject, null, false, oj1Var.h));
            }
        } else if (i10 == 2) {
            oj1.V(oj1Var.d, messageObject, oj1Var.getParentActivity(), oj1Var.f36240r, oj1Var.e);
        }
    }
}
