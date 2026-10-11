package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class vq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f32464a;
    public final AtomicReference f32465b;
    public final View f32466c;
    public final or0 d;

    public vq0(or0 or0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = or0Var;
        this.f32464a = dialog;
        this.f32465b = atomicReference;
        this.f32466c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
