package org.telegram.ui;
public final class eh1 implements Runnable {
    public final int f36030a;
    public final UserInfoActivity f36031b;

    public eh1(UserInfoActivity userInfoActivity, int i10) {
        this.f36030a = i10;
        this.f36031b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f36030a) {
            case 0:
                this.f36031b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.w61 w61Var = this.f36031b.f34582y;
                if (w61Var != null) {
                    w61Var.f25245f3.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f36031b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f36031b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
