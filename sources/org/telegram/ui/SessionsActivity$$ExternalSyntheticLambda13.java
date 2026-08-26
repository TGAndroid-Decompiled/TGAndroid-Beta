package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SessionsActivity$$ExternalSyntheticLambda13 implements RequestDelegate {
    public final int $r8$classId;
    public final SessionsActivity f$0;

    public SessionsActivity$$ExternalSyntheticLambda13(SessionsActivity sessionsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$4(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$createView$6(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$createView$9(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$createView$11(tLObject, tL_error);
                break;
        }
    }
}
