package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class h21 implements org.telegram.messenger.u10 {
    public final int f45789a;
    public final SessionsActivity f45790b;

    public h21(SessionsActivity sessionsActivity, int i3) {
        this.f45789a = i3;
        this.f45790b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45789a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f45790b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f41988f = connectedbots.connected_bots;
                    if (sessionsActivity.f41984a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f41984a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f45790b, (Boolean) obj);
                return;
        }
    }
}
