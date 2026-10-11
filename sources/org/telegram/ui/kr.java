package org.telegram.ui;

import android.app.Activity;
public final class kr extends org.telegram.ui.Components.f30 {
    public final sr f39405b;

    public kr(sr srVar, Activity activity, sr srVar2) {
        super(activity, srVar2);
        this.f39405b = srVar;
    }

    @Override
    public final void p() {
        sr srVar = this.f39405b;
        srVar.getMessagesController().convertToGigaGroup(srVar.getParentActivity(), srVar.f41822r, srVar, new y0(this, 24));
    }

    @Override
    public final void o() {
    }
}
