package org.telegram.ui;

import android.app.Activity;
public final class br extends org.telegram.ui.Components.u20 {
    public final jr f36128b;

    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.f36128b = jrVar;
    }

    @Override
    public final void n() {
        jr jrVar = this.f36128b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.f38653r, jrVar, new a1(this, 24));
    }

    @Override
    public final void m() {
    }
}
