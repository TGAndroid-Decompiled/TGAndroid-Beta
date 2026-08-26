package org.telegram.ui.Delegates;

public final class MemberRequestsDelegate$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final MemberRequestsDelegate f$0;

    public MemberRequestsDelegate$$ExternalSyntheticLambda2(MemberRequestsDelegate memberRequestsDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = memberRequestsDelegate;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.loadMembers();
                break;
            case 1:
                MemberRequestsDelegate.setViewVisible(this.f$0.loadingView, true, true);
                break;
            default:
                this.f$0.loadMembers();
                break;
        }
    }
}
