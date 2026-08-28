package org.telegram.ui;
public final class dg1 implements Runnable {
    public final int f37538a;
    public final UserInfoActivity f37539b;

    public dg1(UserInfoActivity userInfoActivity, int i9) {
        this.f37538a = i9;
        this.f37539b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f37538a) {
            case 0:
                this.f37539b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.c51 c51Var = this.f37539b.f36283x;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f37539b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f37539b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
