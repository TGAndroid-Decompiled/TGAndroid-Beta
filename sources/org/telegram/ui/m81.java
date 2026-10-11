package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class m81 implements Utilities.Callback {
    public final int f39836a;
    public final SessionsActivity f39837b;

    public m81(SessionsActivity sessionsActivity, int i10) {
        this.f39836a = i10;
        this.f39837b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39836a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f39837b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34501a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34501a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f39837b, (Boolean) obj);
                return;
        }
    }
}
