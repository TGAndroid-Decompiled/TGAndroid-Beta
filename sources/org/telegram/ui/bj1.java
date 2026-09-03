package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class bj1 extends org.telegram.ui.ActionBar.j {
    public final dj1 f32902a;

    public bj1(dj1 dj1Var) {
        this.f32902a = dj1Var;
    }

    @Override
    public final void b(int i10) {
        dj1 dj1Var = this.f32902a;
        MessageObject messageObject = dj1Var.f33493n;
        if (i10 == -1) {
            dj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                dj1Var.showDialog(org.telegram.ui.Components.lq0.N0(dj1Var.getParentActivity(), messageObject, null, false, dj1Var.h));
            }
        } else if (i10 == 2) {
            dj1.V(dj1Var.d, messageObject, dj1Var.getParentActivity(), dj1Var.f33494r, dj1Var.e);
        }
    }
}
