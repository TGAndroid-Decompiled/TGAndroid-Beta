package org.telegram.ui;
public final class nh1 implements Runnable {
    public final int f40421a;
    public final UserInfoActivity f40422b;

    public nh1(UserInfoActivity userInfoActivity, int i10) {
        this.f40421a = i10;
        this.f40422b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f40421a) {
            case 0:
                this.f40422b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.j71 j71Var = this.f40422b.f34427x;
                if (j71Var != null) {
                    j71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f40422b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f40422b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
