package org.telegram.ui.Components;

public final class SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout.GroupUsersSearchAdapter f$0;
    public final String f$1;

    public SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1(SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = groupUsersSearchAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$search$1(this.f$1);
                break;
            default:
                this.f$0.lambda$processSearch$3(this.f$1);
                break;
        }
    }
}
