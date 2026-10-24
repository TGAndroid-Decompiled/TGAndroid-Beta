package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c71;
public final class h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34570a;
    public final Object f34571b;

    public h3(Object obj, int i10) {
        this.f34570a = i10;
        this.f34571b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        c71 c71Var;
        int i12 = this.f34570a;
        Object obj = this.f34571b;
        switch (i12) {
            case 0:
                ((m3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                s9 s9Var = (s9) obj;
                if (!s9Var.f35187n && (c71Var = s9Var.f25615a) != null) {
                    c71Var.Z2.N(true);
                    return;
                }
                return;
        }
    }
}
