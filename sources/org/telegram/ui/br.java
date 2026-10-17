package org.telegram.ui;

import android.app.Activity;
public final class br extends org.telegram.ui.Components.w20 {
    public final jr f35730b;

    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.f35730b = jrVar;
    }

    @Override
    public final void o() {
        jr jrVar = this.f35730b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.f38301r, jrVar, new b1(this, 24));
    }

    @Override
    public final void n() {
    }
}
