package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f33476a;
    public final AtomicReference f33477b;
    public final View f33478c;
    public final sr0 d;

    public zq0(sr0 sr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = sr0Var;
        this.f33476a = dialog;
        this.f33477b = atomicReference;
        this.f33478c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
