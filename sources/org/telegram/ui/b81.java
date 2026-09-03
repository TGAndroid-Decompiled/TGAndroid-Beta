package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class b81 implements Utilities.Callback {
    public final int f32770a;
    public final SessionsActivity f32771b;

    public b81(SessionsActivity sessionsActivity, int i10) {
        this.f32770a = i10;
        this.f32771b = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32770a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f32771b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.f32255a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.f32255a.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                SessionsActivity.V(this.f32771b, (Boolean) obj);
                return;
        }
    }
}
