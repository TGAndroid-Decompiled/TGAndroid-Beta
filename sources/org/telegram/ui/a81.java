package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class a81 implements Utilities.Callback {
    public final int f35059a;
    public final SessionsActivity f35060b;

    public a81(SessionsActivity sessionsActivity, int i10) {
        this.f35059a = i10;
        this.f35060b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35059a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35060b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34817a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34817a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35060b, (Boolean) obj);
                return;
        }
    }
}
