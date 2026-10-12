package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class b5 implements NotificationCenter.NotificationCenterDelegate {
    public final c5 f36070a;

    public b5(c5 c5Var) {
        this.f36070a = c5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c5 c5Var = this.f36070a;
        if (c5Var.f36329g && i10 == c5Var.f36327e) {
            c5Var.b(objArr);
        }
    }
}
