package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class p81 implements Utilities.Callback {
    public final int f35707a;
    public final SessionsActivity f35708b;

    public p81(SessionsActivity sessionsActivity, int i10) {
        this.f35707a = i10;
        this.f35708b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35707a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35708b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f30608a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f30608a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35708b, (Boolean) obj);
                return;
        }
    }
}
