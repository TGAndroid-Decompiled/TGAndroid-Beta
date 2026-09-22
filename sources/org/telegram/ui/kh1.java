package org.telegram.ui;
public final class kh1 implements Runnable {
    public final int f35163a;
    public final UserInfoActivity f35164b;

    public kh1(UserInfoActivity userInfoActivity, int i10) {
        this.f35163a = i10;
        this.f35164b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35163a) {
            case 0:
                this.f35164b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.y51 y51Var = this.f35164b.f31603x;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35164b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35164b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
