package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class m81 implements Utilities.Callback {
    public final int f35651a;
    public final SessionsActivity f35652b;

    public m81(SessionsActivity sessionsActivity, int i10) {
        this.f35651a = i10;
        this.f35652b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35651a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35652b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31801a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31801a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35652b, (Boolean) obj);
                return;
        }
    }
}
