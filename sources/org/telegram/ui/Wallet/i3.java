package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.w61;
public final class i3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34329a;
    public final Object f34330b;

    public i3(Object obj, int i10) {
        this.f34329a = i10;
        this.f34330b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        w61 w61Var;
        int i12 = this.f34329a;
        Object obj = this.f34330b;
        switch (i12) {
            case 0:
                ((n3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.f34820n && (w61Var = r9Var.f32360a) != null) {
                    w61Var.W2.N(true);
                    return;
                }
                return;
        }
    }
}
