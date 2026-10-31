package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class i41 implements org.telegram.messenger.q20 {
    public final int f38173a;
    public final SessionsActivity f38174b;

    public i41(SessionsActivity sessionsActivity, int i10) {
        this.f38173a = i10;
        this.f38174b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f38173a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f38174b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f34037f = connectedbots.connected_bots;
                    if (sessionsActivity.f34034a != null) {
                        sessionsActivity.q0();
                        sessionsActivity.f34034a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.Z(this.f38174b, (Boolean) obj);
                return;
        }
    }
}
