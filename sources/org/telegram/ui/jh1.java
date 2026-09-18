package org.telegram.ui;
public final class jh1 implements Runnable {
    public final int f34883a;
    public final UserInfoActivity f34884b;

    public jh1(UserInfoActivity userInfoActivity, int i10) {
        this.f34883a = i10;
        this.f34884b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f34883a) {
            case 0:
                this.f34884b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.n61 n61Var = this.f34884b.f31851y;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f34884b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f34884b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
