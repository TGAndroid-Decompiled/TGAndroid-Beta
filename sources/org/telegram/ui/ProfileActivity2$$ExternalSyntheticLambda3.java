package org.telegram.ui;

public final class ProfileActivity2$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity2 f$0;

    public ProfileActivity2$$ExternalSyntheticLambda3(ProfileActivity2 profileActivity2, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0();
                break;
            default:
                this.f$0.updateScrollLayout();
                break;
        }
    }
}
