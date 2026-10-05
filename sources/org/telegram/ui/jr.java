package org.telegram.ui;

import android.app.Activity;
public final class jr extends org.telegram.ui.Components.r20 {
    public final rr f37754b;

    public jr(rr rrVar, Activity activity, rr rrVar2) {
        super(activity, rrVar2);
        this.f37754b = rrVar;
    }

    @Override
    public final void n() {
        rr rrVar = this.f37754b;
        rrVar.getMessagesController().convertToGigaGroup(rrVar.getParentActivity(), rrVar.f40202r, rrVar, new z0(this, 26));
    }

    @Override
    public final void m() {
    }
}
