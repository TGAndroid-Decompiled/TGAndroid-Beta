package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class oq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f29360a;
    public final AtomicReference f29361b;
    public final View f29362c;
    public final hr0 d;

    public oq0(hr0 hr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = hr0Var;
        this.f29360a = dialog;
        this.f29361b = atomicReference;
        this.f29362c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
