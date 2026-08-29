package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class jp0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f29781a;
    public final AtomicReference f29782b;
    public final View f29783c;
    public final dq0 d;

    public jp0(dq0 dq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = dq0Var;
        this.f29781a = dialog;
        this.f29782b = atomicReference;
        this.f29783c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
