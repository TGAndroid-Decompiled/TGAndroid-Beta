package org.telegram.ui;

import android.app.Activity;
public final class nr extends org.telegram.ui.Components.h30 {
    public final wr f40462b;

    public nr(wr wrVar, Activity activity, wr wrVar2) {
        super(activity, wrVar2);
        this.f40462b = wrVar;
    }

    @Override
    public final void p() {
        wr wrVar = this.f40462b;
        wrVar.getMessagesController().convertToGigaGroup(wrVar.getParentActivity(), wrVar.f43646r, wrVar, new z0(this, 24));
    }

    @Override
    public final void o() {
    }
}
