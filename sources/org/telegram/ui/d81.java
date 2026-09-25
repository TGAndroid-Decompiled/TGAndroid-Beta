package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class d81 implements Utilities.Callback {
    public final int f33058a;
    public final SessionsActivity f33059b;

    public d81(SessionsActivity sessionsActivity, int i10) {
        this.f33058a = i10;
        this.f33059b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33058a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f33059b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31783a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31783a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f33059b, (Boolean) obj);
                return;
        }
    }
}
