package org.telegram.ui;

import org.telegram.ui.Components.UniversalFragment;

public final class UserInfoActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final UserInfoActivity f$0;

    public UserInfoActivity$$ExternalSyntheticLambda0(UserInfoActivity userInfoActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                UserInfoActivity userInfoActivity = this.f$0;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(9, true));
                break;
            case 1:
                UniversalFragment.AnonymousClass3 anonymousClass3 = this.f$0.listView;
                if (anonymousClass3 != null) {
                    anonymousClass3.adapter.update(true);
                }
                break;
            case 2:
                UserInfoActivity userInfoActivity2 = this.f$0;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PrivacyControlActivity(11, false));
                break;
            default:
                UserInfoActivity userInfoActivity3 = this.f$0;
                userInfoActivity3.getClass();
                userInfoActivity3.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                break;
        }
    }
}
