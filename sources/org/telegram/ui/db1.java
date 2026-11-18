package org.telegram.ui;
public final class db1 implements Runnable {
    public final int f46853a;
    public final UserInfoActivity f46854b;

    public db1(UserInfoActivity userInfoActivity, int i7) {
        this.f46853a = i7;
        this.f46854b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f46853a) {
            case 0:
                this.f46854b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                bi.c6 c6Var = this.f46854b.f43893y;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f46854b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f46854b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
