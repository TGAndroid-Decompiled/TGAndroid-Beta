package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class a5 implements NotificationCenter.NotificationCenterDelegate {
    public final b5 f35012a;

    public a5(b5 b5Var) {
        this.f35012a = b5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b5 b5Var = this.f35012a;
        if (b5Var.f35335g && i10 == b5Var.f35333e) {
            b5Var.b(objArr);
        }
    }
}
