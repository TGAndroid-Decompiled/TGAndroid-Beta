package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda27 implements RequestDelegate {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda27(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$editRow$130(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$createView$34(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$editRow$147(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$editRow$153(tLObject, tL_error);
                break;
            case 4:
                this.f$0.lambda$onFragmentCreate$1(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$editRow$135(tLObject, tL_error);
                break;
        }
    }
}
