package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class n81 implements Utilities.Callback {
    public final int f40101a;
    public final SessionsActivity f40102b;

    public n81(SessionsActivity sessionsActivity, int i10) {
        this.f40101a = i10;
        this.f40102b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40101a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f40102b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34473a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34473a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f40102b, (Boolean) obj);
                return;
        }
    }
}
