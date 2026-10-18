package org.telegram.ui;

import android.app.Activity;
public final class br extends org.telegram.ui.Components.w20 {
    public final jr f35703b;

    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.f35703b = jrVar;
    }

    @Override
    public final void o() {
        jr jrVar = this.f35703b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.f38295r, jrVar, new b1(this, 24));
    }

    @Override
    public final void n() {
    }
}
