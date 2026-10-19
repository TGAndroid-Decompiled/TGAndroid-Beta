package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class a71 implements Utilities.Callback {
    public final int f35292a;
    public final SessionsActivity f35293b;

    public a71(SessionsActivity sessionsActivity, int i10) {
        this.f35292a = i10;
        this.f35293b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35292a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35293b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f33835a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f33835a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35293b, (Boolean) obj);
                return;
        }
    }
}
