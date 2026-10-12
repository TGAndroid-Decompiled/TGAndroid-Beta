package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class b5 implements NotificationCenter.NotificationCenterDelegate {
    public final c5 f36068a;

    public b5(c5 c5Var) {
        this.f36068a = c5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c5 c5Var = this.f36068a;
        if (c5Var.f36327g && i10 == c5Var.f36325e) {
            c5Var.b(objArr);
        }
    }
}
