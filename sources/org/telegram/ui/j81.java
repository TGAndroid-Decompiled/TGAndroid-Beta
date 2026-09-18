package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class j81 implements Utilities.Callback {
    public final int f34727a;
    public final SessionsActivity f34728b;

    public j81(SessionsActivity sessionsActivity, int i10) {
        this.f34727a = i10;
        this.f34728b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34727a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f34728b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31740a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31740a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f34728b, (Boolean) obj);
                return;
        }
    }
}
