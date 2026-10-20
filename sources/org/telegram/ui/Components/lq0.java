package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class lq0 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Dialog f28249a;
    public final AtomicReference f28250b;
    public final View f28251c;
    public final fr0 d;

    public lq0(fr0 fr0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = fr0Var;
        this.f28249a = dialog;
        this.f28250b = atomicReference;
        this.f28251c = view;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lq0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
