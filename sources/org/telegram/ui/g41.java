package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class g41 implements org.telegram.messenger.r20 {
    public final int f37349a;
    public final SessionsActivity f37350b;

    public g41(SessionsActivity sessionsActivity, int i10) {
        this.f37349a = i10;
        this.f37350b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f37349a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f37350b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f34044f = connectedbots.connected_bots;
                    if (sessionsActivity.f34041a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.f34041a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.a0(this.f37350b, (Boolean) obj);
                return;
        }
    }
}
