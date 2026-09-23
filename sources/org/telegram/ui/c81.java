package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class c81 implements Utilities.Callback {
    public final int f32290a;
    public final SessionsActivity f32291b;

    public c81(SessionsActivity sessionsActivity, int i10) {
        this.f32290a = i10;
        this.f32291b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32290a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f32291b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f31467a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f31467a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f32291b, (Boolean) obj);
                return;
        }
    }
}
