package org.telegram.ui;

import android.app.Activity;

public final class cr extends org.telegram.ui.Components.b20 {

    public final lr f37139b;

    public cr(lr lrVar, Activity activity, lr lrVar2) {
        super(activity, lrVar2);
        this.f37139b = lrVar;
    }

    @Override
    public final void n() {
        lr lrVar = this.f37139b;
        lrVar.getMessagesController().convertToGigaGroup(lrVar.getParentActivity(), lrVar.f40217r, lrVar, new c1(this, 24));
    }

    @Override
    public final void m() {
    }
}
