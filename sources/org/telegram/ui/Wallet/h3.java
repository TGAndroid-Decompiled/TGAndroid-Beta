package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d71;
public final class h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34568a;
    public final Object f34569b;

    public h3(Object obj, int i10) {
        this.f34568a = i10;
        this.f34569b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        d71 d71Var;
        int i12 = this.f34568a;
        Object obj = this.f34569b;
        switch (i12) {
            case 0:
                ((m3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                s9 s9Var = (s9) obj;
                if (!s9Var.f35185n && (d71Var = s9Var.f25907a) != null) {
                    d71Var.Z2.N(true);
                    return;
                }
                return;
        }
    }
}
