package org.telegram.ui;
public final class lh1 implements Runnable {
    public final int f39627a;
    public final UserInfoActivity f39628b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f39627a = i10;
        this.f39628b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39627a) {
            case 0:
                this.f39628b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.f71 f71Var = this.f39628b.f34628x;
                if (f71Var != null) {
                    f71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39628b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39628b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
