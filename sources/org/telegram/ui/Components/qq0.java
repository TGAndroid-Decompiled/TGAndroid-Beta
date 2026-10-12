package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class qq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f28664a;
    public final AtomicReference f28665b;
    public final View f28666c;
    public final jr0 d;

    public qq0(jr0 jr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = jr0Var;
        this.f28664a = dialog;
        this.f28665b = atomicReference;
        this.f28666c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
