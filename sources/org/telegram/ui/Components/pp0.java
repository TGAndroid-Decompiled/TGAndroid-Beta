package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class pp0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f27106a;
    public final AtomicReference f27107b;
    public final View f27108c;
    public final iq0 d;

    public pp0(iq0 iq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = iq0Var;
        this.f27106a = dialog;
        this.f27107b = atomicReference;
        this.f27108c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pp0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
