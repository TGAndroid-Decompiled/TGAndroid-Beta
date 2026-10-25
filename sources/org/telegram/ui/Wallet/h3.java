package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l71;
public final class h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f36625a;
    public final Object f36626b;

    public h3(Object obj, int i10) {
        this.f36625a = i10;
        this.f36626b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        l71 l71Var;
        int i12 = this.f36625a;
        Object obj = this.f36626b;
        switch (i12) {
            case 0:
                ((m3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.f37199r && (l71Var = r9Var.f30417a) != null) {
                    l71Var.f32150g3.O(true);
                    return;
                }
                return;
        }
    }
}
