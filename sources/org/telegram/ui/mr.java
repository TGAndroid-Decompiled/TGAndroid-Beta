package org.telegram.ui;

import android.app.Activity;
public final class mr extends org.telegram.ui.Components.n20 {
    public final ur f35877b;

    public mr(ur urVar, Activity activity, ur urVar2) {
        super(activity, urVar2);
        this.f35877b = urVar;
    }

    @Override
    public final void n() {
        ur urVar = this.f35877b;
        urVar.getMessagesController().convertToGigaGroup(urVar.getParentActivity(), urVar.f38159r, urVar, new y0(this, 25));
    }

    @Override
    public final void m() {
    }
}
