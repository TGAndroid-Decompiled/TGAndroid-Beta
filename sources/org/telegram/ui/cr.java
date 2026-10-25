package org.telegram.ui;

import android.app.Activity;
public final class cr extends org.telegram.ui.Components.y20 {
    public final kr f38510b;

    public cr(kr krVar, Activity activity, kr krVar2) {
        super(activity, krVar2);
        this.f38510b = krVar;
    }

    @Override
    public final void n() {
        kr krVar = this.f38510b;
        krVar.getMessagesController().convertToGigaGroup(krVar.getParentActivity(), krVar.f41029n, krVar, new y0(this, 26));
    }

    @Override
    public final void m() {
    }
}
