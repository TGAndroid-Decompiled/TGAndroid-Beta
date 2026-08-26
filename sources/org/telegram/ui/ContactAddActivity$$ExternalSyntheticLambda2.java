package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ContactAddActivity$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ContactAddActivity f$0;
    public final TLRPC.User f$1;

    public ContactAddActivity$$ExternalSyntheticLambda2(ContactAddActivity contactAddActivity, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = contactAddActivity;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fillItems$15(this.f$1);
                break;
            default:
                this.f$0.lambda$createView$9(this.f$1);
                break;
        }
    }
}
