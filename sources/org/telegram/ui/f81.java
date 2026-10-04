package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class f81 implements Utilities.Callback {
    public final int f36215a;
    public final SessionsActivity f36216b;

    public f81(SessionsActivity sessionsActivity, int i10) {
        this.f36215a = i10;
        this.f36216b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36215a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f36216b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34464a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34464a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.T(this.f36216b, (Boolean) obj);
                return;
        }
    }
}
