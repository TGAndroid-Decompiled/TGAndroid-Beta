package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$15$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final ProfileActivity.AnonymousClass15 f$0;

    public ProfileActivity$15$$ExternalSyntheticLambda1(ProfileActivity.AnonymousClass15 anonymousClass15, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass15;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onItemClick$0(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$onItemClick$1(tLObject, tL_error);
                break;
        }
    }
}
