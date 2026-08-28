package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class yo0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f35043a;
    public final AtomicReference f35044b;
    public final View f35045c;
    public final rp0 d;

    public yo0(rp0 rp0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = rp0Var;
        this.f35043a = dialog;
        this.f35044b = atomicReference;
        this.f35045c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yo0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
