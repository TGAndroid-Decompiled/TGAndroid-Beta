package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class d81 implements Utilities.Callback {
    public final int f33056a;
    public final SessionsActivity f33057b;

    public d81(SessionsActivity sessionsActivity, int i10) {
        this.f33056a = i10;
        this.f33057b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33056a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f33057b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31781a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31781a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f33057b, (Boolean) obj);
                return;
        }
    }
}
