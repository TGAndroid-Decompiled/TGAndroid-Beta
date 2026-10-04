package org.telegram.ui;
public final class eh1 implements Runnable {
    public final int f36035a;
    public final UserInfoActivity f36036b;

    public eh1(UserInfoActivity userInfoActivity, int i10) {
        this.f36035a = i10;
        this.f36036b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f36035a) {
            case 0:
                this.f36036b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.w61 w61Var = this.f36036b.f34588y;
                if (w61Var != null) {
                    w61Var.f25250f3.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f36036b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f36036b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
