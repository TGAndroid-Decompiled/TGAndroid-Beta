package org.telegram.ui;
public final class jh1 implements Runnable {
    public final int f34908a;
    public final UserInfoActivity f34909b;

    public jh1(UserInfoActivity userInfoActivity, int i10) {
        this.f34908a = i10;
        this.f34909b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f34908a) {
            case 0:
                this.f34909b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.y51 y51Var = this.f34909b.f31607y;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f34909b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f34909b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
