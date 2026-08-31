package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class tp0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f31433a;
    public final AtomicReference f31434b;
    public final View f31435c;
    public final mq0 d;

    public tp0(mq0 mq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = mq0Var;
        this.f31433a = dialog;
        this.f31434b = atomicReference;
        this.f31435c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tp0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
