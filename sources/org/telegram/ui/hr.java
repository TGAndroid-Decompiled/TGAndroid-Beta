package org.telegram.ui;

import android.app.Activity;
public final class hr extends org.telegram.ui.Components.o20 {
    public final pr f34260b;

    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.f34260b = prVar;
    }

    @Override
    public final void n() {
        pr prVar = this.f34260b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.f36635r, prVar, new z0(this, 24));
    }

    @Override
    public final void m() {
    }
}
