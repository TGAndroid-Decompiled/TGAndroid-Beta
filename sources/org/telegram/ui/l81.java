package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class l81 implements Utilities.Callback {
    public final int f35479a;
    public final SessionsActivity f35480b;

    public l81(SessionsActivity sessionsActivity, int i10) {
        this.f35479a = i10;
        this.f35480b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35479a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35480b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31509a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31509a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35480b, (Boolean) obj);
                return;
        }
    }
}
