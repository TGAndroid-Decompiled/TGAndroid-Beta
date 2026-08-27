package org.telegram.ui;

public final class cg1 implements Runnable {

    public final int f37089a;

    public final UserInfoActivity f37090b;

    public cg1(UserInfoActivity userInfoActivity, int i10) {
        this.f37089a = i10;
        this.f37090b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f37089a) {
            case 0:
                this.f37090b.presentFragment(new PrivacyControlActivity(9, true));
                break;
            case 1:
                org.telegram.ui.Components.e51 e51Var = this.f37090b.f36286x;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                }
                break;
            case 2:
                UserInfoActivity userInfoActivity = this.f37090b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                break;
            default:
                UserInfoActivity userInfoActivity2 = this.f37090b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                break;
        }
    }
}
