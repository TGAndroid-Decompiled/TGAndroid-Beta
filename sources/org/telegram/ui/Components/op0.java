package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class op0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f26830a;
    public final AtomicReference f26831b;
    public final View f26832c;
    public final hq0 d;

    public op0(hq0 hq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = hq0Var;
        this.f26830a = dialog;
        this.f26831b = atomicReference;
        this.f26832c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
