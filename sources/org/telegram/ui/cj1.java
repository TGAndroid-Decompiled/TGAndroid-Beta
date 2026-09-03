package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class cj1 extends org.telegram.ui.ActionBar.j {
    public final ej1 f35818a;

    public cj1(ej1 ej1Var) {
        this.f35818a = ej1Var;
    }

    @Override
    public final void b(int i10) {
        ej1 ej1Var = this.f35818a;
        MessageObject messageObject = ej1Var.f36517n;
        if (i10 == -1) {
            ej1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ej1Var.showDialog(org.telegram.ui.Components.lq0.N0(ej1Var.getParentActivity(), messageObject, null, false, ej1Var.h));
            }
        } else if (i10 == 2) {
            ej1.V(ej1Var.d, messageObject, ej1Var.getParentActivity(), ej1Var.f36518r, ej1Var.f36515e);
        }
    }
}
