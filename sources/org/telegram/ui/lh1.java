package org.telegram.ui;
public final class lh1 implements Runnable {
    public final int f35557a;
    public final UserInfoActivity f35558b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f35557a = i10;
        this.f35558b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35557a) {
            case 0:
                this.f35558b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.z51 z51Var = this.f35558b.f31624y;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35558b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35558b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
