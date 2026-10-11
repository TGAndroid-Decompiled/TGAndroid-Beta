package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class m81 implements Utilities.Callback {
    public final int f39870a;
    public final SessionsActivity f39871b;

    public m81(SessionsActivity sessionsActivity, int i10) {
        this.f39870a = i10;
        this.f39871b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39870a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f39871b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34535a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34535a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f39871b, (Boolean) obj);
                return;
        }
    }
}
