package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class q81 implements Utilities.Callback {
    public final int f41213a;
    public final SessionsActivity f41214b;

    public q81(SessionsActivity sessionsActivity, int i10) {
        this.f41213a = i10;
        this.f41214b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41213a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f41214b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34310a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34310a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f41214b, (Boolean) obj);
                return;
        }
    }
}
