package org.telegram.ui;
public final class bb1 implements Runnable {
    public final int f44245a;
    public final UserInfoActivity f44246b;

    public bb1(UserInfoActivity userInfoActivity, int i7) {
        this.f44245a = i7;
        this.f44246b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f44245a) {
            case 0:
                this.f44246b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                fi.w3 w3Var = this.f44246b.f42073y;
                if (w3Var != null) {
                    w3Var.f37190f3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f44246b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f44246b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
