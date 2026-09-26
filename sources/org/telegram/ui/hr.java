package org.telegram.ui;

import android.app.Activity;
public final class hr extends org.telegram.ui.Components.o20 {
    public final pr f34273b;

    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.f34273b = prVar;
    }

    @Override
    public final void n() {
        pr prVar = this.f34273b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.f36646r, prVar, new z0(this, 24));
    }

    @Override
    public final void m() {
    }
}
