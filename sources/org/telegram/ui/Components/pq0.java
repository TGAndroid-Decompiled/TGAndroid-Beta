package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class pq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f28095a;
    public final AtomicReference f28096b;
    public final View f28097c;
    public final ir0 d;

    public pq0(ir0 ir0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = ir0Var;
        this.f28095a = dialog;
        this.f28096b = atomicReference;
        this.f28097c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
