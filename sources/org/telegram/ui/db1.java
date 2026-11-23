package org.telegram.ui;
public final class db1 implements Runnable {
    public final int f46913a;
    public final UserInfoActivity f46914b;

    public db1(UserInfoActivity userInfoActivity, int i7) {
        this.f46913a = i7;
        this.f46914b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f46913a) {
            case 0:
                this.f46914b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                bi.f6 f6Var = this.f46914b.f43938y;
                if (f6Var != null) {
                    f6Var.f35790g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f46914b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f46914b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
