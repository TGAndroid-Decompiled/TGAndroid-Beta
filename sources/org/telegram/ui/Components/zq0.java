package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f33474a;
    public final AtomicReference f33475b;
    public final View f33476c;
    public final sr0 d;

    public zq0(sr0 sr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = sr0Var;
        this.f33474a = dialog;
        this.f33475b = atomicReference;
        this.f33476c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
