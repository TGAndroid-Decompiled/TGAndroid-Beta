package org.telegram.ui;

import android.app.Activity;
public final class kr extends org.telegram.ui.Components.f30 {
    public final sr f39439b;

    public kr(sr srVar, Activity activity, sr srVar2) {
        super(activity, srVar2);
        this.f39439b = srVar;
    }

    @Override
    public final void p() {
        sr srVar = this.f39439b;
        srVar.getMessagesController().convertToGigaGroup(srVar.getParentActivity(), srVar.f41856r, srVar, new y0(this, 24));
    }

    @Override
    public final void o() {
    }
}
