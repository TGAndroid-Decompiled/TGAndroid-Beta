package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class b5 implements NotificationCenter.NotificationCenterDelegate {
    public final c5 f37974a;

    public b5(c5 c5Var) {
        this.f37974a = c5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c5 c5Var = this.f37974a;
        if (c5Var.f38265g && i10 == c5Var.e) {
            c5Var.b(objArr);
        }
    }
}
