package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class d71 implements Utilities.Callback {
    public final int f36495a;
    public final SessionsActivity f36496b;

    public d71(SessionsActivity sessionsActivity, int i10) {
        this.f36495a = i10;
        this.f36496b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36495a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f36496b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f34150f = connectedbots.connected_bots;
                    if (sessionsActivity.f34147a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34147a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f36496b, (Boolean) obj);
                return;
        }
    }
}
