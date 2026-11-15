package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class o21 implements org.telegram.messenger.z10 {
    public final int f49763a;
    public final SessionsActivity f49764b;

    public o21(SessionsActivity sessionsActivity, int i7) {
        this.f49763a = i7;
        this.f49764b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49763a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f49764b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f43331f = connectedbots.connected_bots;
                    if (sessionsActivity.f43327a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f43327a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f49764b, (Boolean) obj);
                return;
        }
    }
}
