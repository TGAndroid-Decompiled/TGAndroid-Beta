package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f32721a;
    public final UserInfoActivity f32722b;

    public ch1(UserInfoActivity userInfoActivity, int i10) {
        this.f32721a = i10;
        this.f32722b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f32721a) {
            case 0:
                this.f32722b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.n61 n61Var = this.f32722b.f31895y;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f32722b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f32722b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
