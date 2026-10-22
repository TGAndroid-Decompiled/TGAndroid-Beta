package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ai1 extends org.telegram.ui.ActionBar.j {
    public final ci1 f35383a;

    public ai1(ci1 ci1Var) {
        this.f35383a = ci1Var;
    }

    @Override
    public final void b(int i10) {
        ci1 ci1Var = this.f35383a;
        MessageObject messageObject = ci1Var.f35999n;
        if (i10 == -1) {
            ci1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ci1Var.showDialog(org.telegram.ui.Components.fr0.P0(ci1Var.getParentActivity(), messageObject, null, false, ci1Var.h));
            }
        } else if (i10 == 2) {
            ci1.V(ci1Var.d, messageObject, ci1Var.getParentActivity(), ci1Var.f36000r, ci1Var.e);
        }
    }
}
