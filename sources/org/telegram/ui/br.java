package org.telegram.ui;

import android.app.Activity;
public final class br extends org.telegram.ui.Components.w20 {
    public final jr f36157b;

    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.f36157b = jrVar;
    }

    @Override
    public final void n() {
        jr jrVar = this.f36157b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.f38665r, jrVar, new a1(this, 24));
    }

    @Override
    public final void m() {
    }
}
