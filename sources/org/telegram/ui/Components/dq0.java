package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class dq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f23698a;
    public final AtomicReference f23699b;
    public final View f23700c;
    public final wq0 d;

    public dq0(wq0 wq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = wq0Var;
        this.f23698a = dialog;
        this.f23699b = atomicReference;
        this.f23700c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
