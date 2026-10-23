package org.telegram.ui;
public final class eg1 implements Runnable {
    public final int f36966a;
    public final UserInfoActivity f36967b;

    public eg1(UserInfoActivity userInfoActivity, int i10) {
        this.f36966a = i10;
        this.f36967b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f36966a) {
            case 0:
                this.f36967b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.d71 d71Var = this.f36967b.f34256y;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f36967b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f36967b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
