package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class f81 implements Utilities.Callback {
    public final int f36220a;
    public final SessionsActivity f36221b;

    public f81(SessionsActivity sessionsActivity, int i10) {
        this.f36220a = i10;
        this.f36221b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36220a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f36221b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34470a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34470a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.T(this.f36221b, (Boolean) obj);
                return;
        }
    }
}
