package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class m81 implements Utilities.Callback {
    public final int f38620a;
    public final SessionsActivity f38621b;

    public m81(SessionsActivity sessionsActivity, int i10) {
        this.f38620a = i10;
        this.f38621b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38620a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f38621b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f34145a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f34145a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f38621b, (Boolean) obj);
                return;
        }
    }
}
