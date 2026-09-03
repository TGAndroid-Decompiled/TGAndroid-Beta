package org.telegram.ui;

import android.app.Activity;
public final class jr extends org.telegram.ui.Components.p20 {
    public final rr f35352b;

    public jr(rr rrVar, Activity activity, rr rrVar2) {
        super(activity, rrVar2);
        this.f35352b = rrVar;
    }

    @Override
    public final void n() {
        rr rrVar = this.f35352b;
        rrVar.getMessagesController().convertToGigaGroup(rrVar.getParentActivity(), rrVar.f37992r, rrVar, new c1(this, 24));
    }

    @Override
    public final void m() {
    }
}
