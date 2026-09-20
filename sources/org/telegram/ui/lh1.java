package org.telegram.ui;
public final class lh1 implements Runnable {
    public final int f35451a;
    public final UserInfoActivity f35452b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f35451a = i10;
        this.f35452b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f35451a) {
            case 0:
                this.f35452b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.m61 m61Var = this.f35452b.f31891y;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f35452b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f35452b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
