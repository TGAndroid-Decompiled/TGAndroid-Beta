package org.telegram.ui;

import android.app.Activity;
public final class nr extends org.telegram.ui.Components.n20 {
    public final vr f39008b;

    public nr(vr vrVar, Activity activity, vr vrVar2) {
        super(activity, vrVar2);
        this.f39008b = vrVar;
    }

    @Override
    public final void n() {
        vr vrVar = this.f39008b;
        vrVar.getMessagesController().convertToGigaGroup(vrVar.getParentActivity(), vrVar.f41667r, vrVar, new z0(this, 24));
    }

    @Override
    public final void m() {
    }
}
