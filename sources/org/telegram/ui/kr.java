package org.telegram.ui;

import android.app.Activity;
public final class kr extends org.telegram.ui.Components.n20 {
    public final sr f35225b;

    public kr(sr srVar, Activity activity, sr srVar2) {
        super(activity, srVar2);
        this.f35225b = srVar;
    }

    @Override
    public final void n() {
        sr srVar = this.f35225b;
        srVar.getMessagesController().convertToGigaGroup(srVar.getParentActivity(), srVar.f37484r, srVar, new y0(this, 25));
    }

    @Override
    public final void m() {
    }
}
