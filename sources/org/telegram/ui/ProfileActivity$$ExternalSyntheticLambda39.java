package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda39 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public ProfileActivity$$ExternalSyntheticLambda39(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$editRow$146(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$editRow$152(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$editRow$134(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$editRow$129(this.f$1, this.f$2);
                break;
        }
    }
}
