package org.telegram.ui;

public final class GroupCreateActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final GroupCreateActivity f$0;

    public GroupCreateActivity$$ExternalSyntheticLambda7(GroupCreateActivity groupCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$9();
                break;
            case 1:
                this.f$0.finishFragment();
                break;
            case 2:
                this.f$0.lambda$showPremiumBlockedToast$10();
                break;
            default:
                this.f$0.lambda$createView$8();
                break;
        }
    }
}
