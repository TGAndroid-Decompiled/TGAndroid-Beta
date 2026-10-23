package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class e71 implements Utilities.Callback {
    public final int f36844a;
    public final SessionsActivity f36845b;

    public e71(SessionsActivity sessionsActivity, int i10) {
        this.f36844a = i10;
        this.f36845b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36844a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f36845b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f34148f = connectedbots.connected_bots;
                    if (sessionsActivity.f34145a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34145a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f36845b, (Boolean) obj);
                return;
        }
    }
}
