package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class eq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f24035a;
    public final AtomicReference f24036b;
    public final View f24037c;
    public final xq0 d;

    public eq0(xq0 xq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = xq0Var;
        this.f24035a = dialog;
        this.f24036b = atomicReference;
        this.f24037c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
