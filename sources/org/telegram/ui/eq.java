package org.telegram.ui;

import android.app.Activity;
public final class eq extends org.telegram.ui.Components.a10 {
    public final nq k1;

    public eq(nq nqVar, Activity activity, nq nqVar2) {
        super(activity, nqVar2);
        this.k1 = nqVar;
    }

    @Override
    public final void J0() {
        nq nqVar = this.k1;
        nqVar.getMessagesController().S(nqVar.getParentActivity(), nqVar.f48074n, nqVar, new x0(this, 27));
    }

    @Override
    public final void I0() {
    }
}
