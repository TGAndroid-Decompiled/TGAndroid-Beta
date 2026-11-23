package org.telegram.ui;
public final class db1 implements Runnable {
    public final int f46873a;
    public final UserInfoActivity f46874b;

    public db1(UserInfoActivity userInfoActivity, int i7) {
        this.f46873a = i7;
        this.f46874b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f46873a) {
            case 0:
                this.f46874b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                bi.i6 i6Var = this.f46874b.f43903y;
                if (i6Var != null) {
                    i6Var.f35742g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f46874b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f46874b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
