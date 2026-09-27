package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class a5 implements NotificationCenter.NotificationCenterDelegate {
    public final b5 f31967a;

    public a5(b5 b5Var) {
        this.f31967a = b5Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b5 b5Var = this.f31967a;
        if (b5Var.f32241g && i10 == b5Var.e) {
            b5Var.b(objArr);
        }
    }
}
