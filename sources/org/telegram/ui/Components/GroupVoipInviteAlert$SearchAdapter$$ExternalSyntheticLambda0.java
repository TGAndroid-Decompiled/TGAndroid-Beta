package org.telegram.ui.Components;

public final class GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final GroupVoipInviteAlert.SearchAdapter f$0;
    public final String f$1;
    public final int f$2;

    public GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0(GroupVoipInviteAlert.SearchAdapter searchAdapter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = searchAdapter;
        this.f$1 = str;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchUsers$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processSearch$2(this.f$1, this.f$2);
                break;
        }
    }
}
