package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class SessionsActivity$$ExternalSyntheticLambda3 implements Utilities.Callback {
    public final int $r8$classId;
    public final SessionsActivity f$0;

    public SessionsActivity$$ExternalSyntheticLambda3(SessionsActivity sessionsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$7((Boolean) obj);
                break;
            default:
                this.f$0.lambda$onFragmentCreate$0((TL_account.connectedBots) obj);
                break;
        }
    }
}
