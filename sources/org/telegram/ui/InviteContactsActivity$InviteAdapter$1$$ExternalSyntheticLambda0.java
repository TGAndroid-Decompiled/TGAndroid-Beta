package org.telegram.ui;

public final class InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final InviteContactsActivity.InviteAdapter.AnonymousClass1 f$0;
    public final String f$1;

    public InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0(InviteContactsActivity.InviteAdapter.AnonymousClass1 anonymousClass1, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$run$1(this.f$1);
                break;
            default:
                this.f$0.lambda$run$0(this.f$1);
                break;
        }
    }
}
