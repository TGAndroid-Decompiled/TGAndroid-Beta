package org.telegram.ui;
public final class ig1 implements Runnable {
    public final int f40173a;
    public final UserInfoActivity f40174b;

    public ig1(UserInfoActivity userInfoActivity, int i10) {
        this.f40173a = i10;
        this.f40174b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f40173a) {
            case 0:
                this.f40174b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.m71 m71Var = this.f40174b.f36344x;
                if (m71Var != null) {
                    m71Var.f32504g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f40174b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f40174b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
