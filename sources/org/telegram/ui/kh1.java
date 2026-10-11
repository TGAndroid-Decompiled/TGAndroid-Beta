package org.telegram.ui;
public final class kh1 implements Runnable {
    public final int f39375a;
    public final UserInfoActivity f39376b;

    public kh1(UserInfoActivity userInfoActivity, int i10) {
        this.f39375a = i10;
        this.f39376b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39375a) {
            case 0:
                this.f39376b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.f71 f71Var = this.f39376b.f34652x;
                if (f71Var != null) {
                    f71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39376b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39376b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
