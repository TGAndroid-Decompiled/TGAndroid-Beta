package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class pq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f29637a;
    public final AtomicReference f29638b;
    public final View f29639c;
    public final ir0 d;

    public pq0(ir0 ir0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = ir0Var;
        this.f29637a = dialog;
        this.f29638b = atomicReference;
        this.f29639c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
