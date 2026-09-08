package org.telegram.ui;
public final class kh1 implements Runnable {
    public final int f38097a;
    public final UserInfoActivity f38098b;

    public kh1(UserInfoActivity userInfoActivity, int i10) {
        this.f38097a = i10;
        this.f38098b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f38097a) {
            case 0:
                this.f38098b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.x51 x51Var = this.f38098b.f34262x;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f38098b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f38098b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
