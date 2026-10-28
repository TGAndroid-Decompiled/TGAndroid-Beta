package org.telegram.ui;

import android.app.Activity;
public final class er extends org.telegram.ui.Components.y20 {
    public final mr f38925b;

    public er(mr mrVar, Activity activity, mr mrVar2) {
        super(activity, mrVar2);
        this.f38925b = mrVar;
    }

    @Override
    public final void n() {
        mr mrVar = this.f38925b;
        mrVar.getMessagesController().convertToGigaGroup(mrVar.getParentActivity(), mrVar.f41530n, mrVar, new y0(this, 26));
    }

    @Override
    public final void m() {
    }
}
