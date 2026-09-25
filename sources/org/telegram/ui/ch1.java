package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f32729a;
    public final UserInfoActivity f32730b;

    public ch1(UserInfoActivity userInfoActivity, int i10) {
        this.f32729a = i10;
        this.f32730b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f32729a) {
            case 0:
                this.f32730b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.l61 l61Var = this.f32730b.f31893x;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f32730b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f32730b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
