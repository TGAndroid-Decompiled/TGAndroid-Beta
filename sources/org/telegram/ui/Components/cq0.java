package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class cq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f23382a;
    public final AtomicReference f23383b;
    public final View f23384c;
    public final vq0 d;

    public cq0(vq0 vq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = vq0Var;
        this.f23382a = dialog;
        this.f23383b = atomicReference;
        this.f23384c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
