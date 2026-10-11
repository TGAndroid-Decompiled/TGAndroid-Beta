package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class uq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f31710a;
    public final AtomicReference f31711b;
    public final View f31712c;
    public final nr0 d;

    public uq0(nr0 nr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = nr0Var;
        this.f31710a = dialog;
        this.f31711b = atomicReference;
        this.f31712c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
