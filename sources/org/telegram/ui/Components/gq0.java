package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class gq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f26909a;
    public final AtomicReference f26910b;
    public final View f26911c;
    public final zq0 d;

    public gq0(zq0 zq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = zq0Var;
        this.f26909a = dialog;
        this.f26910b = atomicReference;
        this.f26911c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
