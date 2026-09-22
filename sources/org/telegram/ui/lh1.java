package org.telegram.ui;
public final class lh1 implements Runnable {
    public final int f35469a;
    public final UserInfoActivity f35470b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f35469a = i10;
        this.f35470b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35469a) {
            case 0:
                this.f35470b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.o61 o61Var = this.f35470b.f31912y;
                if (o61Var != null) {
                    o61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35470b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35470b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
