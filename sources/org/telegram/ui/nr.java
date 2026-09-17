package org.telegram.ui;

import android.app.Activity;
public final class nr extends org.telegram.ui.Components.n20 {
    public final vr f39009b;

    public nr(vr vrVar, Activity activity, vr vrVar2) {
        super(activity, vrVar2);
        this.f39009b = vrVar;
    }

    @Override
    public final void n() {
        vr vrVar = this.f39009b;
        vrVar.getMessagesController().convertToGigaGroup(vrVar.getParentActivity(), vrVar.f41668r, vrVar, new z0(this, 24));
    }

    @Override
    public final void m() {
    }
}
