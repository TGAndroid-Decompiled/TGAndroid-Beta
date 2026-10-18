package org.telegram.ui;

import android.app.Activity;
public final class br extends org.telegram.ui.Components.w20 {
    public final jr f35749b;

    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.f35749b = jrVar;
    }

    @Override
    public final void o() {
        jr jrVar = this.f35749b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.f38310r, jrVar, new b1(this, 24));
    }

    @Override
    public final void n() {
    }
}
