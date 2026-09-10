package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class yp0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f29474a;
    public final AtomicReference f29475b;
    public final View f29476c;
    public final sq0 d;

    public yp0(sq0 sq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = sq0Var;
        this.f29474a = dialog;
        this.f29475b = atomicReference;
        this.f29476c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yp0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
