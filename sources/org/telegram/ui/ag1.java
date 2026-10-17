package org.telegram.ui;
public final class ag1 implements Runnable {
    public final int f35431a;
    public final UserInfoActivity f35432b;

    public ag1(UserInfoActivity userInfoActivity, int i10) {
        this.f35431a = i10;
        this.f35432b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35431a) {
            case 0:
                this.f35432b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.u61 u61Var = this.f35432b.f33939x;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35432b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35432b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
