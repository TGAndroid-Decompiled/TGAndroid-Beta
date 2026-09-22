package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class k81 implements Utilities.Callback {
    public final int f35083a;
    public final SessionsActivity f35084b;

    public k81(SessionsActivity sessionsActivity, int i10) {
        this.f35083a = i10;
        this.f35084b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35083a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35084b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31493a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31493a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35084b, (Boolean) obj);
                return;
        }
    }
}
