package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class d81 implements Utilities.Callback {
    public final int f35714a;
    public final SessionsActivity f35715b;

    public d81(SessionsActivity sessionsActivity, int i10) {
        this.f35714a = i10;
        this.f35715b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35714a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35715b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34483a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34483a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.T(this.f35715b, (Boolean) obj);
                return;
        }
    }
}
