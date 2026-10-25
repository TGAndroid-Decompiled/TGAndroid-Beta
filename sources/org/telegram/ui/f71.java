package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class f71 implements Utilities.Callback {
    public final int f39295a;
    public final SessionsActivity f39296b;

    public f71(SessionsActivity sessionsActivity, int i10) {
        this.f39295a = i10;
        this.f39296b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39295a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f39296b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f36211f = connectedbots.connected_bots;
                    if (sessionsActivity.f36208a != null) {
                        sessionsActivity.n0();
                        sessionsActivity.f36208a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.W(this.f39296b, (Boolean) obj);
                return;
        }
    }
}
