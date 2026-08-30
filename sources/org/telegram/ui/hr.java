package org.telegram.ui;

import android.app.Activity;
public final class hr extends org.telegram.ui.Components.o20 {
    public final pr f34940b;

    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.f34940b = prVar;
    }

    @Override
    public final void n() {
        pr prVar = this.f34940b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.f37481r, prVar, new a1(this, 24));
    }

    @Override
    public final void m() {
    }
}
