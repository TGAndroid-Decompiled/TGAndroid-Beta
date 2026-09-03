package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class sp0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f31159a;
    public final AtomicReference f31160b;
    public final View f31161c;
    public final lq0 d;

    public sp0(lq0 lq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = lq0Var;
        this.f31159a = dialog;
        this.f31160b = atomicReference;
        this.f31161c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
