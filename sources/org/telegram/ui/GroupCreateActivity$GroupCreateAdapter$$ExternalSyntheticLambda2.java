package org.telegram.ui;

public final class GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final GroupCreateActivity.GroupCreateAdapter f$0;
    public final String f$1;

    public GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2(GroupCreateActivity.GroupCreateAdapter groupCreateAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchDialogs$4(this.f$1);
                break;
            case 1:
                this.f$0.lambda$searchDialogs$3(this.f$1);
                break;
            default:
                this.f$0.lambda$searchDialogs$2(this.f$1);
                break;
        }
    }
}
