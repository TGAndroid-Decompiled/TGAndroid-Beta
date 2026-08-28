package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class e71 implements Utilities.Callback {
    public final int f37837a;
    public final SessionsActivity f37838b;

    public e71(SessionsActivity sessionsActivity, int i9) {
        this.f37837a = i9;
        this.f37838b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37837a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f37838b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f36173a != null) {
                        sessionsActivity.l0();
                        sessionsActivity.f36173a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.U(this.f37838b, (Boolean) obj);
                return;
        }
    }
}
