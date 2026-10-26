package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l71;
public final class h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f36628a;
    public final Object f36629b;

    public h3(Object obj, int i10) {
        this.f36628a = i10;
        this.f36629b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        l71 l71Var;
        int i12 = this.f36628a;
        Object obj = this.f36629b;
        switch (i12) {
            case 0:
                ((m3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.f37202r && (l71Var = r9Var.f30419a) != null) {
                    l71Var.f32152g3.O(true);
                    return;
                }
                return;
        }
    }
}
