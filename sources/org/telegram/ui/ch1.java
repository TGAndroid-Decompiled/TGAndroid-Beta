package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f32354a;
    public final UserInfoActivity f32355b;

    public ch1(UserInfoActivity userInfoActivity, int i10) {
        this.f32354a = i10;
        this.f32355b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f32354a) {
            case 0:
                this.f32355b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.x51 x51Var = this.f32355b.f31577x;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f32355b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f32355b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
