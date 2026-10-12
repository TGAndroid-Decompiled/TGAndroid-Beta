package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class q81 implements Utilities.Callback {
    public final int f41217a;
    public final SessionsActivity f41218b;

    public q81(SessionsActivity sessionsActivity, int i10) {
        this.f41217a = i10;
        this.f41218b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41217a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f41218b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34312a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34312a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f41218b, (Boolean) obj);
                return;
        }
    }
}
