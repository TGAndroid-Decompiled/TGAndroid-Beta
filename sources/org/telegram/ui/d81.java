package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class d81 implements Utilities.Callback {
    public final int f33057a;
    public final SessionsActivity f33058b;

    public d81(SessionsActivity sessionsActivity, int i10) {
        this.f33057a = i10;
        this.f33058b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33057a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f33058b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31782a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31782a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f33058b, (Boolean) obj);
                return;
        }
    }
}
