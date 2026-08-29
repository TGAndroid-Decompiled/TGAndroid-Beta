package org.telegram.ui;
public final class fg1 implements Runnable {
    public final int f38176a;
    public final UserInfoActivity f38177b;

    public fg1(UserInfoActivity userInfoActivity, int i10) {
        this.f38176a = i10;
        this.f38177b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f38176a) {
            case 0:
                this.f38177b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.o51 o51Var = this.f38177b.f36348x;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f38177b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f38177b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
