package org.telegram.ui;

public final class UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final UsersSelectActivity.GroupCreateAdapter f$0;
    public final String f$1;
    public final boolean f$2;
    public final boolean f$3;

    public UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(UsersSelectActivity.GroupCreateAdapter groupCreateAdapter, String str, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateAdapter;
        this.f$1 = str;
        this.f$2 = z;
        this.f$3 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchDialogs$3(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$searchDialogs$1(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$searchDialogs$2(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
