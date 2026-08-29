package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class g71 implements Utilities.Callback {
    public final int f38477a;
    public final SessionsActivity f38478b;

    public g71(SessionsActivity sessionsActivity, int i10) {
        this.f38477a = i10;
        this.f38478b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38477a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f38478b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f36238a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f36238a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f38478b, (Boolean) obj);
                return;
        }
    }
}
