package org.telegram.ui;
public final class lh1 implements Runnable {
    public final int f39581a;
    public final UserInfoActivity f39582b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f39581a = i10;
        this.f39582b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39581a) {
            case 0:
                this.f39582b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.e71 e71Var = this.f39582b.f34590x;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39582b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39582b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
