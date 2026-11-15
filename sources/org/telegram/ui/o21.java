package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class o21 implements org.telegram.messenger.z10 {
    public final int f49773a;
    public final SessionsActivity f49774b;

    public o21(SessionsActivity sessionsActivity, int i7) {
        this.f49773a = i7;
        this.f49774b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49773a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f49774b;
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
                SessionsActivity.a0(this.f49774b, (Boolean) obj);
                return;
        }
    }
}
