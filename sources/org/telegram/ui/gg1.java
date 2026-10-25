package org.telegram.ui;
public final class gg1 implements Runnable {
    public final int f39680a;
    public final UserInfoActivity f39681b;

    public gg1(UserInfoActivity userInfoActivity, int i10) {
        this.f39680a = i10;
        this.f39681b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39680a) {
            case 0:
                this.f39681b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.l71 l71Var = this.f39681b.f36317x;
                if (l71Var != null) {
                    l71Var.f32150g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39681b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39681b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
