package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f32727a;
    public final UserInfoActivity f32728b;

    public ch1(UserInfoActivity userInfoActivity, int i10) {
        this.f32727a = i10;
        this.f32728b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f32727a) {
            case 0:
                this.f32728b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.m61 m61Var = this.f32728b.f31891x;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f32728b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f32728b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
