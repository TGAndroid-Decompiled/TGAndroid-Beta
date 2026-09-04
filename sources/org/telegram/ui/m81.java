package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class m81 implements Utilities.Callback {
    public final int f38593a;
    public final SessionsActivity f38594b;

    public m81(SessionsActivity sessionsActivity, int i10) {
        this.f38593a = i10;
        this.f38594b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38593a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f38594b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34118a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34118a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f38594b, (Boolean) obj);
                return;
        }
    }
}
