package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class c71 implements Utilities.Callback {
    public final int f35870a;
    public final SessionsActivity f35871b;

    public c71(SessionsActivity sessionsActivity, int i10) {
        this.f35870a = i10;
        this.f35871b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35870a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f35871b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f33829a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f33829a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f35871b, (Boolean) obj);
                return;
        }
    }
}
