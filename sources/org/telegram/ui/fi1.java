package org.telegram.ui;

import org.telegram.messenger.MessageObject;

public final class fi1 extends org.telegram.ui.ActionBar.j {

    public final hi1 f38147a;

    public fi1(hi1 hi1Var) {
        this.f38147a = hi1Var;
    }

    @Override
    public final void b(int i10) {
        hi1 hi1Var = this.f38147a;
        MessageObject messageObject = hi1Var.f38846n;
        if (i10 == -1) {
            hi1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                hi1.V(hi1Var.d, messageObject, hi1Var.getParentActivity(), hi1Var.f38847r, hi1Var.f38844e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            hi1Var.showDialog(org.telegram.ui.Components.sp0.N0(hi1Var.getParentActivity(), messageObject, null, false, hi1Var.h));
        }
    }
}
