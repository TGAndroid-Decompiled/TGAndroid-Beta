package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class d71 implements Utilities.Callback {

    public final int f37295a;

    public final SessionsActivity f37296b;

    public d71(SessionsActivity sessionsActivity, int i10) {
        this.f37295a = i10;
        this.f37296b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37295a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f37296b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f36176a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f36176a.l();
                    }
                    break;
                }
                break;
            default:
                SessionsActivity.V(this.f37296b, (Boolean) obj);
                break;
        }
    }
}
