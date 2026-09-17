package org.telegram.ui;
public final class lh1 implements Runnable {
    public final int f35552a;
    public final UserInfoActivity f35553b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f35552a = i10;
        this.f35553b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35552a) {
            case 0:
                this.f35553b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.z51 z51Var = this.f35553b.f31620y;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35553b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35553b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
