package org.telegram.ui;

import android.app.Activity;
public final class hr extends org.telegram.ui.Components.r20 {
    public final pr f34368b;

    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.f34368b = prVar;
    }

    @Override
    public final void n() {
        pr prVar = this.f34368b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.f36746r, prVar, new z0(this, 24));
    }

    @Override
    public final void m() {
    }
}
