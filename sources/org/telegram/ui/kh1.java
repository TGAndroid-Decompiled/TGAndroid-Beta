package org.telegram.ui;
public final class kh1 implements Runnable {
    public final int f38070a;
    public final UserInfoActivity f38071b;

    public kh1(UserInfoActivity userInfoActivity, int i10) {
        this.f38070a = i10;
        this.f38071b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f38070a) {
            case 0:
                this.f38071b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.x51 x51Var = this.f38071b.f34235x;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f38071b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f38071b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
