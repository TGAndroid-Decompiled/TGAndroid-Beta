package org.telegram.ui;

import android.app.Activity;
public final class mr extends org.telegram.ui.Components.n20 {
    public final ur f35796b;

    public mr(ur urVar, Activity activity, ur urVar2) {
        super(activity, urVar2);
        this.f35796b = urVar;
    }

    @Override
    public final void n() {
        ur urVar = this.f35796b;
        urVar.getMessagesController().convertToGigaGroup(urVar.getParentActivity(), urVar.f38144r, urVar, new y0(this, 24));
    }

    @Override
    public final void m() {
    }
}
