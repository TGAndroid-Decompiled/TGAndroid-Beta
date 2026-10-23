package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class a71 implements Utilities.Callback {
    public final int f35305a;
    public final SessionsActivity f35306b;

    public a71(SessionsActivity sessionsActivity, int i10) {
        this.f35305a = i10;
        this.f35306b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35305a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35306b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f33848a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f33848a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35306b, (Boolean) obj);
                return;
        }
    }
}
