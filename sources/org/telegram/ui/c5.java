package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class c5 implements NotificationCenter.NotificationCenterDelegate {
    public final d5 f36219a;

    public c5(d5 d5Var) {
        this.f36219a = d5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d5 d5Var = this.f36219a;
        if (d5Var.f36471g && i10 == d5Var.e) {
            d5Var.b(objArr);
        }
    }
}
