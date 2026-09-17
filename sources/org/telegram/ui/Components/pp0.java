package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class pp0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f27103a;
    public final AtomicReference f27104b;
    public final View f27105c;
    public final iq0 d;

    public pp0(iq0 iq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = iq0Var;
        this.f27103a = dialog;
        this.f27104b = atomicReference;
        this.f27105c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pp0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
