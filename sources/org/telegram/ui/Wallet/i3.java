package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.w61;
public final class i3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34324a;
    public final Object f34325b;

    public i3(Object obj, int i10) {
        this.f34324a = i10;
        this.f34325b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        w61 w61Var;
        int i12 = this.f34324a;
        Object obj = this.f34325b;
        switch (i12) {
            case 0:
                ((n3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.f34815n && (w61Var = r9Var.f32355a) != null) {
                    w61Var.W2.N(true);
                    return;
                }
                return;
        }
    }
}
