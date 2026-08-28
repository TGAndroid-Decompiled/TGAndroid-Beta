package org.telegram.ui;

import android.app.Activity;
public final class ar extends org.telegram.ui.Components.y10 {
    public final jr f36538b;

    public ar(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.f36538b = jrVar;
    }

    @Override
    public final void n() {
        jr jrVar = this.f36538b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.f39595r, jrVar, new b1(this, 24));
    }

    @Override
    public final void m() {
    }
}
