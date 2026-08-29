package org.telegram.ui;

import android.app.Activity;
public final class br extends org.telegram.ui.Components.j20 {
    public final jr f36891b;

    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.f36891b = jrVar;
    }

    @Override
    public final void n() {
        jr jrVar = this.f36891b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.f39656r, jrVar, new c1(this, 24));
    }

    @Override
    public final void m() {
    }
}
