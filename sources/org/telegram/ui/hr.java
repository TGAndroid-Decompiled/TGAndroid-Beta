package org.telegram.ui;

import android.app.Activity;
public final class hr extends org.telegram.ui.Components.o20 {
    public final pr f34274b;

    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.f34274b = prVar;
    }

    @Override
    public final void n() {
        pr prVar = this.f34274b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.f36647r, prVar, new z0(this, 24));
    }

    @Override
    public final void m() {
    }
}
