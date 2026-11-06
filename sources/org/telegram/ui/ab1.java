package org.telegram.ui;
public final class ab1 implements Runnable {
    public final int f43591a;
    public final UserInfoActivity f43592b;

    public ab1(UserInfoActivity userInfoActivity, int i7) {
        this.f43591a = i7;
        this.f43592b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f43591a) {
            case 0:
                this.f43592b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                fi.w3 w3Var = this.f43592b.f42045y;
                if (w3Var != null) {
                    w3Var.f35167f3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f43592b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f43592b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
