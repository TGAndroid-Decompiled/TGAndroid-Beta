package org.telegram.ui;

import android.app.Activity;
public final class mr extends org.telegram.ui.Components.n20 {
    public final ur f35794b;

    public mr(ur urVar, Activity activity, ur urVar2) {
        super(activity, urVar2);
        this.f35794b = urVar;
    }

    @Override
    public final void n() {
        ur urVar = this.f35794b;
        urVar.getMessagesController().convertToGigaGroup(urVar.getParentActivity(), urVar.f38130r, urVar, new y0(this, 24));
    }

    @Override
    public final void m() {
    }
}
