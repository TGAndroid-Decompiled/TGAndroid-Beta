package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SessionsActivity$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final SessionsActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final boolean f$3;

    public SessionsActivity$$ExternalSyntheticLambda17(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadSessions$22(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$loadSessions$25(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
