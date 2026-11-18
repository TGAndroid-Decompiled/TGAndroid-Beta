package org.telegram.ui;
public final class db1 implements Runnable {
    public final int f46909a;
    public final UserInfoActivity f46910b;

    public db1(UserInfoActivity userInfoActivity, int i7) {
        this.f46909a = i7;
        this.f46910b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f46909a) {
            case 0:
                this.f46910b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                bi.d6 d6Var = this.f46910b.f43893y;
                if (d6Var != null) {
                    d6Var.f34607g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f46910b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f46910b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
