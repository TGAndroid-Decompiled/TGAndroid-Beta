package org.telegram.ui;

public final class InviteContactsActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final InviteContactsActivity f$0;

    public InviteContactsActivity$$ExternalSyntheticLambda4(InviteContactsActivity inviteContactsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = inviteContactsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                InviteContactsActivity inviteContactsActivity = this.f$0;
                inviteContactsActivity.listView.postOnAnimation(new InviteContactsActivity$$ExternalSyntheticLambda4(inviteContactsActivity, 1));
                break;
            default:
                this.f$0.blur3_InvalidateBlur$6();
                break;
        }
    }
}
