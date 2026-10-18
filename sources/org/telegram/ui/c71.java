package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class c71 implements Utilities.Callback {
    public final int f35883a;
    public final SessionsActivity f35884b;

    public c71(SessionsActivity sessionsActivity, int i10) {
        this.f35883a = i10;
        this.f35884b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35883a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35884b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f33836a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f33836a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35884b, (Boolean) obj);
                return;
        }
    }
}
