package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class bq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f23040a;
    public final AtomicReference f23041b;
    public final View f23042c;
    public final uq0 d;

    public bq0(uq0 uq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = uq0Var;
        this.f23040a = dialog;
        this.f23041b = atomicReference;
        this.f23042c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
