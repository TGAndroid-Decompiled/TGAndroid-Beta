package org.telegram.ui;

import android.app.Activity;
public final class ir extends org.telegram.ui.Components.p20 {
    public final qr f37919b;

    public ir(qr qrVar, Activity activity, qr qrVar2) {
        super(activity, qrVar2);
        this.f37919b = qrVar;
    }

    @Override
    public final void n() {
        qr qrVar = this.f37919b;
        qrVar.getMessagesController().convertToGigaGroup(qrVar.getParentActivity(), qrVar.f40637r, qrVar, new a1(this, 24));
    }

    @Override
    public final void m() {
    }
}
