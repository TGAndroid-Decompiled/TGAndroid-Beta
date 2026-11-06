package org.telegram.ui;

import android.app.Activity;
public final class gq extends org.telegram.ui.Components.d10 {
    public final oq f46080j1;

    public gq(oq oqVar, Activity activity, oq oqVar2) {
        super(activity, oqVar2);
        this.f46080j1 = oqVar;
    }

    @Override
    public final void J0() {
        oq oqVar = this.f46080j1;
        oqVar.getMessagesController().S(oqVar.getParentActivity(), oqVar.f48498n, oqVar, new w0(this, 27));
    }

    @Override
    public final void I0() {
    }
}
