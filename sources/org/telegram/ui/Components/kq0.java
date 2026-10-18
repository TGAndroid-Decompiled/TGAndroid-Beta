package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f27957a;
    public final AtomicReference f27958b;
    public final View f27959c;
    public final dr0 d;

    public kq0(dr0 dr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = dr0Var;
        this.f27957a = dialog;
        this.f27958b = atomicReference;
        this.f27959c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
