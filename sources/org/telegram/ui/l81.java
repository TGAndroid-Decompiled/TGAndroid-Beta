package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class l81 implements Utilities.Callback {
    public final int f35484a;
    public final SessionsActivity f35485b;

    public l81(SessionsActivity sessionsActivity, int i10) {
        this.f35484a = i10;
        this.f35485b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35484a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35485b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31513a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31513a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35485b, (Boolean) obj);
                return;
        }
    }
}
