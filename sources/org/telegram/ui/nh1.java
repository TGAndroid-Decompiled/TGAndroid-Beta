package org.telegram.ui;
public final class nh1 implements Runnable {
    public final int f40424a;
    public final UserInfoActivity f40425b;

    public nh1(UserInfoActivity userInfoActivity, int i10) {
        this.f40424a = i10;
        this.f40425b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f40424a) {
            case 0:
                this.f40425b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.j71 j71Var = this.f40425b.f34429x;
                if (j71Var != null) {
                    j71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f40425b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f40425b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
