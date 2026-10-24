package org.telegram.ui;
public final class dg1 implements Runnable {
    public final int f36625a;
    public final UserInfoActivity f36626b;

    public dg1(UserInfoActivity userInfoActivity, int i10) {
        this.f36625a = i10;
        this.f36626b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f36625a) {
            case 0:
                this.f36626b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.c71 c71Var = this.f36626b.f34258y;
                if (c71Var != null) {
                    c71Var.Z2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f36626b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f36626b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
