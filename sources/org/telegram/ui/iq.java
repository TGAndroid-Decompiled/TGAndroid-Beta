package org.telegram.ui;

import android.app.Activity;
public final class iq extends org.telegram.ui.Components.h10 {
    public final qq n1;

    public iq(qq qqVar, Activity activity, qq qqVar2) {
        super(activity, qqVar2);
        this.n1 = qqVar;
    }

    @Override
    public final void J0() {
        qq qqVar = this.n1;
        qqVar.getMessagesController().S(qqVar.getParentActivity(), qqVar.f50737n, qqVar, new w0(this, 27));
    }

    @Override
    public final void I0() {
    }
}
