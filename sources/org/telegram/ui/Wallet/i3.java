package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.v61;
public final class i3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34316a;
    public final Object f34317b;

    public i3(Object obj, int i10) {
        this.f34316a = i10;
        this.f34317b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        v61 v61Var;
        int i12 = this.f34316a;
        Object obj = this.f34317b;
        switch (i12) {
            case 0:
                ((n3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.f34807n && (v61Var = r9Var.f32027a) != null) {
                    v61Var.W2.N(true);
                    return;
                }
                return;
        }
    }
}
