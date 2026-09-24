package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f32714a;
    public final UserInfoActivity f32715b;

    public ch1(UserInfoActivity userInfoActivity, int i10) {
        this.f32714a = i10;
        this.f32715b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f32714a) {
            case 0:
                this.f32715b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.l61 l61Var = this.f32715b.f31878x;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f32715b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f32715b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
