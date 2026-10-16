package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class c5 implements NotificationCenter.NotificationCenterDelegate {
    public final d5 f34456a;

    public c5(d5 d5Var) {
        this.f34456a = d5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d5 d5Var = this.f34456a;
        if (d5Var.f34879g && i10 == d5Var.e) {
            d5Var.b(objArr);
        }
    }
}
