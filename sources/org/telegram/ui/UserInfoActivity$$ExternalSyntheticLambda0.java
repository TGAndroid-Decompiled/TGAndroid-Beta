package org.telegram.ui;

public final class UserInfoActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final UserInfoActivity f$0;

    public UserInfoActivity$$ExternalSyntheticLambda0(UserInfoActivity userInfoActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.openBioSettings();
                break;
            case 1:
                this.f$0.lambda$fillItems$1();
                break;
            case 2:
                this.f$0.lambda$fillItems$2();
                break;
            default:
                this.f$0.lambda$onResume$5();
                break;
        }
    }
}
