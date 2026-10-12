package org.telegram.ui;

import android.app.Activity;
public final class nr extends org.telegram.ui.Components.h30 {
    public final wr f40465b;

    public nr(wr wrVar, Activity activity, wr wrVar2) {
        super(activity, wrVar2);
        this.f40465b = wrVar;
    }

    @Override
    public final void p() {
        wr wrVar = this.f40465b;
        wrVar.getMessagesController().convertToGigaGroup(wrVar.getParentActivity(), wrVar.f43651r, wrVar, new z0(this, 24));
    }

    @Override
    public final void o() {
    }
}
