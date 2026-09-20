package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class m81 implements Utilities.Callback {
    public final int f35628a;
    public final SessionsActivity f35629b;

    public m81(SessionsActivity sessionsActivity, int i10) {
        this.f35628a = i10;
        this.f35629b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35628a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35629b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31780a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31780a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35629b, (Boolean) obj);
                return;
        }
    }
}
