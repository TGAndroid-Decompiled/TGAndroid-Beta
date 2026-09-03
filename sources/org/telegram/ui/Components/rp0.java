package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class rp0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f28554a;
    public final AtomicReference f28555b;
    public final View f28556c;
    public final lq0 d;

    public rp0(lq0 lq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = lq0Var;
        this.f28554a = dialog;
        this.f28555b = atomicReference;
        this.f28556c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rp0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
