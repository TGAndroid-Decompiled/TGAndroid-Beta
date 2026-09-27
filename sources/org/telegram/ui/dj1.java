package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class dj1 extends org.telegram.ui.ActionBar.j {
    public final fj1 f32990a;

    public dj1(fj1 fj1Var) {
        this.f32990a = fj1Var;
    }

    @Override
    public final void b(int i10) {
        fj1 fj1Var = this.f32990a;
        MessageObject messageObject = fj1Var.f33579n;
        if (i10 == -1) {
            fj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                fj1Var.showDialog(org.telegram.ui.Components.vq0.K0(fj1Var.getParentActivity(), messageObject, null, false, fj1Var.h));
            }
        } else if (i10 == 2) {
            fj1.V(fj1Var.d, messageObject, fj1Var.getParentActivity(), fj1Var.f33580r, fj1Var.e);
        }
    }
}
