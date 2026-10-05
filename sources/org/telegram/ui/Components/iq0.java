package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class iq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f27564a;
    public final AtomicReference f27565b;
    public final View f27566c;
    public final br0 d;

    public iq0(br0 br0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = br0Var;
        this.f27564a = dialog;
        this.f27565b = atomicReference;
        this.f27566c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
