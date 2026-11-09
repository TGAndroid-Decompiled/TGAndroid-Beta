package org.telegram.ui;

import android.app.Activity;
public final class iq extends org.telegram.ui.Components.e10 {
    public final qq f46742j1;

    public iq(qq qqVar, Activity activity, qq qqVar2) {
        super(activity, qqVar2);
        this.f46742j1 = qqVar;
    }

    @Override
    public final void J0() {
        qq qqVar = this.f46742j1;
        qqVar.getMessagesController().S(qqVar.getParentActivity(), qqVar.f49144n, qqVar, new w0(this, 27));
    }

    @Override
    public final void I0() {
    }
}
