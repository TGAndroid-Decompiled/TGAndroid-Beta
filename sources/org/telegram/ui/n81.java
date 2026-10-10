package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class n81 implements Utilities.Callback {
    public final int f40147a;
    public final SessionsActivity f40148b;

    public n81(SessionsActivity sessionsActivity, int i10) {
        this.f40147a = i10;
        this.f40148b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40147a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f40148b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34511a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34511a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f40148b, (Boolean) obj);
                return;
        }
    }
}
