package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f32816a;
    public final UserInfoActivity f32817b;

    public ch1(UserInfoActivity userInfoActivity, int i10) {
        this.f32816a = i10;
        this.f32817b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f32816a) {
            case 0:
                this.f32817b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.o61 o61Var = this.f32817b.f31966x;
                if (o61Var != null) {
                    o61Var.f28778f3.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f32817b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f32817b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
