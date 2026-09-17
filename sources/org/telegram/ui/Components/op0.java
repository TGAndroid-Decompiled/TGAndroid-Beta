package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class op0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f29184a;
    public final AtomicReference f29185b;
    public final View f29186c;
    public final hq0 d;

    public op0(hq0 hq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = hq0Var;
        this.f29184a = dialog;
        this.f29185b = atomicReference;
        this.f29186c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
