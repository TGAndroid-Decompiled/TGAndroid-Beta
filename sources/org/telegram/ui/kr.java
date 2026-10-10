package org.telegram.ui;

import android.app.Activity;
public final class kr extends org.telegram.ui.Components.f30 {
    public final tr f39384b;

    public kr(tr trVar, Activity activity, tr trVar2) {
        super(activity, trVar2);
        this.f39384b = trVar;
    }

    @Override
    public final void p() {
        tr trVar = this.f39384b;
        trVar.getMessagesController().convertToGigaGroup(trVar.getParentActivity(), trVar.f42134r, trVar, new z0(this, 24));
    }

    @Override
    public final void o() {
    }
}
