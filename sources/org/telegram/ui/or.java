package org.telegram.ui;

import android.app.Activity;
public final class or extends org.telegram.ui.Components.w20 {
    public final wr f35587b;

    public or(wr wrVar, Activity activity, wr wrVar2) {
        super(activity, wrVar2);
        this.f35587b = wrVar;
    }

    @Override
    public final void n() {
        wr wrVar = this.f35587b;
        wrVar.getMessagesController().convertToGigaGroup(wrVar.getParentActivity(), wrVar.f38354r, wrVar, new a1(this, 24));
    }

    @Override
    public final void m() {
    }
}
