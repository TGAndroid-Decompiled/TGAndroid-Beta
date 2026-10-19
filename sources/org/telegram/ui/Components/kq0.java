package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f27937a;
    public final AtomicReference f27938b;
    public final View f27939c;
    public final er0 d;

    public kq0(er0 er0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = er0Var;
        this.f27937a = dialog;
        this.f27938b = atomicReference;
        this.f27939c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
