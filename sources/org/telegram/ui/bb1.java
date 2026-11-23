package org.telegram.ui;
public final class bb1 implements Runnable {
    public final int f46004a;
    public final UserInfoActivity f46005b;

    public bb1(UserInfoActivity userInfoActivity, int i7) {
        this.f46004a = i7;
        this.f46005b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f46004a) {
            case 0:
                this.f46005b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                bi.i6 i6Var = this.f46005b.f44019y;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f46005b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f46005b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
