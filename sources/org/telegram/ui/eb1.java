package org.telegram.ui;
public final class eb1 implements Runnable {
    public final int f45226a;
    public final UserInfoActivity f45227b;

    public eb1(UserInfoActivity userInfoActivity, int i7) {
        this.f45226a = i7;
        this.f45227b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f45226a) {
            case 0:
                this.f45227b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                fi.w3 w3Var = this.f45227b.f42071y;
                if (w3Var != null) {
                    w3Var.f37496f3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f45227b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f45227b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
