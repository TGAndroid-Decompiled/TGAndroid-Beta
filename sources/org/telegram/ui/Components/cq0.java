package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class cq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f23376a;
    public final AtomicReference f23377b;
    public final View f23378c;
    public final vq0 d;

    public cq0(vq0 vq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = vq0Var;
        this.f23376a = dialog;
        this.f23377b = atomicReference;
        this.f23378c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
