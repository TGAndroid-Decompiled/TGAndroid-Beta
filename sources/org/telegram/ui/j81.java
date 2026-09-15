package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class j81 implements Utilities.Callback {
    public final int f34834a;
    public final SessionsActivity f34835b;

    public j81(SessionsActivity sessionsActivity, int i10) {
        this.f34834a = i10;
        this.f34835b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34834a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f34835b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31496a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31496a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f34835b, (Boolean) obj);
                return;
        }
    }
}
