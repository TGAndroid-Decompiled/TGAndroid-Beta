package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class tq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f33125a;
    public final AtomicReference f33126b;
    public final View f33127c;
    public final mr0 d;

    public tq0(mr0 mr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = mr0Var;
        this.f33125a = dialog;
        this.f33126b = atomicReference;
        this.f33127c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
