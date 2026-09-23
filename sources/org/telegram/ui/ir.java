package org.telegram.ui;

import android.app.Activity;
public final class ir extends org.telegram.ui.Components.o20 {
    public final qr f34231b;

    public ir(qr qrVar, Activity activity, qr qrVar2) {
        super(activity, qrVar2);
        this.f34231b = qrVar;
    }

    @Override
    public final void n() {
        qr qrVar = this.f34231b;
        qrVar.getMessagesController().convertToGigaGroup(qrVar.getParentActivity(), qrVar.f36582r, qrVar, new z0(this, 24));
    }

    @Override
    public final void m() {
    }
}
