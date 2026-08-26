package org.telegram.ui;

public final class InviteContactsActivity$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final InviteContactsActivity f$0;

    public InviteContactsActivity$$ExternalSyntheticLambda2(InviteContactsActivity inviteContactsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = inviteContactsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$2();
                break;
            default:
                this.f$0.lambda$createView$3();
                break;
        }
    }
}
