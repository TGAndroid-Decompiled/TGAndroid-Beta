package org.telegram.ui;

import android.app.Activity;
public final class ir extends org.telegram.ui.Components.q20 {
    public final qr f34521b;

    public ir(qr qrVar, Activity activity, qr qrVar2) {
        super(activity, qrVar2);
        this.f34521b = qrVar;
    }

    @Override
    public final void n() {
        qr qrVar = this.f34521b;
        qrVar.getMessagesController().convertToGigaGroup(qrVar.getParentActivity(), qrVar.f36854r, qrVar, new a1(this, 26));
    }

    @Override
    public final void m() {
    }
}
