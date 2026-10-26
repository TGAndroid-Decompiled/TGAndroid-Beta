package org.telegram.ui;
public final class gg1 implements Runnable {
    public final int f39683a;
    public final UserInfoActivity f39684b;

    public gg1(UserInfoActivity userInfoActivity, int i10) {
        this.f39683a = i10;
        this.f39684b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39683a) {
            case 0:
                this.f39684b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.l71 l71Var = this.f39684b.f36320x;
                if (l71Var != null) {
                    l71Var.f32152g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39684b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39684b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
