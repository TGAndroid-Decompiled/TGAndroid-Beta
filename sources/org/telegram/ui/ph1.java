package org.telegram.ui;
public final class ph1 implements Runnable {
    public final int f35842a;
    public final UserInfoActivity f35843b;

    public ph1(UserInfoActivity userInfoActivity, int i10) {
        this.f35842a = i10;
        this.f35843b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35842a) {
            case 0:
                this.f35843b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.l61 l61Var = this.f35843b.f30718x;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35843b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35843b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
