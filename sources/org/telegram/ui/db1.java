package org.telegram.ui;
public final class db1 implements Runnable {
    public final int f46910a;
    public final UserInfoActivity f46911b;

    public db1(UserInfoActivity userInfoActivity, int i7) {
        this.f46910a = i7;
        this.f46911b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f46910a) {
            case 0:
                this.f46911b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                bi.g6 g6Var = this.f46911b.f43934y;
                if (g6Var != null) {
                    g6Var.f35796g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f46911b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f46911b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
