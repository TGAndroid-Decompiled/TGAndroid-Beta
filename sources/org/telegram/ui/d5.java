package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class d5 implements NotificationCenter.NotificationCenterDelegate {
    public final e5 f36265a;

    public d5(e5 e5Var) {
        this.f36265a = e5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e5 e5Var = this.f36265a;
        if (e5Var.f36553g && i10 == e5Var.e) {
            e5Var.b(objArr);
        }
    }
}
