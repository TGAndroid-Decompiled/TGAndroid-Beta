package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final TLRPC.User f$1;

    public ProfileActivity$$ExternalSyntheticLambda8(ProfileActivity profileActivity, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processOnClickOrPress$73(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processOnClickOrPress$75(this.f$1);
                break;
            case 2:
                this.f$0.lambda$processOnClickOrPress$76(this.f$1);
                break;
            case 3:
                this.f$0.lambda$onMemberClick$59(this.f$1);
                break;
            default:
                this.f$0.lambda$processOnClickOrPress$74(this.f$1);
                break;
        }
    }
}
