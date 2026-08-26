package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class SessionsActivity$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final SessionsActivity f$0;

    public SessionsActivity$$ExternalSyntheticLambda2(SessionsActivity sessionsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.f$0;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.bots = connectedbots.connected_bots;
                    if (sessionsActivity.listAdapter != null) {
                        sessionsActivity.updateRows$17();
                        sessionsActivity.listAdapter.mObservable.notifyChanged();
                    }
                    break;
                }
                break;
            default:
                this.f$0.lambda$createView$7((Boolean) obj);
                break;
        }
    }
}
