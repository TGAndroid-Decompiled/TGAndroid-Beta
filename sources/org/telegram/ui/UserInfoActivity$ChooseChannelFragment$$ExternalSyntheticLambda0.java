package org.telegram.ui;

import org.telegram.ui.Components.UniversalFragment;

public final class UserInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final UserInfoActivity.ChooseChannelFragment f$0;

    public UserInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0(UserInfoActivity.ChooseChannelFragment chooseChannelFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = chooseChannelFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                UniversalFragment.AnonymousClass3 anonymousClass3 = this.f$0.listView;
                if (anonymousClass3 != null) {
                    anonymousClass3.adapter.update(true);
                }
                break;
            default:
                UniversalFragment.AnonymousClass3 anonymousClass4 = this.f$0.listView;
                if (anonymousClass4 != null) {
                    anonymousClass4.adapter.update(true);
                }
                break;
        }
    }
}
