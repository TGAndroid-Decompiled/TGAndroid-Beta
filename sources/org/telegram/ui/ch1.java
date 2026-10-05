package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f35466a;
    public final UserInfoActivity f35467b;

    public ch1(UserInfoActivity userInfoActivity, int i10) {
        this.f35466a = i10;
        this.f35467b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35466a) {
            case 0:
                this.f35467b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.y61 y61Var = this.f35467b.f34601y;
                if (y61Var != null) {
                    y61Var.f26034f3.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35467b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35467b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
