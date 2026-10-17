package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ci1 extends org.telegram.ui.ActionBar.j {
    public final ei1 f35949a;

    public ci1(ei1 ei1Var) {
        this.f35949a = ei1Var;
    }

    @Override
    public final void b(int i10) {
        ei1 ei1Var = this.f35949a;
        MessageObject messageObject = ei1Var.f36554n;
        if (i10 == -1) {
            ei1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                ei1Var.showDialog(org.telegram.ui.Components.dr0.O0(ei1Var.getParentActivity(), messageObject, null, false, ei1Var.h));
            }
        } else if (i10 == 2) {
            ei1.V(ei1Var.d, messageObject, ei1Var.getParentActivity(), ei1Var.f36555r, ei1Var.e);
        }
    }
}
