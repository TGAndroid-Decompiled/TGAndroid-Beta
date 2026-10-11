package org.telegram.ui;
public final class kh1 implements Runnable {
    public final int f39341a;
    public final UserInfoActivity f39342b;

    public kh1(UserInfoActivity userInfoActivity, int i10) {
        this.f39341a = i10;
        this.f39342b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39341a) {
            case 0:
                this.f39342b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.g71 g71Var = this.f39342b.f34618x;
                if (g71Var != null) {
                    g71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39342b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39342b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
