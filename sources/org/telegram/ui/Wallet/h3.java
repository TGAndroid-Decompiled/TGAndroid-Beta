package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.m71;
public final class h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f36653a;
    public final Object f36654b;

    public h3(Object obj, int i10) {
        this.f36653a = i10;
        this.f36654b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        m71 m71Var;
        int i12 = this.f36653a;
        Object obj = this.f36654b;
        switch (i12) {
            case 0:
                ((m3) obj).getClass();
                int i13 = NotificationCenter.didReceiveNewMessages;
                return;
            default:
                r9 r9Var = (r9) obj;
                if (!r9Var.f37226r && (m71Var = r9Var.f30764a) != null) {
                    m71Var.f32504g3.O(true);
                    return;
                }
                return;
        }
    }
}
