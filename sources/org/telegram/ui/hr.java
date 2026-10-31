package org.telegram.ui;

import android.app.Activity;
public final class hr extends org.telegram.ui.Components.t10 {
    public final pr f38018j1;

    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.f38018j1 = prVar;
    }

    @Override
    public final void J0() {
        pr prVar = this.f38018j1;
        prVar.getMessagesController().S(prVar.getParentActivity(), prVar.f40746n, prVar, new y0(this, 26));
    }

    @Override
    public final void I0() {
    }
}
