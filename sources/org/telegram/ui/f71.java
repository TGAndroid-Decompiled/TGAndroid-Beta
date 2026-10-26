package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class f71 implements Utilities.Callback {
    public final int f39298a;
    public final SessionsActivity f39299b;

    public f71(SessionsActivity sessionsActivity, int i10) {
        this.f39298a = i10;
        this.f39299b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39298a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f39299b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f36214f = connectedbots.connected_bots;
                    if (sessionsActivity.f36211a != null) {
                        sessionsActivity.n0();
                        sessionsActivity.f36211a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.W(this.f39299b, (Boolean) obj);
                return;
        }
    }
}
